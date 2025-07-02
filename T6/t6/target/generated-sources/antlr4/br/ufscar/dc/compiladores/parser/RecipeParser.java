// Generated from br/ufscar/dc/compiladores/parser/Recipe.g4 by ANTLR 4.13.1
package br.ufscar.dc.compiladores.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RecipeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, UNIT=4, ID=5, INT=6, NEWLINE=7, WS=8;
	public static final int
		RULE_program = 0, RULE_ingredients = 1, RULE_ingredient = 2, RULE_steps = 3, 
		RULE_step = 4, RULE_step_line = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ingredients", "ingredient", "steps", "step", "step_line"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'receita'", "'ingredientes:'", "'modo_de_preparo:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "UNIT", "ID", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Recipe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RecipeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RecipeParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RecipeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RecipeParser.NEWLINE, i);
		}
		public IngredientsContext ingredients() {
			return getRuleContext(IngredientsContext.class,0);
		}
		public StepsContext steps() {
			return getRuleContext(StepsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RecipeParser.EOF, 0); }
		public TerminalNode WS() { return getToken(RecipeParser.WS, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipeVisitor ) return ((RecipeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(13);
				match(WS);
				}
			}

			setState(16);
			match(ID);
			setState(17);
			match(NEWLINE);
			setState(18);
			ingredients();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(19);
				match(NEWLINE);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			steps();
			setState(26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IngredientsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(RecipeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RecipeParser.NEWLINE, i);
		}
		public List<IngredientContext> ingredient() {
			return getRuleContexts(IngredientContext.class);
		}
		public IngredientContext ingredient(int i) {
			return getRuleContext(IngredientContext.class,i);
		}
		public IngredientsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredients; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).enterIngredients(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).exitIngredients(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipeVisitor ) return ((RecipeVisitor<? extends T>)visitor).visitIngredients(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientsContext ingredients() throws RecognitionException {
		IngredientsContext _localctx = new IngredientsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ingredients);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__1);
			setState(29);
			match(NEWLINE);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				ingredient();
				setState(31);
				match(NEWLINE);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class IngredientContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RecipeParser.INT, 0); }
		public TerminalNode UNIT() { return getToken(RecipeParser.UNIT, 0); }
		public TerminalNode ID() { return getToken(RecipeParser.ID, 0); }
		public List<TerminalNode> WS() { return getTokens(RecipeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RecipeParser.WS, i);
		}
		public IngredientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).enterIngredient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).exitIngredient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipeVisitor ) return ((RecipeVisitor<? extends T>)visitor).visitIngredient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientContext ingredient() throws RecognitionException {
		IngredientContext _localctx = new IngredientContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ingredient);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(INT);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(38);
				match(WS);
				}
			}

			setState(41);
			match(UNIT);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(42);
				match(WS);
				}
			}

			setState(45);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StepsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(RecipeParser.NEWLINE, 0); }
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public StepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_steps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).enterSteps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).exitSteps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipeVisitor ) return ((RecipeVisitor<? extends T>)visitor).visitSteps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepsContext steps() throws RecognitionException {
		StepsContext _localctx = new StepsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__2);
			setState(48);
			match(NEWLINE);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				step();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 368L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StepContext extends ParserRuleContext {
		public Step_lineContext step_line() {
			return getRuleContext(Step_lineContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(RecipeParser.NEWLINE, 0); }
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipeVisitor ) return ((RecipeVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			step_line();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(55);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Step_lineContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RecipeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RecipeParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(RecipeParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(RecipeParser.INT, i);
		}
		public List<TerminalNode> UNIT() { return getTokens(RecipeParser.UNIT); }
		public TerminalNode UNIT(int i) {
			return getToken(RecipeParser.UNIT, i);
		}
		public List<TerminalNode> WS() { return getTokens(RecipeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RecipeParser.WS, i);
		}
		public Step_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).enterStep_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RecipeListener ) ((RecipeListener)listener).exitStep_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RecipeVisitor ) return ((RecipeVisitor<? extends T>)visitor).visitStep_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_lineContext step_line() throws RecognitionException {
		Step_lineContext _localctx = new Step_lineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_step_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(58);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 368L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(61); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static final String _serializedATN =
		"\u0004\u0001\b@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0015\b\u0000\n"+
		"\u0000\f\u0000\u0018\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\"\b"+
		"\u0001\u000b\u0001\f\u0001#\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u00033\b\u0003\u000b\u0003"+
		"\f\u00034\u0001\u0004\u0001\u0004\u0003\u00049\b\u0004\u0001\u0005\u0004"+
		"\u0005<\b\u0005\u000b\u0005\f\u0005=\u0001\u0005\u0000\u0000\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0001\u0002\u0000\u0004\u0006\b\bA\u0000"+
		"\f\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004%"+
		"\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b6\u0001\u0000"+
		"\u0000\u0000\n;\u0001\u0000\u0000\u0000\f\u000e\u0005\u0001\u0000\u0000"+
		"\r\u000f\u0005\b\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0005\u0005\u0000\u0000\u0011\u0012\u0005\u0007\u0000\u0000\u0012\u0016"+
		"\u0003\u0002\u0001\u0000\u0013\u0015\u0005\u0007\u0000\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019"+
		"\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0003\u0006\u0003\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d!\u0005"+
		"\u0007\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\u0007"+
		"\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%\'\u0005\u0006\u0000\u0000&(\u0005"+
		"\b\u0000\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000("+
		")\u0001\u0000\u0000\u0000)+\u0005\u0004\u0000\u0000*,\u0005\b\u0000\u0000"+
		"+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0005\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0003\u0000\u000002\u0005\u0007\u0000\u000013\u0003\b\u0004\u000021\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005\u0007\u0001\u0000\u0000\u000068\u0003\n\u0005"+
		"\u000079\u0005\u0007\u0000\u000087\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009\t\u0001\u0000\u0000\u0000:<\u0007\u0000\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>\u000b\u0001\u0000\u0000\u0000\b\u000e\u0016"+
		"#\'+48=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}