package Grammar;

import Compiladores.FunctionSymbol;
import Compiladores.Scope;
import Compiladores.StructSymbol;
import Compiladores.Symbol;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class TypeChecker extends IntepreterBaseListener {
    public int nmr_erros;
    public String str_erros;
    private Token defineMultipleData;

    private Scope globalScope;
    private Scope currentScope;
    private Scope structScope;
    private Scope currentStructScope;

    private ArrayList<Scope> structScopes;
    //private ArrayList<Scope> functionScopes;

    private boolean mainDefined;
    private FunctionSymbol currentFunction;
    private FunctionSymbol defineFunction;

    void addError(Token token, String error){
        this.nmr_erros++;
        this.str_erros += "line " + token.getLine() + ":" + token.getCharPositionInLine() + " error: " + error + "\n";
    }

    //===================================================================//
    //||                                                               ||//
    //||                             IMPLEMENTADO                      ||//
    //||                                                               ||//
    //===================================================================//
    private FunctionSymbol currentCallFunction = null;
    private Token callFunction = null;
    @Override   //Verificar se os argumentos correspondem
    public void enterCall_function(IntepreterParser.Call_functionContext ctx) {
        Symbol var = this.globalScope.resolve(ctx.start.getText());
        if(var == null)
            var = this.currentScope.resolve(ctx.start.getText());
        callFunction = ctx.start;
        if(var == null)
            addError(ctx.start, ctx.IDENTIFIER_().getText() + "() is not declared");
        else if(var instanceof FunctionSymbol)
            this.currentCallFunction = (FunctionSymbol) var;
        else if(var instanceof StructSymbol)
            addError(ctx.start, var.name + "() is a struct type, not a function");
        else
            addError(ctx.start, var.name + "() is a variable, not a function");
    }
    @Override
    public void exitCall_function(IntepreterParser.Call_functionContext ctx) {
        this.currentCallFunction = null;
    }
    @Override
    public void enterArguments_call_function(IntepreterParser.Arguments_call_functionContext ctx) {
        if(this.currentCallFunction == null)
            return;
        int nmr_args = this.currentCallFunction.arguments == null ? 0 : this.currentCallFunction.arguments.size();
        int nmr_args_receive = ctx.operation().size();
        if(nmr_args != nmr_args_receive)
            addError(callFunction, this.currentCallFunction.name + "() has " + nmr_args + " arguments, not  " + nmr_args_receive);
        else{
            for (int i = 0; i < nmr_args; i++) {
                String type_send = getOperationType(ctx.operation(i));
                Symbol expected_receive = this.currentCallFunction.arguments.get(i);
                boolean isPrimitiveFunction = currentCallFunction.name.equals("write") || currentCallFunction.name.equals("writeln") || currentCallFunction.name.equals("read");
                if( isPrimitiveFunction && (!type_send.equals("int") && !type_send.equals("real") && !type_send.equals("string") && !type_send.equals("bool")))
                    addError(ctx.operation(i).start, "actual parameter '" + ctx.operation(i).getText() + "' does not have a primitive type");
                else if(expected_receive.isPointer && ctx.operation(i).data_acess() == null)
                    addError(ctx.operation(i).start, "actual parameter '" + ctx.operation(i).getText() + "' is not a variable");
                else if(!type_send.equals(expected_receive.type) && !expected_receive.type.equals("void")){
                    addError(ctx.operation(i).start, "actual paremeter '" + ctx.operation(i).getText() +"' is not of type " + expected_receive.type);
                }
            }
        }
    }
    @Override   //Verificar se a operação é do mesmo tipo que a variavel
    public void enterValue_attr_data(IntepreterParser.Value_attr_dataContext ctx) {
        Symbol typeVar = ctx.data_acess() != null ? this.currentScope.resolve(ctx.data_acess().IDENTIFIER_().getText()) : this.currentScope.resolve(ctx.define_single_data().defining_data().IDENTIFIER_().getText());
        String opType =  getOperationType(ctx.operation());

        if(typeVar == null || opType == null || typeVar instanceof FunctionSymbol || typeVar instanceof StructSymbol)
            return;

        String actualTypeVar = getVariableType(ctx.data_acess(), this.currentScope);
        if(actualTypeVar == null)
            return;
        if(opType.charAt(0) != '3' && (!actualTypeVar.equals(opType) ) )
            addError(ctx.operation().start, "cannot assign " + opType + " to " + actualTypeVar);
    }
    @Override   //Verificar se a operação é boolean o resultado
    public void enterStatement_if(IntepreterParser.Statement_ifContext ctx) {
        String opType = getOperationType(ctx.operation());
        if(!opType.equals("bool"))
            addError(ctx.operation().start, "if condition expects bool got " + opType + " at " + ctx.operation().getText());
    }
    @Override
    public void exitStatement_if(IntepreterParser.Statement_ifContext ctx) {
        boolean allConstainsReturn = true;
        for( IntepreterParser.InstructionContext i : ctx.instruction() ){
            if(!containsReturn(i)){
                allConstainsReturn = false;
                break;
            }
        }
        this.currentScope.hasReturn = allConstainsReturn && ctx.ELSE_() != null;
    }

    @Override   //Verificar se a operação é boolean
    public void enterStatement_while(IntepreterParser.Statement_whileContext ctx) {
        String opType = getOperationType(ctx.operation());
        if(!"bool".equals( opType ))
            addError(ctx.operation().start, "while cicle expects bool got " + opType + " at " + ctx.operation().getText());
    }

    @Override
    public void exitData_acess(IntepreterParser.Data_acessContext ctx) {
        currentStructScope = null;
    }

    @Override   //Feito
    public void enterData_acess(IntepreterParser.Data_acessContext ctx) {

        Symbol data_access;
        if(ctx.parent instanceof IntepreterParser.Struct_acessContext) {
            if(currentStructScope == null)
                return;
            data_access = this.currentStructScope.resolve(ctx.IDENTIFIER_().getText());
            this.currentStructScope = null;
            if(data_access == null)
                return;
        }
        else {
            data_access = this.currentScope.resolve(ctx.IDENTIFIER_().getText());
        }
        //é uma função e não variavel
        if(data_access == null){
            addError(ctx.start, ctx.start.getText() + " is not declared");
        }
        //Não existe
        else if(data_access instanceof FunctionSymbol || data_access instanceof StructSymbol) {
            addError(ctx.start, ctx.start.getText() + " is not a variable");
        }
        //não é struct mas tenta aceder a um parametro de struct
        else if(ctx.struct_acess() != null && !data_access.isStruct){
           addError(ctx.stop, data_access.type + " is not a struct type");
        }
        //Se for array, se acede à dimensão correta
        else if(data_access.dimensionArray != ctx.array_acess().size()){
            if(ctx.array_acess().size() == 0)
                addError(ctx.start, data_access.name + " is an array");
            else if(data_access.dimensionArray == 0)
                addError(ctx.start, data_access.name + " is not an array");
            else
                addError(ctx.start, data_access.name + " is an array with " + data_access.dimensionArray + " dimension, not " + ctx.array_acess().size());
        }
        //é struct, tenta aceder a um parametro de struct mas esse não existe
        else if(ctx.struct_acess() != null && data_access.isStruct && data_access.structScope.resolve(ctx.struct_acess().data_acess().IDENTIFIER_().getText()) == null){
            addError(ctx.struct_acess().data_acess().start, ctx.struct_acess().data_acess().IDENTIFIER_().getText() +" is not a member of " + data_access.type);
        }

        if(data_access != null)
            this.currentStructScope = data_access.structScope;
    }

    @Override  
    public void enterDefining_data(IntepreterParser.Defining_dataContext ctx) {
        String data_name = ctx.IDENTIFIER_().getText();

        if( globalScope.resolve(data_name) != null && (globalScope.resolve(data_name) instanceof FunctionSymbol || globalScope.resolve(data_name) instanceof StructSymbol) )
            return;

        String data_type = this.defineMultipleData.getText();
        Symbol definedSingle = new Symbol(data_type, data_name);

        if(!ctx.POINTER_().isEmpty()) { //ver se é um pointer
            definedSingle.isPointer = true;
        }
        if(!ctx.array_acess().isEmpty()) {   //ver se é um array e de que dimensão
            definedSingle.isArray = true;
            definedSingle.dimensionArray = ctx.array_acess().size();
        }

        //Se for uma struct, se essa struct existe
        if(definedSingle.isStruct){
            for (Scope i: this.structScopes) {
                if(i.name.equals(data_type)){
                    definedSingle.structScope = i;
                    break;
                }
            }
            if(definedSingle.structScope == null){
                addError(this.defineMultipleData, "type " + data_type + " is not defined");
                definedSingle.structScope = new Scope(null);
            }
        }

        if(this.defineFunction != null){
            if(this.defineFunction.arguments.contains(definedSingle))
                addError(ctx.IDENTIFIER_().getSymbol(), "formar parameter " + data_name + " is defined more than once");
            else
                this.defineFunction.arguments.add(definedSingle);
        }
        else if(this.structScope != null){
            if(!this.structScope.define(definedSingle))
                addError(ctx.IDENTIFIER_().getSymbol(), data_name + " is already defined in structure " + this.structScope.name);
        }
        else if(!this.currentScope.define(definedSingle)){
            addError(ctx.IDENTIFIER_().getSymbol(), data_name + " is already defined");
        }
    }

    @Override   //Feito
    public void exitDefine_multiple_data(IntepreterParser.Define_multiple_dataContext ctx) {
        this.defineMultipleData = null;
    }

    @Override   //Feito
    public void enterDefine_single_data(IntepreterParser.Define_single_dataContext ctx) {
        this.defineMultipleData = ctx.start;
    }

    @Override   //Feito - iniciliza variaveis - adicionar coisas aqui se forem adicionadas mais variaveis
    public void enterStart(IntepreterParser.StartContext ctx) {
        this.defineFunction = null;
        this.str_erros = "";
        this.nmr_erros = 0;
        this.structScopes = new ArrayList<>();
        this.globalScope = new Scope(null);
        FunctionSymbol temp = new FunctionSymbol("void", "read");
        Symbol temp2 = new Symbol("void", "a");
        temp2.isPointer = true;
        temp.arguments.add(temp2);
        this.globalScope.define( temp );

        temp = new FunctionSymbol("void", "write");
        temp2 = new Symbol("void", "a");
        temp.arguments.add(temp2);
        this.globalScope.define( temp );

        temp = new FunctionSymbol("void", "writeln");
        temp2 = new Symbol("void", "a");
        temp.arguments.add(temp2);
        this.globalScope.define( temp );
        //declarar logo todas as func ??
        //declarar logo todas as structs ??
        this.currentScope = this.globalScope;
        this.mainDefined = false;
        this.defineMultipleData = null;
    }

    @Override   //Feito
    public void exitStart(IntepreterParser.StartContext ctx) {
        this.currentScope = null;
        if(!this.mainDefined){
            addError(ctx.stop, "function main() is not defined");
        }
    }

    @Override   //Feito - Pode ser alterado por causa dos ciclos (While/For)
    public void enterCodeblock(IntepreterParser.CodeblockContext ctx) {
        if(this.structScope != null)
            return;
        this.currentScope = new Scope(this.currentScope);
        if(this.currentFunction != null)
            for (Symbol i: this.currentFunction.arguments) {
                this.currentScope.define(i);
            }
        //this.currentFunction = null;
    }

    private Scope checkReturn = null;
    @Override   //Feito
    public void exitCodeblock(IntepreterParser.CodeblockContext ctx) {
        this.checkReturn = this.currentScope;
        this.currentScope = this.currentScope.getParentScope();
    }

    @Override   //Feito
    public void enterDefine_function(IntepreterParser.Define_functionContext ctx) {
        this.defineFunction = new FunctionSymbol(ctx.start.getText(), ctx.IDENTIFIER_(ctx.IDENTIFIER_().size()-1).getText());
        this.currentFunction = this.defineFunction;
        if("main".equals(this.defineFunction.name))
            this.mainDefined = true;
    }

    @Override   //Falta ver se tem um return e se o return corresponde ao tipo de função
    public void exitDefine_function(IntepreterParser.Define_functionContext ctx) {
        if(!this.checkReturn.hasReturn && !this.currentFunction.type.equals("void"))
            addError(ctx.stop, "missing return in function " + this.currentFunction.name);
        this.currentFunction = null;
    }

    @Override   //Feito
    public void exitArguments_define_function(IntepreterParser.Arguments_define_functionContext ctx) {
        if(!this.globalScope.define(this.defineFunction)){
            addError(ctx.start, this.defineFunction.name + "() is already defined");
        }
        this.defineFunction = null;
    }

    @Override   //Feito
    public void exitDefine_struct(IntepreterParser.Define_structContext ctx) {
        this.structScopes.add(this.structScope);
        this.structScope = null;
    }

    @Override   //Feito
    public void enterDefine_struct(IntepreterParser.Define_structContext ctx) {
        this.globalScope.define(new StructSymbol(ctx.IDENTIFIER_().getText(), ctx.IDENTIFIER_().getText()));
        this.structScope = new Scope(null);
        this.structScope.name = ctx.IDENTIFIER_().getText();
    }

    @Override   //Verificar se a operação corresponde a um inteiro
    public void enterArray_acess(IntepreterParser.Array_acessContext ctx) {
        String opType = getOperationType(ctx.operation());
        if(opType == null || !opType.equals("int"))
            addError(ctx.operation().start, "'" + ctx.operation().getText() + "' is not of type int");
    }

    @Override   //Guardar o return no scope como symbol (mesmo se for um literal para typechecking)
    public void enterStatement_return(IntepreterParser.Statement_returnContext ctx) {
        String funcType = this.currentFunction.type;
        System.out.println(this.currentFunction);

        String returnType = ctx.operation() != null ? getOperationType(ctx.operation()) : "void";

        if(returnType == null)
            addError(ctx.stop, "return in function " + this.currentFunction.name + " is not of known type");
        else if(returnType.equals("int") && funcType.equals("real")) {
        }
        else if(returnType.equals("void") && !funcType.equals("void"))
            addError(ctx.stop, this.currentFunction.name + " missing return value");
        else if(!returnType.equals("void") && funcType.equals("void"))
            addError(ctx.stop, this.currentFunction.name + " does not return a value");
        else if(!returnType.equals(funcType))
            addError(ctx.stop, this.currentFunction.name +" should return a value of type " + funcType + ", not " + returnType);
        this.currentScope.hasReturn = true;
    }
    @Override   //Adicionar variavel ao scope do for, verificar se as operações são todas ints
    public void enterStatement_for(IntepreterParser.Statement_forContext ctx) {
        for (IntepreterParser.OperationContext i : ctx.operation()) {
            String opType = getOperationType(i);
            if (!"int".equals(opType))
                addError(i.start, "for cicle expects int got " + opType + " at " + i.getText());
        }
        if(  !"int".equals( getVariableType(ctx.value_attr_data().data_acess(), this.currentScope) ) )
            addError(ctx.value_attr_data().data_acess().start, ctx.value_attr_data().data_acess().IDENTIFIER_().getText() + " is not of type int" );
    }

    @Override   //Verificar se corresponde a operações válidas ( int + real | string + string | operações logicas com o mesmo tipo)
    public void enterOperation(IntepreterParser.OperationContext ctx) {
        String result = null;
        TerminalNode temp;

        if(ctx.literal() != null){
            result = literalToType(ctx.literal());
        }
        else if(ctx.call_function() != null){
            Symbol func = this.globalScope.resolve(ctx.start.getText());
            if(func != null)
                result = func.type;

        }
        else if(ctx.data_acess() != null){
            result = getVariableType(ctx.data_acess(), this.currentScope);
        }
        else if((ctx.LP_() != null ) && ctx.operation().size() == 1){
            result = getOperationType(ctx.operation(0));

        }
        else if(ctx.MINUS_() != null && ctx.operation().size() == 1){
            result = getOperationType(ctx.operation(0));
            if(result != null && !(result.equals("int") || result.equals("real")) ) {
                addError(ctx.stop, "unary operator - is invalid for type " + result);
                result = null;
            }
        }
        else if((temp = ctx.MULT_()) != null || (temp = ctx.DIV_()) != null || (temp = ctx.MINUS_()) != null){
            result = getOperationType(ctx.operation(0));
            //contas entre real e int, ficam sempre real
            if(result != null && !(result.equals("int") || result.equals("real"))) {
                if(getOperationType( ctx.operation(1) ) != null) {
                    addError(ctx.stop, "operator " + temp.getText() + " is invalid between " + result + " and " + getOperationType(ctx.operation(1)));
                }
                result = null;
            }
            else if(result != null && "real".equals( getOperationType( ctx.operation(1) ) ) ) {
                result = "real";
            }
        }
        else if ( ctx.REMAINDER_() != null ) {
            result = getOperationType(ctx.operation(0));
            //contas entre real e int, ficam sempre real
            System.out.println(result + "        " +  getOperationType(ctx.operation(1)));
            if(result != null && (!result.equals("int") || !result.equals( getOperationType(ctx.operation(1)) ))) {
                if(getOperationType( ctx.operation(1) ) != null) {
                    addError(ctx.stop, "operator % is invalid between " + result + " and " + getOperationType(ctx.operation(1)));
                }
                result = null;
            }
        }
        else if(ctx.PLUS_() != null){
            result = getOperationType(ctx.operation(0));
            String tempor = getOperationType(ctx.operation(1));
            if( result != null &&( result.equals("int") || result.equals("string") || result.equals("real") )
                    &&( tempor.equals("int") || tempor.equals("string") || tempor.equals("real") )){
                if(result.equals(tempor))
                    return;
                else if(tempor.equals("string") || result.equals("string"))
                    addError(ctx.stop, "operator + is invalid between " + result + " and " + tempor);
            }
            else if(result != null && tempor != null)
                addError(ctx.stop, "operator + is invalid between " + result + " and " + tempor);
        }
        else if((temp = ctx.LT_()) != null || (temp = ctx.LTE_()) != null || (temp = ctx.GT_()) != null || (temp = ctx.GTE_()) != null || (temp = ctx.NOT_()) != null
                || (temp = ctx.EQUAL_()) != null || (temp = ctx.NEQUAL_()) != null){
            result = getOperationType(ctx.operation(0));
            String tempor = getOperationType(ctx.operation(1));
            if(ctx.operation().size() != 1 && result != null && !(result.equals("bool") && tempor.equals("bool")) ) {
                if((ctx.EQUAL_() != null || ctx.NEQUAL_() != null) && tempor.equals(result))
                    return;
                if(!(( tempor.equals("int") || tempor.equals("real") ) && ( result.equals("int") || result.equals("real") ))) {
                    addError(ctx.stop, "operator '" + temp.getText() + "' is invalid between " + result + " and " + tempor);
                }
                result = null;
            }
            else if(ctx.NOT_() != null && !"bool".equals(result)){
                addError(ctx.stop, "unary operator 'not' is invalid for " + result);
                result = null;
            }
            else
                result = "bool";
        }
        else if((temp = ctx.OR_()) != null || (temp = ctx.AND_()) != null){
            result = getOperationType(ctx.operation(0));
            if(result != null && (!result.equals("bool") || !"bool".equals( getOperationType(ctx.operation(1)) ) )){
                addError(ctx.stop, "operator '" + temp.getText() + "' is invalid between " + result + " and " + getOperationType(ctx.operation(1)));
                result = null;
            }
        }
        if(result != null && result.equals("23232"))
            System.out.println("????");
    }
    //===================================================================//
    //||                                                               ||//
    //||                             RANDOM                            ||//
    //||                                                               ||//
    //===================================================================//

    private boolean containsReturn(IntepreterParser.InstructionContext ctx){
        if(ctx.statement_return() != null)
            return true;
        else if(ctx.codeblock() == null)
            return false;
        for( IntepreterParser.InstructionContext i : ctx.codeblock().instruction()){
            if(i.statement_return() != null)
                return true;
            else if(i.codeblock() != null)
                return containsReturn(i);
        }
        return false;
    }

    private String literalToType(IntepreterParser.LiteralContext ctx){
        String result = "int";
        if(ctx.BOOLVALUES_() != null)
            result = "bool";
        else if(ctx.DIGITS_() != null)
            result = "int";
        else if(ctx.NUMBER_() != null)
            result = "real";
        else if(ctx.STRING_VALUE_() != null)
            result = "string";
        return result;
    }

    private String getVariableType(IntepreterParser.Data_acessContext ctx, Scope scope){
        if(scope == null)
            return null;
        Symbol var = scope.resolve(ctx.start.getText());
        String result;
        if(var == null)
            return null;
        result = var.type;

        int dim = ctx.array_acess().size();

        if(dim != var.dimensionArray){
            result = '3' + result;
            if(ctx.struct_acess() != null)
                result = null;
        }
        else if(ctx.struct_acess() != null){
            result = getVariableType(ctx.struct_acess().data_acess(), var.structScope);
        }

        if( var.dimensionArray < dim){
            result = null;
        }
        return result;
    }

    private String getOperationType(IntepreterParser.OperationContext ctx){
        String result = null;
        if(ctx == null)
            return null;
        if(ctx.literal() != null){
            result = literalToType(ctx.literal());
        }
        else if(ctx.call_function() != null){
            Symbol func = this.globalScope.resolve(ctx.start.getText());
            if(func != null)
                result = func.type;

        }
        else if(ctx.data_acess() != null){
            result = getVariableType(ctx.data_acess(), this.currentScope);
        }
        else if(ctx.LP_() != null && ctx.operation().size() == 1){
            result = getOperationType(ctx.operation(0));

        }
        else if(ctx.MINUS_() != null && ctx.operation().size() == 1){
            result = getOperationType(ctx.operation(0));
            if(result != null && !(result.equals("int") || result.equals("real"))) {
                result = null;
            }
        }
        else if(ctx.MULT_() != null || ctx.DIV_() != null || ctx.MINUS_() != null){
            result = getOperationType(ctx.operation(0));
            //contas entre real e int, ficam sempre real
            if(result != null && !(result.equals("int") || result.equals("real"))) {
                result = null;
            }
            else if(result != null && "real".equals( getOperationType( ctx.operation(1) ) ) ) {
                result = "real";
            }
        }
        else if ( ctx.REMAINDER_() != null ) {
            result = getOperationType(ctx.operation(0));
            //contas entre real e int, ficam sempre real
            if(result != null && (!(result.equals("int")) || !result.equals( getOperationType(ctx.operation(1)) ))) {
                result = null;
            }
        }
        else if(ctx.PLUS_() != null){
            result = getOperationType(ctx.operation(0));
            String tempor = getOperationType(ctx.operation(1));
            if( result != null &&!( result.equals("int") || result.equals("string") || result.equals("real") ) )
                result = null;
            if(result != null && !( result.equals(getOperationType(ctx.operation(1)))  )   ){
                if(  tempor != null && (result.equals("int") || result.equals("real")) && (tempor.equals("int") || tempor.equals("real")) )
                    result = "real";
                else
                    result = null;
            }
        }
        else if(ctx.LT_() != null || ctx.LTE_() != null || ctx.GT_() != null || ctx.GTE_() != null || ctx.NOT_() != null
                || ctx.EQUAL_() != null || ctx.NEQUAL_() != null){
            result = getOperationType(ctx.operation(0));
            String tempor = getOperationType(ctx.operation(1));
            if(ctx.operation().size() != 1 && result != null && !result.equals(tempor)) {
                result = null;
            }
            else if(ctx.NOT_() != null && !"bool".equals(result)){
                result = null;
            }
            if(result != null)
                result = "bool";
        }
        else if(ctx.OR_() != null || ctx.AND_() != null){
            result = getOperationType(ctx.operation(0));
            if(  !(result != null && result.equals("bool") && result.equals(getOperationType(ctx.operation(1))))  )
                result = null;
        }
        return result;
    }
}

