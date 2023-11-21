// Generated from C:/Users/sala/Desktop/Compiladores/Compiladores\Intepreter.g4 by ANTLR 4.10.1
package Grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IntepreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_=1, BOOLEAN_=2, REAL_=3, STRING_=4, VOID_=5, PLUS_=6, MINUS_=7, MULT_=8, 
		DIV_=9, REMAINDER_=10, LT_=11, LTE_=12, GT_=13, GTE_=14, EQUAL_=15, NEQUAL_=16, 
		AND_=17, OR_=18, NOT_=19, LP_=20, RP_=21, SQUARE_LP_=22, SQUARE_RP_=23, 
		LCB_=24, RCB_=25, STRUCT_ACCESS_=26, BOOLVALUES_=27, POINTER_=28, ATRIBUTION_=29, 
		COLON_=30, KEYWORD_FUNCTION=31, IF_=32, THEN_=33, ELSE_=34, WHILE_=35, 
		FOR_=36, TO_=37, DOWNTO_=38, STEP_=39, RETURN_=40, TYPE_=41, IDENTIFIER_=42, 
		SEMICOLON_=43, LETTER_=44, DIGITS_=45, NUMBER_=46, STRING_VALUE_=47, SL_COMMENT=48, 
		ML_COMMENT=49, WHITE_SPACE=50;
	public static final int
		RULE_start = 0, RULE_instruction = 1, RULE_expression = 2, RULE_literal = 3, 
		RULE_types = 4, RULE_data_acess = 5, RULE_array_acess = 6, RULE_struct_acess = 7, 
		RULE_operation = 8, RULE_define_function = 9, RULE_arguments_define_function = 10, 
		RULE_call_function = 11, RULE_arguments_call_function = 12, RULE_codeblock = 13, 
		RULE_define_multiple_data = 14, RULE_define_single_data = 15, RULE_defining_data = 16, 
		RULE_value_attr_data = 17, RULE_statement_return = 18, RULE_statement_if = 19, 
		RULE_cicle = 20, RULE_statement_while = 21, RULE_statement_for = 22, RULE_define_struct = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instruction", "expression", "literal", "types", "data_acess", 
			"array_acess", "struct_acess", "operation", "define_function", "arguments_define_function", 
			"call_function", "arguments_call_function", "codeblock", "define_multiple_data", 
			"define_single_data", "defining_data", "value_attr_data", "statement_return", 
			"statement_if", "cicle", "statement_while", "statement_for", "define_struct"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'real'", "'string'", "'void'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", 
			"'or'", "'not'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", null, 
			"'^'", "'='", "','", null, "'if'", "'then'", "'else'", "'while'", "'for'", 
			"'to'", "'downto'", "'step'", "'return'", "'type'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_", "BOOLEAN_", "REAL_", "STRING_", "VOID_", "PLUS_", "MINUS_", 
			"MULT_", "DIV_", "REMAINDER_", "LT_", "LTE_", "GT_", "GTE_", "EQUAL_", 
			"NEQUAL_", "AND_", "OR_", "NOT_", "LP_", "RP_", "SQUARE_LP_", "SQUARE_RP_", 
			"LCB_", "RCB_", "STRUCT_ACCESS_", "BOOLVALUES_", "POINTER_", "ATRIBUTION_", 
			"COLON_", "KEYWORD_FUNCTION", "IF_", "THEN_", "ELSE_", "WHILE_", "FOR_", 
			"TO_", "DOWNTO_", "STEP_", "RETURN_", "TYPE_", "IDENTIFIER_", "SEMICOLON_", 
			"LETTER_", "DIGITS_", "NUMBER_", "STRING_VALUE_", "SL_COMMENT", "ML_COMMENT", 
			"WHITE_SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Intepreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IntepreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IntepreterParser.EOF, 0); }
		public List<Define_structContext> define_struct() {
			return getRuleContexts(Define_structContext.class);
		}
		public Define_structContext define_struct(int i) {
			return getRuleContext(Define_structContext.class,i);
		}
		public List<TerminalNode> SEMICOLON_() { return getTokens(IntepreterParser.SEMICOLON_); }
		public TerminalNode SEMICOLON_(int i) {
			return getToken(IntepreterParser.SEMICOLON_, i);
		}
		public List<Define_functionContext> define_function() {
			return getRuleContexts(Define_functionContext.class);
		}
		public Define_functionContext define_function(int i) {
			return getRuleContext(Define_functionContext.class,i);
		}
		public List<Define_multiple_dataContext> define_multiple_data() {
			return getRuleContexts(Define_multiple_dataContext.class);
		}
		public Define_multiple_dataContext define_multiple_data(int i) {
			return getRuleContext(Define_multiple_dataContext.class,i);
		}
		public List<Define_single_dataContext> define_single_data() {
			return getRuleContexts(Define_single_dataContext.class);
		}
		public Define_single_dataContext define_single_data(int i) {
			return getRuleContext(Define_single_dataContext.class,i);
		}
		public List<Value_attr_dataContext> value_attr_data() {
			return getRuleContexts(Value_attr_dataContext.class);
		}
		public Value_attr_dataContext value_attr_data(int i) {
			return getRuleContext(Value_attr_dataContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_) {
				{
				{
				setState(48);
				define_struct();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(54);
						define_multiple_data();
						}
						break;
					case 2:
						{
						setState(55);
						define_single_data();
						}
						break;
					case 3:
						{
						setState(56);
						value_attr_data();
						}
						break;
					case 4:
						{
						}
						break;
					}
					setState(60);
					match(SEMICOLON_);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				define_function();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_) | (1L << BOOLEAN_) | (1L << REAL_) | (1L << STRING_) | (1L << VOID_) | (1L << IDENTIFIER_))) != 0) );
			setState(71);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON_() { return getToken(IntepreterParser.SEMICOLON_, 0); }
		public Statement_returnContext statement_return() {
			return getRuleContext(Statement_returnContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CicleContext cicle() {
			return getRuleContext(CicleContext.class,0);
		}
		public Statement_ifContext statement_if() {
			return getRuleContext(Statement_ifContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_:
			case BOOLEAN_:
			case REAL_:
			case STRING_:
			case KEYWORD_FUNCTION:
			case RETURN_:
			case IDENTIFIER_:
			case SEMICOLON_:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN_:
					{
					setState(73);
					statement_return();
					}
					break;
				case INT_:
				case BOOLEAN_:
				case REAL_:
				case STRING_:
				case KEYWORD_FUNCTION:
				case IDENTIFIER_:
				case SEMICOLON_:
					{
					setState(74);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77);
				match(SEMICOLON_);
				}
				break;
			case WHILE_:
			case FOR_:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				cicle();
				}
				break;
			case IF_:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				statement_if();
				}
				break;
			case LCB_:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				codeblock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Value_attr_dataContext value_attr_data() {
			return getRuleContext(Value_attr_dataContext.class,0);
		}
		public Define_single_dataContext define_single_data() {
			return getRuleContext(Define_single_dataContext.class,0);
		}
		public Define_multiple_dataContext define_multiple_data() {
			return getRuleContext(Define_multiple_dataContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				value_attr_data();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				define_single_data();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				define_multiple_data();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				call_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BOOLVALUES_() { return getToken(IntepreterParser.BOOLVALUES_, 0); }
		public TerminalNode DIGITS_() { return getToken(IntepreterParser.DIGITS_, 0); }
		public TerminalNode NUMBER_() { return getToken(IntepreterParser.NUMBER_, 0); }
		public TerminalNode STRING_VALUE_() { return getToken(IntepreterParser.STRING_VALUE_, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVALUES_) | (1L << DIGITS_) | (1L << NUMBER_) | (1L << STRING_VALUE_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode INT_() { return getToken(IntepreterParser.INT_, 0); }
		public TerminalNode BOOLEAN_() { return getToken(IntepreterParser.BOOLEAN_, 0); }
		public TerminalNode REAL_() { return getToken(IntepreterParser.REAL_, 0); }
		public TerminalNode STRING_() { return getToken(IntepreterParser.STRING_, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_) | (1L << BOOLEAN_) | (1L << REAL_) | (1L << STRING_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_acessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(IntepreterParser.IDENTIFIER_, 0); }
		public List<Array_acessContext> array_acess() {
			return getRuleContexts(Array_acessContext.class);
		}
		public Array_acessContext array_acess(int i) {
			return getRuleContext(Array_acessContext.class,i);
		}
		public Struct_acessContext struct_acess() {
			return getRuleContext(Struct_acessContext.class,0);
		}
		public Data_acessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_acess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterData_acess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitData_acess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitData_acess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_acessContext data_acess() throws RecognitionException {
		Data_acessContext _localctx = new Data_acessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_data_acess);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IDENTIFIER_);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					array_acess();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(102);
				struct_acess();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_acessContext extends ParserRuleContext {
		public TerminalNode SQUARE_LP_() { return getToken(IntepreterParser.SQUARE_LP_, 0); }
		public TerminalNode SQUARE_RP_() { return getToken(IntepreterParser.SQUARE_RP_, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Array_acessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_acess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterArray_acess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitArray_acess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitArray_acess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_acessContext array_acess() throws RecognitionException {
		Array_acessContext _localctx = new Array_acessContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_acess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(SQUARE_LP_);
			{
			setState(106);
			operation(0);
			}
			setState(107);
			match(SQUARE_RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_acessContext extends ParserRuleContext {
		public TerminalNode STRUCT_ACCESS_() { return getToken(IntepreterParser.STRUCT_ACCESS_, 0); }
		public Data_acessContext data_acess() {
			return getRuleContext(Data_acessContext.class,0);
		}
		public Struct_acessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_acess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterStruct_acess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitStruct_acess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitStruct_acess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_acessContext struct_acess() throws RecognitionException {
		Struct_acessContext _localctx = new Struct_acessContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_struct_acess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(STRUCT_ACCESS_);
			setState(110);
			data_acess();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Data_acessContext data_acess() {
			return getRuleContext(Data_acessContext.class,0);
		}
		public TerminalNode LP_() { return getToken(IntepreterParser.LP_, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode RP_() { return getToken(IntepreterParser.RP_, 0); }
		public TerminalNode MINUS_() { return getToken(IntepreterParser.MINUS_, 0); }
		public TerminalNode NOT_() { return getToken(IntepreterParser.NOT_, 0); }
		public TerminalNode MULT_() { return getToken(IntepreterParser.MULT_, 0); }
		public TerminalNode DIV_() { return getToken(IntepreterParser.DIV_, 0); }
		public TerminalNode REMAINDER_() { return getToken(IntepreterParser.REMAINDER_, 0); }
		public TerminalNode PLUS_() { return getToken(IntepreterParser.PLUS_, 0); }
		public TerminalNode LT_() { return getToken(IntepreterParser.LT_, 0); }
		public TerminalNode LTE_() { return getToken(IntepreterParser.LTE_, 0); }
		public TerminalNode GT_() { return getToken(IntepreterParser.GT_, 0); }
		public TerminalNode GTE_() { return getToken(IntepreterParser.GTE_, 0); }
		public TerminalNode EQUAL_() { return getToken(IntepreterParser.EQUAL_, 0); }
		public TerminalNode NEQUAL_() { return getToken(IntepreterParser.NEQUAL_, 0); }
		public TerminalNode AND_() { return getToken(IntepreterParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(IntepreterParser.OR_, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_operation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(113);
				call_function();
				}
				break;
			case 2:
				{
				setState(114);
				literal();
				}
				break;
			case 3:
				{
				setState(115);
				data_acess();
				}
				break;
			case 4:
				{
				setState(116);
				match(LP_);
				setState(117);
				operation(0);
				setState(118);
				match(RP_);
				}
				break;
			case 5:
				{
				setState(120);
				match(MINUS_);
				setState(121);
				operation(8);
				}
				break;
			case 6:
				{
				setState(122);
				match(NOT_);
				setState(123);
				operation(5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(127);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT_) | (1L << DIV_) | (1L << REMAINDER_))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						operation(8);
						}
						break;
					case 2:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						_la = _input.LA(1);
						if ( !(_la==PLUS_ || _la==MINUS_) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						operation(7);
						}
						break;
					case 3:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(132);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT_) | (1L << LTE_) | (1L << GT_) | (1L << GTE_))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(134);
						operation(5);
						}
						break;
					case 4:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(135);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(136);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_ || _la==NEQUAL_) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(137);
						operation(4);
						}
						break;
					case 5:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(138);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(139);
						match(AND_);
						setState(140);
						operation(3);
						}
						break;
					case 6:
						{
						_localctx = new OperationContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(141);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(142);
						match(OR_);
						setState(143);
						operation(2);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Define_functionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER_() { return getTokens(IntepreterParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(IntepreterParser.IDENTIFIER_, i);
		}
		public Arguments_define_functionContext arguments_define_function() {
			return getRuleContext(Arguments_define_functionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode VOID_() { return getToken(IntepreterParser.VOID_, 0); }
		public Define_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterDefine_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitDefine_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitDefine_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_functionContext define_function() throws RecognitionException {
		Define_functionContext _localctx = new Define_functionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_define_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_:
			case BOOLEAN_:
			case REAL_:
			case STRING_:
				{
				setState(149);
				types();
				}
				break;
			case VOID_:
				{
				setState(150);
				match(VOID_);
				}
				break;
			case IDENTIFIER_:
				{
				setState(151);
				match(IDENTIFIER_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(154);
			match(IDENTIFIER_);
			setState(155);
			arguments_define_function();
			setState(156);
			codeblock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_define_functionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(IntepreterParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(IntepreterParser.RP_, 0); }
		public TerminalNode VOID_() { return getToken(IntepreterParser.VOID_, 0); }
		public List<Define_single_dataContext> define_single_data() {
			return getRuleContexts(Define_single_dataContext.class);
		}
		public Define_single_dataContext define_single_data(int i) {
			return getRuleContext(Define_single_dataContext.class,i);
		}
		public List<TerminalNode> COLON_() { return getTokens(IntepreterParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(IntepreterParser.COLON_, i);
		}
		public Arguments_define_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_define_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterArguments_define_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitArguments_define_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitArguments_define_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_define_functionContext arguments_define_function() throws RecognitionException {
		Arguments_define_functionContext _localctx = new Arguments_define_functionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments_define_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LP_);
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_:
			case BOOLEAN_:
			case REAL_:
			case STRING_:
			case IDENTIFIER_:
				{
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					define_single_data();
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COLON_) {
						{
						{
						setState(160);
						match(COLON_);
						setState(161);
						define_single_data();
						}
						}
						setState(166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_) | (1L << BOOLEAN_) | (1L << REAL_) | (1L << STRING_) | (1L << IDENTIFIER_))) != 0) );
				}
				break;
			case VOID_:
				{
				setState(171);
				match(VOID_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(174);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_functionContext extends ParserRuleContext {
		public Arguments_call_functionContext arguments_call_function() {
			return getRuleContext(Arguments_call_functionContext.class,0);
		}
		public TerminalNode IDENTIFIER_() { return getToken(IntepreterParser.IDENTIFIER_, 0); }
		public TerminalNode KEYWORD_FUNCTION() { return getToken(IntepreterParser.KEYWORD_FUNCTION, 0); }
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==KEYWORD_FUNCTION || _la==IDENTIFIER_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(177);
			arguments_call_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_call_functionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(IntepreterParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(IntepreterParser.RP_, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> COLON_() { return getTokens(IntepreterParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(IntepreterParser.COLON_, i);
		}
		public Arguments_call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterArguments_call_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitArguments_call_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitArguments_call_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_call_functionContext arguments_call_function() throws RecognitionException {
		Arguments_call_functionContext _localctx = new Arguments_call_functionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arguments_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LP_);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS_) | (1L << NOT_) | (1L << LP_) | (1L << BOOLVALUES_) | (1L << KEYWORD_FUNCTION) | (1L << IDENTIFIER_) | (1L << DIGITS_) | (1L << NUMBER_) | (1L << STRING_VALUE_))) != 0)) {
				{
				{
				setState(180);
				operation(0);
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON_) {
					{
					{
					setState(181);
					match(COLON_);
					{
					setState(182);
					operation(0);
					}
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(190);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeblockContext extends ParserRuleContext {
		public TerminalNode LCB_() { return getToken(IntepreterParser.LCB_, 0); }
		public TerminalNode RCB_() { return getToken(IntepreterParser.RCB_, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(LCB_);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_) | (1L << BOOLEAN_) | (1L << REAL_) | (1L << STRING_) | (1L << LCB_) | (1L << KEYWORD_FUNCTION) | (1L << IF_) | (1L << WHILE_) | (1L << FOR_) | (1L << RETURN_) | (1L << IDENTIFIER_) | (1L << SEMICOLON_))) != 0)) {
				{
				{
				setState(193);
				instruction();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(RCB_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_multiple_dataContext extends ParserRuleContext {
		public Define_single_dataContext define_single_data() {
			return getRuleContext(Define_single_dataContext.class,0);
		}
		public List<TerminalNode> COLON_() { return getTokens(IntepreterParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(IntepreterParser.COLON_, i);
		}
		public List<Defining_dataContext> defining_data() {
			return getRuleContexts(Defining_dataContext.class);
		}
		public Defining_dataContext defining_data(int i) {
			return getRuleContext(Defining_dataContext.class,i);
		}
		public Define_multiple_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_multiple_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterDefine_multiple_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitDefine_multiple_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitDefine_multiple_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_multiple_dataContext define_multiple_data() throws RecognitionException {
		Define_multiple_dataContext _localctx = new Define_multiple_dataContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_define_multiple_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			define_single_data();
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(COLON_);
				setState(203);
				defining_data();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLON_ );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_single_dataContext extends ParserRuleContext {
		public Defining_dataContext defining_data() {
			return getRuleContext(Defining_dataContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode IDENTIFIER_() { return getToken(IntepreterParser.IDENTIFIER_, 0); }
		public Define_single_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_single_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterDefine_single_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitDefine_single_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitDefine_single_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_single_dataContext define_single_data() throws RecognitionException {
		Define_single_dataContext _localctx = new Define_single_dataContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_define_single_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_:
			case BOOLEAN_:
			case REAL_:
			case STRING_:
				{
				setState(208);
				types();
				}
				break;
			case IDENTIFIER_:
				{
				setState(209);
				match(IDENTIFIER_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(212);
			defining_data();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defining_dataContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(IntepreterParser.IDENTIFIER_, 0); }
		public List<TerminalNode> POINTER_() { return getTokens(IntepreterParser.POINTER_); }
		public TerminalNode POINTER_(int i) {
			return getToken(IntepreterParser.POINTER_, i);
		}
		public List<Array_acessContext> array_acess() {
			return getRuleContexts(Array_acessContext.class);
		}
		public Array_acessContext array_acess(int i) {
			return getRuleContext(Array_acessContext.class,i);
		}
		public Defining_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defining_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterDefining_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitDefining_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitDefining_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defining_dataContext defining_data() throws RecognitionException {
		Defining_dataContext _localctx = new Defining_dataContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defining_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POINTER_) {
				{
				{
				setState(214);
				match(POINTER_);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(IDENTIFIER_);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUARE_LP_) {
				{
				{
				setState(221);
				array_acess();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_attr_dataContext extends ParserRuleContext {
		public TerminalNode ATRIBUTION_() { return getToken(IntepreterParser.ATRIBUTION_, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Define_single_dataContext define_single_data() {
			return getRuleContext(Define_single_dataContext.class,0);
		}
		public Data_acessContext data_acess() {
			return getRuleContext(Data_acessContext.class,0);
		}
		public Value_attr_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_attr_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterValue_attr_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitValue_attr_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitValue_attr_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_attr_dataContext value_attr_data() throws RecognitionException {
		Value_attr_dataContext _localctx = new Value_attr_dataContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value_attr_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(227);
				define_single_data();
				}
				break;
			case 2:
				{
				setState(228);
				data_acess();
				}
				break;
			}
			setState(231);
			match(ATRIBUTION_);
			setState(232);
			operation(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_returnContext extends ParserRuleContext {
		public TerminalNode RETURN_() { return getToken(IntepreterParser.RETURN_, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Statement_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterStatement_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitStatement_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitStatement_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_returnContext statement_return() throws RecognitionException {
		Statement_returnContext _localctx = new Statement_returnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(RETURN_);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS_) | (1L << NOT_) | (1L << LP_) | (1L << BOOLVALUES_) | (1L << KEYWORD_FUNCTION) | (1L << IDENTIFIER_) | (1L << DIGITS_) | (1L << NUMBER_) | (1L << STRING_VALUE_))) != 0)) {
				{
				setState(235);
				operation(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_ifContext extends ParserRuleContext {
		public TerminalNode IF_() { return getToken(IntepreterParser.IF_, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode THEN_() { return getToken(IntepreterParser.THEN_, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode ELSE_() { return getToken(IntepreterParser.ELSE_, 0); }
		public Statement_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterStatement_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitStatement_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitStatement_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_ifContext statement_if() throws RecognitionException {
		Statement_ifContext _localctx = new Statement_ifContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IF_);
			setState(239);
			operation(0);
			setState(240);
			match(THEN_);
			setState(241);
			instruction();
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(242);
				match(ELSE_);
				setState(243);
				instruction();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicleContext extends ParserRuleContext {
		public Statement_whileContext statement_while() {
			return getRuleContext(Statement_whileContext.class,0);
		}
		public Statement_forContext statement_for() {
			return getRuleContext(Statement_forContext.class,0);
		}
		public CicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterCicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitCicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitCicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicleContext cicle() throws RecognitionException {
		CicleContext _localctx = new CicleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cicle);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE_:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				statement_while();
				}
				break;
			case FOR_:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				statement_for();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_whileContext extends ParserRuleContext {
		public TerminalNode WHILE_() { return getToken(IntepreterParser.WHILE_, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Statement_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterStatement_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitStatement_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitStatement_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_whileContext statement_while() throws RecognitionException {
		Statement_whileContext _localctx = new Statement_whileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(WHILE_);
			setState(251);
			operation(0);
			setState(252);
			instruction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_forContext extends ParserRuleContext {
		public TerminalNode FOR_() { return getToken(IntepreterParser.FOR_, 0); }
		public Value_attr_dataContext value_attr_data() {
			return getRuleContext(Value_attr_dataContext.class,0);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode TO_() { return getToken(IntepreterParser.TO_, 0); }
		public TerminalNode DOWNTO_() { return getToken(IntepreterParser.DOWNTO_, 0); }
		public TerminalNode STEP_() { return getToken(IntepreterParser.STEP_, 0); }
		public Statement_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterStatement_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitStatement_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitStatement_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_forContext statement_for() throws RecognitionException {
		Statement_forContext _localctx = new Statement_forContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FOR_);
			setState(255);
			value_attr_data();
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==TO_ || _la==DOWNTO_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(257);
			operation(0);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP_) {
				{
				setState(258);
				match(STEP_);
				setState(259);
				operation(0);
				}
			}

			setState(262);
			instruction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_structContext extends ParserRuleContext {
		public TerminalNode TYPE_() { return getToken(IntepreterParser.TYPE_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(IntepreterParser.IDENTIFIER_, 0); }
		public TerminalNode LCB_() { return getToken(IntepreterParser.LCB_, 0); }
		public TerminalNode RCB_() { return getToken(IntepreterParser.RCB_, 0); }
		public List<TerminalNode> SEMICOLON_() { return getTokens(IntepreterParser.SEMICOLON_); }
		public TerminalNode SEMICOLON_(int i) {
			return getToken(IntepreterParser.SEMICOLON_, i);
		}
		public List<Define_multiple_dataContext> define_multiple_data() {
			return getRuleContexts(Define_multiple_dataContext.class);
		}
		public Define_multiple_dataContext define_multiple_data(int i) {
			return getRuleContext(Define_multiple_dataContext.class,i);
		}
		public List<Define_single_dataContext> define_single_data() {
			return getRuleContexts(Define_single_dataContext.class);
		}
		public Define_single_dataContext define_single_data(int i) {
			return getRuleContext(Define_single_dataContext.class,i);
		}
		public Define_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).enterDefine_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntepreterListener ) ((IntepreterListener)listener).exitDefine_struct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IntepreterVisitor ) return ((IntepreterVisitor<? extends T>)visitor).visitDefine_struct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_structContext define_struct() throws RecognitionException {
		Define_structContext _localctx = new Define_structContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_define_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(TYPE_);
			setState(265);
			match(IDENTIFIER_);
			setState(266);
			match(LCB_);
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(267);
					define_multiple_data();
					}
					break;
				case 2:
					{
					setState(268);
					define_single_data();
					}
					break;
				}
				setState(271);
				match(SEMICOLON_);
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_) | (1L << BOOLEAN_) | (1L << REAL_) | (1L << STRING_) | (1L << IDENTIFIER_))) != 0) );
			setState(277);
			match(RCB_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0118\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000;\b\u0000\u0001\u0000\u0005\u0000>\b\u0000\n\u0000"+
		"\f\u0000A\t\u0000\u0001\u0000\u0004\u0000D\b\u0000\u000b\u0000\f\u0000"+
		"E\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001L\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"S\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005e\t\u0005"+
		"\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b}\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0091\b\b\n\b\f\b\u0094\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0099\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00a3\b\n\n\n\f\n\u00a6\t\n\u0004\n\u00a8\b"+
		"\n\u000b\n\f\n\u00a9\u0001\n\u0003\n\u00ad\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b8"+
		"\b\f\n\f\f\f\u00bb\t\f\u0003\f\u00bd\b\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\r\u00c3\b\r\n\r\f\r\u00c6\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00cd\b\u000e\u000b\u000e\f\u000e\u00ce"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00d3\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0005\u0010\u00d8\b\u0010\n\u0010\f\u0010\u00db\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00df\b\u0010\n\u0010\f\u0010\u00e2\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00e6\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00ed\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00f5\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00f9\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0105\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u010e\b\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u0112"+
		"\b\u0017\u000b\u0017\f\u0017\u0113\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0000\u0001\u0010\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\b\u0002\u0000\u001b"+
		"\u001b-/\u0001\u0000\u0001\u0004\u0001\u0000\b\n\u0001\u0000\u0006\u0007"+
		"\u0001\u0000\u000b\u000e\u0001\u0000\u000f\u0010\u0002\u0000\u001f\u001f"+
		"**\u0001\u0000%&\u012e\u00003\u0001\u0000\u0000\u0000\u0002R\u0001\u0000"+
		"\u0000\u0000\u0004Y\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000"+
		"\b]\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fi\u0001\u0000"+
		"\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000"+
		"\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u009e\u0001\u0000\u0000\u0000"+
		"\u0016\u00b0\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000\u0000\u0000"+
		"\u001a\u00c0\u0001\u0000\u0000\u0000\u001c\u00c9\u0001\u0000\u0000\u0000"+
		"\u001e\u00d2\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000\u0000\""+
		"\u00e5\u0001\u0000\u0000\u0000$\u00ea\u0001\u0000\u0000\u0000&\u00ee\u0001"+
		"\u0000\u0000\u0000(\u00f8\u0001\u0000\u0000\u0000*\u00fa\u0001\u0000\u0000"+
		"\u0000,\u00fe\u0001\u0000\u0000\u0000.\u0108\u0001\u0000\u0000\u00000"+
		"2\u0003.\u0017\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004?\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u00006;\u0003\u001c\u000e\u00007;\u0003\u001e"+
		"\u000f\u00008;\u0003\"\u0011\u00009;\u0001\u0000\u0000\u0000:6\u0001\u0000"+
		"\u0000\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0005+\u0000\u0000=:\u0001"+
		"\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BD\u0003\u0012\t\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0000\u0000\u0001H\u0001\u0001\u0000\u0000\u0000"+
		"IL\u0003$\u0012\u0000JL\u0003\u0004\u0002\u0000KI\u0001\u0000\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005+\u0000\u0000"+
		"NS\u0001\u0000\u0000\u0000OS\u0003(\u0014\u0000PS\u0003&\u0013\u0000Q"+
		"S\u0003\u001a\r\u0000RK\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u0003\u0001\u0000"+
		"\u0000\u0000TZ\u0001\u0000\u0000\u0000UZ\u0003\"\u0011\u0000VZ\u0003\u001e"+
		"\u000f\u0000WZ\u0003\u001c\u000e\u0000XZ\u0003\u0016\u000b\u0000YT\u0001"+
		"\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000"+
		"\u0000\u0000[\\\u0007\u0000\u0000\u0000\\\u0007\u0001\u0000\u0000\u0000"+
		"]^\u0007\u0001\u0000\u0000^\t\u0001\u0000\u0000\u0000_c\u0005*\u0000\u0000"+
		"`b\u0003\f\u0006\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fh\u0003\u000e\u0007\u0000gf\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u000b\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0016\u0000\u0000jk\u0003\u0010\b\u0000kl\u0005\u0017\u0000\u0000"+
		"l\r\u0001\u0000\u0000\u0000mn\u0005\u001a\u0000\u0000no\u0003\n\u0005"+
		"\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0006\b\uffff\uffff\u0000q}\u0003"+
		"\u0016\u000b\u0000r}\u0003\u0006\u0003\u0000s}\u0003\n\u0005\u0000tu\u0005"+
		"\u0014\u0000\u0000uv\u0003\u0010\b\u0000vw\u0005\u0015\u0000\u0000w}\u0001"+
		"\u0000\u0000\u0000xy\u0005\u0007\u0000\u0000y}\u0003\u0010\b\bz{\u0005"+
		"\u0013\u0000\u0000{}\u0003\u0010\b\u0005|p\u0001\u0000\u0000\u0000|r\u0001"+
		"\u0000\u0000\u0000|s\u0001\u0000\u0000\u0000|t\u0001\u0000\u0000\u0000"+
		"|x\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0092\u0001\u0000"+
		"\u0000\u0000~\u007f\n\u0007\u0000\u0000\u007f\u0080\u0007\u0002\u0000"+
		"\u0000\u0080\u0091\u0003\u0010\b\b\u0081\u0082\n\u0006\u0000\u0000\u0082"+
		"\u0083\u0007\u0003\u0000\u0000\u0083\u0091\u0003\u0010\b\u0007\u0084\u0085"+
		"\n\u0004\u0000\u0000\u0085\u0086\u0007\u0004\u0000\u0000\u0086\u0091\u0003"+
		"\u0010\b\u0005\u0087\u0088\n\u0003\u0000\u0000\u0088\u0089\u0007\u0005"+
		"\u0000\u0000\u0089\u0091\u0003\u0010\b\u0004\u008a\u008b\n\u0002\u0000"+
		"\u0000\u008b\u008c\u0005\u0011\u0000\u0000\u008c\u0091\u0003\u0010\b\u0003"+
		"\u008d\u008e\n\u0001\u0000\u0000\u008e\u008f\u0005\u0012\u0000\u0000\u008f"+
		"\u0091\u0003\u0010\b\u0002\u0090~\u0001\u0000\u0000\u0000\u0090\u0081"+
		"\u0001\u0000\u0000\u0000\u0090\u0084\u0001\u0000\u0000\u0000\u0090\u0087"+
		"\u0001\u0000\u0000\u0000\u0090\u008a\u0001\u0000\u0000\u0000\u0090\u008d"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0011"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0099"+
		"\u0003\b\u0004\u0000\u0096\u0099\u0005\u0005\u0000\u0000\u0097\u0099\u0005"+
		"*\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005*\u0000\u0000\u009b\u009c\u0003\u0014\n"+
		"\u0000\u009c\u009d\u0003\u001a\r\u0000\u009d\u0013\u0001\u0000\u0000\u0000"+
		"\u009e\u00ac\u0005\u0014\u0000\u0000\u009f\u00a4\u0003\u001e\u000f\u0000"+
		"\u00a0\u00a1\u0005\u001e\u0000\u0000\u00a1\u00a3\u0003\u001e\u000f\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a7\u009f\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005\u0005\u0000\u0000"+
		"\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0015\u0000\u0000\u00af\u0015\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0007\u0006\u0000\u0000\u00b1\u00b2\u0003\u0018\f\u0000\u00b2"+
		"\u0017\u0001\u0000\u0000\u0000\u00b3\u00bc\u0005\u0014\u0000\u0000\u00b4"+
		"\u00b9\u0003\u0010\b\u0000\u00b5\u00b6\u0005\u001e\u0000\u0000\u00b6\u00b8"+
		"\u0003\u0010\b\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u0015\u0000\u0000\u00bf\u0019\u0001\u0000\u0000\u0000\u00c0\u00c4\u0005"+
		"\u0018\u0000\u0000\u00c1\u00c3\u0003\u0002\u0001\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"\u0019\u0000\u0000\u00c8\u001b\u0001\u0000\u0000\u0000\u00c9\u00cc\u0003"+
		"\u001e\u000f\u0000\u00ca\u00cb\u0005\u001e\u0000\u0000\u00cb\u00cd\u0003"+
		" \u0010\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u001d\u0001\u0000\u0000\u0000\u00d0\u00d3\u0003\b\u0004"+
		"\u0000\u00d1\u00d3\u0005*\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0003 \u0010\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d8\u0005\u001c\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00e0\u0005*\u0000\u0000\u00dd\u00df"+
		"\u0003\f\u0006\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1!\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0003\u001e\u000f\u0000\u00e4\u00e6\u0003\n\u0005"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u001d\u0000"+
		"\u0000\u00e8\u00e9\u0003\u0010\b\u0000\u00e9#\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0005(\u0000\u0000\u00eb\u00ed\u0003\u0010\b\u0000\u00ec"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"%\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005 \u0000\u0000\u00ef\u00f0\u0003"+
		"\u0010\b\u0000\u00f0\u00f1\u0005!\u0000\u0000\u00f1\u00f4\u0003\u0002"+
		"\u0001\u0000\u00f2\u00f3\u0005\"\u0000\u0000\u00f3\u00f5\u0003\u0002\u0001"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5\'\u0001\u0000\u0000\u0000\u00f6\u00f9\u0003*\u0015\u0000"+
		"\u00f7\u00f9\u0003,\u0016\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9)\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0005#\u0000\u0000\u00fb\u00fc\u0003\u0010\b\u0000\u00fc\u00fd\u0003"+
		"\u0002\u0001\u0000\u00fd+\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005$\u0000"+
		"\u0000\u00ff\u0100\u0003\"\u0011\u0000\u0100\u0101\u0007\u0007\u0000\u0000"+
		"\u0101\u0104\u0003\u0010\b\u0000\u0102\u0103\u0005\'\u0000\u0000\u0103"+
		"\u0105\u0003\u0010\b\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0003\u0002\u0001\u0000\u0107-\u0001\u0000\u0000\u0000\u0108\u0109\u0005"+
		")\u0000\u0000\u0109\u010a\u0005*\u0000\u0000\u010a\u0111\u0005\u0018\u0000"+
		"\u0000\u010b\u010e\u0003\u001c\u000e\u0000\u010c\u010e\u0003\u001e\u000f"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0005+\u0000\u0000"+
		"\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005\u0019\u0000\u0000\u0116/\u0001\u0000\u0000\u0000\u001e"+
		"3:?EKRYcg|\u0090\u0092\u0098\u00a4\u00a9\u00ac\u00b9\u00bc\u00c4\u00ce"+
		"\u00d2\u00d9\u00e0\u00e5\u00ec\u00f4\u00f8\u0104\u010d\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}