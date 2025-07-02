// Generated from br/ufscar/dc/compiladores/parser/Recipe.g4 by ANTLR 4.13.1
package br.ufscar.dc.compiladores.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RecipeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, UNIT=4, ID=5, INT=6, NEWLINE=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "UNIT", "ID", "INT", "NEWLINE", "WS"
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


	public RecipeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Recipe.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\bt\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u0004_\b\u0004\n\u0004\f\u0004b\t\u0004\u0001\u0005\u0004\u0005"+
		"e\b\u0005\u000b\u0005\f\u0005f\u0001\u0006\u0003\u0006j\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007o\b\u0007\u000b\u0007\f\u0007"+
		"p\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0004"+
		"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\t\t "+
		" {\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011"+
		"\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005\'\u0001"+
		"\u0000\u0000\u0000\u0007Z\u0001\u0000\u0000\u0000\t\\\u0001\u0000\u0000"+
		"\u0000\u000bd\u0001\u0000\u0000\u0000\ri\u0001\u0000\u0000\u0000\u000f"+
		"n\u0001\u0000\u0000\u0000\u0011\u0012\u0005r\u0000\u0000\u0012\u0013\u0005"+
		"e\u0000\u0000\u0013\u0014\u0005c\u0000\u0000\u0014\u0015\u0005e\u0000"+
		"\u0000\u0015\u0016\u0005i\u0000\u0000\u0016\u0017\u0005t\u0000\u0000\u0017"+
		"\u0018\u0005a\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005i\u0000\u0000\u001a\u001b\u0005n\u0000\u0000\u001b\u001c\u0005g"+
		"\u0000\u0000\u001c\u001d\u0005r\u0000\u0000\u001d\u001e\u0005e\u0000\u0000"+
		"\u001e\u001f\u0005d\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005e\u0000"+
		"\u0000!\"\u0005n\u0000\u0000\"#\u0005t\u0000\u0000#$\u0005e\u0000\u0000"+
		"$%\u0005s\u0000\u0000%&\u0005:\u0000\u0000&\u0004\u0001\u0000\u0000\u0000"+
		"\'(\u0005m\u0000\u0000()\u0005o\u0000\u0000)*\u0005d\u0000\u0000*+\u0005"+
		"o\u0000\u0000+,\u0005_\u0000\u0000,-\u0005d\u0000\u0000-.\u0005e\u0000"+
		"\u0000./\u0005_\u0000\u0000/0\u0005p\u0000\u000001\u0005r\u0000\u0000"+
		"12\u0005e\u0000\u000023\u0005p\u0000\u000034\u0005a\u0000\u000045\u0005"+
		"r\u0000\u000056\u0005o\u0000\u000067\u0005:\u0000\u00007\u0006\u0001\u0000"+
		"\u0000\u000089\u0005x\u0000\u00009:\u0005i\u0000\u0000:;\u0005c\u0000"+
		"\u0000;<\u0005a\u0000\u0000<=\u0005r\u0000\u0000=[\u0005a\u0000\u0000"+
		">?\u0005x\u0000\u0000?@\u0005i\u0000\u0000@A\u0005c\u0000\u0000AB\u0005"+
		"a\u0000\u0000BC\u0005r\u0000\u0000CD\u0005a\u0000\u0000D[\u0005s\u0000"+
		"\u0000EF\u0005g\u0000\u0000FG\u0005r\u0000\u0000GH\u0005a\u0000\u0000"+
		"HI\u0005m\u0000\u0000IJ\u0005a\u0000\u0000J[\u0005s\u0000\u0000KL\u0005"+
		"u\u0000\u0000LM\u0005n\u0000\u0000MN\u0005i\u0000\u0000NO\u0005d\u0000"+
		"\u0000OP\u0005a\u0000\u0000PQ\u0005d\u0000\u0000Q[\u0005e\u0000\u0000"+
		"RS\u0005u\u0000\u0000ST\u0005n\u0000\u0000TU\u0005i\u0000\u0000UV\u0005"+
		"d\u0000\u0000VW\u0005a\u0000\u0000WX\u0005d\u0000\u0000XY\u0005e\u0000"+
		"\u0000Y[\u0005s\u0000\u0000Z8\u0001\u0000\u0000\u0000Z>\u0001\u0000\u0000"+
		"\u0000ZE\u0001\u0000\u0000\u0000ZK\u0001\u0000\u0000\u0000ZR\u0001\u0000"+
		"\u0000\u0000[\b\u0001\u0000\u0000\u0000\\`\u0007\u0000\u0000\u0000]_\u0007"+
		"\u0001\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\n\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g\f\u0001\u0000\u0000\u0000hj\u0005\r\u0000\u0000ih"+
		"\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000kl\u0005\n\u0000\u0000l\u000e\u0001\u0000\u0000\u0000mo\u0007\u0003"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0006\u0007\u0000\u0000s\u0010\u0001\u0000\u0000\u0000\u0006\u0000"+
		"Z`fip\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}