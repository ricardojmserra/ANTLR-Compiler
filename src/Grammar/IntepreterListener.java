// Generated from C:/Users/sala/Desktop/Compiladores/Compiladores\Intepreter.g4 by ANTLR 4.10.1
package Grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IntepreterParser}.
 */
public interface IntepreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(IntepreterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(IntepreterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(IntepreterParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(IntepreterParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IntepreterParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IntepreterParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(IntepreterParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(IntepreterParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(IntepreterParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(IntepreterParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#data_acess}.
	 * @param ctx the parse tree
	 */
	void enterData_acess(IntepreterParser.Data_acessContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#data_acess}.
	 * @param ctx the parse tree
	 */
	void exitData_acess(IntepreterParser.Data_acessContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#array_acess}.
	 * @param ctx the parse tree
	 */
	void enterArray_acess(IntepreterParser.Array_acessContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#array_acess}.
	 * @param ctx the parse tree
	 */
	void exitArray_acess(IntepreterParser.Array_acessContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#struct_acess}.
	 * @param ctx the parse tree
	 */
	void enterStruct_acess(IntepreterParser.Struct_acessContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#struct_acess}.
	 * @param ctx the parse tree
	 */
	void exitStruct_acess(IntepreterParser.Struct_acessContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(IntepreterParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(IntepreterParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#define_function}.
	 * @param ctx the parse tree
	 */
	void enterDefine_function(IntepreterParser.Define_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#define_function}.
	 * @param ctx the parse tree
	 */
	void exitDefine_function(IntepreterParser.Define_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#arguments_define_function}.
	 * @param ctx the parse tree
	 */
	void enterArguments_define_function(IntepreterParser.Arguments_define_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#arguments_define_function}.
	 * @param ctx the parse tree
	 */
	void exitArguments_define_function(IntepreterParser.Arguments_define_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(IntepreterParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(IntepreterParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#arguments_call_function}.
	 * @param ctx the parse tree
	 */
	void enterArguments_call_function(IntepreterParser.Arguments_call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#arguments_call_function}.
	 * @param ctx the parse tree
	 */
	void exitArguments_call_function(IntepreterParser.Arguments_call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(IntepreterParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(IntepreterParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#define_multiple_data}.
	 * @param ctx the parse tree
	 */
	void enterDefine_multiple_data(IntepreterParser.Define_multiple_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#define_multiple_data}.
	 * @param ctx the parse tree
	 */
	void exitDefine_multiple_data(IntepreterParser.Define_multiple_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#define_single_data}.
	 * @param ctx the parse tree
	 */
	void enterDefine_single_data(IntepreterParser.Define_single_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#define_single_data}.
	 * @param ctx the parse tree
	 */
	void exitDefine_single_data(IntepreterParser.Define_single_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#defining_data}.
	 * @param ctx the parse tree
	 */
	void enterDefining_data(IntepreterParser.Defining_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#defining_data}.
	 * @param ctx the parse tree
	 */
	void exitDefining_data(IntepreterParser.Defining_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#value_attr_data}.
	 * @param ctx the parse tree
	 */
	void enterValue_attr_data(IntepreterParser.Value_attr_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#value_attr_data}.
	 * @param ctx the parse tree
	 */
	void exitValue_attr_data(IntepreterParser.Value_attr_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#statement_return}.
	 * @param ctx the parse tree
	 */
	void enterStatement_return(IntepreterParser.Statement_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#statement_return}.
	 * @param ctx the parse tree
	 */
	void exitStatement_return(IntepreterParser.Statement_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#statement_if}.
	 * @param ctx the parse tree
	 */
	void enterStatement_if(IntepreterParser.Statement_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#statement_if}.
	 * @param ctx the parse tree
	 */
	void exitStatement_if(IntepreterParser.Statement_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#cicle}.
	 * @param ctx the parse tree
	 */
	void enterCicle(IntepreterParser.CicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#cicle}.
	 * @param ctx the parse tree
	 */
	void exitCicle(IntepreterParser.CicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#statement_while}.
	 * @param ctx the parse tree
	 */
	void enterStatement_while(IntepreterParser.Statement_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#statement_while}.
	 * @param ctx the parse tree
	 */
	void exitStatement_while(IntepreterParser.Statement_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#statement_for}.
	 * @param ctx the parse tree
	 */
	void enterStatement_for(IntepreterParser.Statement_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#statement_for}.
	 * @param ctx the parse tree
	 */
	void exitStatement_for(IntepreterParser.Statement_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link IntepreterParser#define_struct}.
	 * @param ctx the parse tree
	 */
	void enterDefine_struct(IntepreterParser.Define_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link IntepreterParser#define_struct}.
	 * @param ctx the parse tree
	 */
	void exitDefine_struct(IntepreterParser.Define_structContext ctx);
}