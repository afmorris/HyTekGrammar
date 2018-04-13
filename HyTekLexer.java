// Generated from HyTek.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HyTekLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, INT=14, NEWLINE=15, WS=16, SEPARATOR=17, 
		DQPLACE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "ID", "INT", "NEWLINE", "WS", "SEPARATOR", "DQPLACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Licensed to '", "'HY-TEK's Meet Manager'", "'/'", "':'", "'AM'", 
		"'PM'", "'-'", "'Results'", "'Event'", "'Girls'", "'Boys'", "'.'", null, 
		null, null, null, "'='", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ID", "INT", "NEWLINE", "WS", "SEPARATOR", "DQPLACE"
	};
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


	public HyTekLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HyTek.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\6\16s\n\16\r\16\16\16t\3\17"+
		"\6\17x\n\17\r\17\16\17y\3\20\5\20}\n\20\3\20\3\20\3\21\6\21\u0082\n\21"+
		"\r\21\16\21\u0083\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\3\2\5\6\2$%//C\\c|\3\2\62;\4\2\13\13\"\"\2\u008f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\3\'\3\2\2\2\5\64\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rQ\3\2\2"+
		"\2\17T\3\2\2\2\21V\3\2\2\2\23^\3\2\2\2\25d\3\2\2\2\27j\3\2\2\2\31o\3\2"+
		"\2\2\33r\3\2\2\2\35w\3\2\2\2\37|\3\2\2\2!\u0081\3\2\2\2#\u0087\3\2\2\2"+
		"%\u0089\3\2\2\2\'(\7N\2\2()\7k\2\2)*\7e\2\2*+\7g\2\2+,\7p\2\2,-\7u\2\2"+
		"-.\7g\2\2./\7f\2\2/\60\7\"\2\2\60\61\7v\2\2\61\62\7q\2\2\62\63\7\"\2\2"+
		"\63\4\3\2\2\2\64\65\7J\2\2\65\66\7[\2\2\66\67\7/\2\2\678\7V\2\289\7G\2"+
		"\29:\7M\2\2:;\7)\2\2;<\7u\2\2<=\7\"\2\2=>\7O\2\2>?\7g\2\2?@\7g\2\2@A\7"+
		"v\2\2AB\7\"\2\2BC\7O\2\2CD\7c\2\2DE\7p\2\2EF\7c\2\2FG\7i\2\2GH\7g\2\2"+
		"HI\7t\2\2I\6\3\2\2\2JK\7\61\2\2K\b\3\2\2\2LM\7<\2\2M\n\3\2\2\2NO\7C\2"+
		"\2OP\7O\2\2P\f\3\2\2\2QR\7R\2\2RS\7O\2\2S\16\3\2\2\2TU\7/\2\2U\20\3\2"+
		"\2\2VW\7T\2\2WX\7g\2\2XY\7u\2\2YZ\7w\2\2Z[\7n\2\2[\\\7v\2\2\\]\7u\2\2"+
		"]\22\3\2\2\2^_\7G\2\2_`\7x\2\2`a\7g\2\2ab\7p\2\2bc\7v\2\2c\24\3\2\2\2"+
		"de\7I\2\2ef\7k\2\2fg\7t\2\2gh\7n\2\2hi\7u\2\2i\26\3\2\2\2jk\7D\2\2kl\7"+
		"q\2\2lm\7{\2\2mn\7u\2\2n\30\3\2\2\2op\7\60\2\2p\32\3\2\2\2qs\t\2\2\2r"+
		"q\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\34\3\2\2\2vx\t\3\2\2wv\3\2\2"+
		"\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\36\3\2\2\2{}\7\17\2\2|{\3\2\2\2|}\3"+
		"\2\2\2}~\3\2\2\2~\177\7\f\2\2\177 \3\2\2\2\u0080\u0082\t\4\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\b\21\2\2\u0086\"\3\2\2\2\u0087\u0088\7?\2\2"+
		"\u0088$\3\2\2\2\u0089\u008a\7/\2\2\u008a\u008b\7/\2\2\u008b&\3\2\2\2\7"+
		"\2ty|\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}