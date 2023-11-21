// Generated from C:/Users/sala/Desktop/Compiladores/Compiladores\Intepreter.g4 by ANTLR 4.10.1
package Grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IntepreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IntepreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(IntepreterParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(IntepreterParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(IntepreterParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(IntepreterParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(IntepreterParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#data_acess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_acess(IntepreterParser.Data_acessContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#array_acess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_acess(IntepreterParser.Array_acessContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#struct_acess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_acess(IntepreterParser.Struct_acessContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(IntepreterParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#define_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_function(IntepreterParser.Define_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#arguments_define_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_define_function(IntepreterParser.Arguments_define_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(IntepreterParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#arguments_call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_call_function(IntepreterParser.Arguments_call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#codeblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(IntepreterParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#define_multiple_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_multiple_data(IntepreterParser.Define_multiple_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#define_single_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_single_data(IntepreterParser.Define_single_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#defining_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining_data(IntepreterParser.Defining_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#value_attr_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_attr_data(IntepreterParser.Value_attr_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#statement_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_return(IntepreterParser.Statement_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#statement_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_if(IntepreterParser.Statement_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicle(IntepreterParser.CicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#statement_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_while(IntepreterParser.Statement_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#statement_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_for(IntepreterParser.Statement_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link IntepreterParser#define_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_struct(IntepreterParser.Define_structContext ctx);
}