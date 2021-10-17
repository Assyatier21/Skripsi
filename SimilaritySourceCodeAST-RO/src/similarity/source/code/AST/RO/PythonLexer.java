// Generated from Python.g4 by ANTLR 4.4

package similarity.source.code.AST.RO;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, COL=16, SCOL=17, ASSIGN=18, OPAR=19, 
		CPAR=20, OBRACE=21, CBRACE=22, TAB=23, TRUE=24, FALSE=25, NIL=26, IF=27, 
		ELSE=28, ELIF=29, WHILE=30, PRINT=31, ID=32, INT=33, FLOAT=34, STRING=35, 
		COMMENT=36, SPACE=37, OTHER=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'"
	};
	public static final String[] ruleNames = {
		"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "NOT", "COL", "SCOL", "ASSIGN", "OPAR", "CPAR", 
		"OBRACE", "CBRACE", "TAB", "TRUE", "FALSE", "NIL", "IF", "ELSE", "ELIF", 
		"WHILE", "PRINT", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", 
		"OTHER"
	};


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\7!\u00af\n!\f!"+
		"\16!\u00b2\13!\3\"\6\"\u00b5\n\"\r\"\16\"\u00b6\3#\6#\u00ba\n#\r#\16#"+
		"\u00bb\3#\3#\7#\u00c0\n#\f#\16#\u00c3\13#\3#\3#\6#\u00c7\n#\r#\16#\u00c8"+
		"\5#\u00cb\n#\3$\3$\3$\3$\7$\u00d1\n$\f$\16$\u00d4\13$\3$\3$\3%\3%\7%\u00da"+
		"\n%\f%\16%\u00dd\13%\3%\3%\3&\3&\3&\3&\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17"+
		"\17\5\2\f\f\17\17\"\"\u00ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2"+
		"\2\2\5R\3\2\2\2\7V\3\2\2\2\tY\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17`\3\2"+
		"\2\2\21c\3\2\2\2\23f\3\2\2\2\25h\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3"+
		"\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2"+
		"\2)|\3\2\2\2+~\3\2\2\2-\u0080\3\2\2\2/\u0082\3\2\2\2\61\u0084\3\2\2\2"+
		"\63\u0089\3\2\2\2\65\u008f\3\2\2\2\67\u0093\3\2\2\29\u0096\3\2\2\2;\u009b"+
		"\3\2\2\2=\u00a0\3\2\2\2?\u00a6\3\2\2\2A\u00ac\3\2\2\2C\u00b4\3\2\2\2E"+
		"\u00ca\3\2\2\2G\u00cc\3\2\2\2I\u00d7\3\2\2\2K\u00e0\3\2\2\2M\u00e4\3\2"+
		"\2\2OP\7q\2\2PQ\7t\2\2Q\4\3\2\2\2RS\7c\2\2ST\7p\2\2TU\7f\2\2U\6\3\2\2"+
		"\2VW\7?\2\2WX\7?\2\2X\b\3\2\2\2YZ\7#\2\2Z[\7?\2\2[\n\3\2\2\2\\]\7@\2\2"+
		"]\f\3\2\2\2^_\7>\2\2_\16\3\2\2\2`a\7@\2\2ab\7?\2\2b\20\3\2\2\2cd\7>\2"+
		"\2de\7?\2\2e\22\3\2\2\2fg\7-\2\2g\24\3\2\2\2hi\7/\2\2i\26\3\2\2\2jk\7"+
		",\2\2k\30\3\2\2\2lm\7\61\2\2m\32\3\2\2\2no\7\'\2\2o\34\3\2\2\2pq\7`\2"+
		"\2q\36\3\2\2\2rs\7#\2\2s \3\2\2\2tu\7<\2\2u\"\3\2\2\2vw\7=\2\2w$\3\2\2"+
		"\2xy\7?\2\2y&\3\2\2\2z{\7*\2\2{(\3\2\2\2|}\7+\2\2}*\3\2\2\2~\177\7}\2"+
		"\2\177,\3\2\2\2\u0080\u0081\7\177\2\2\u0081.\3\2\2\2\u0082\u0083\7\13"+
		"\2\2\u0083\60\3\2\2\2\u0084\u0085\7v\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7w\2\2\u0087\u0088\7g\2\2\u0088\62\3\2\2\2\u0089\u008a\7h\2\2\u008a\u008b"+
		"\7c\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e"+
		"\64\3\2\2\2\u008f\u0090\7p\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092"+
		"\66\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7h\2\2\u00958\3\2\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2"+
		"\u009a:\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7k\2"+
		"\2\u009e\u009f\7h\2\2\u009f<\3\2\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2\7"+
		"j\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5>"+
		"\3\2\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab@\3\2\2\2\u00ac\u00b0\t\2\2\2\u00ad"+
		"\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1B\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5"+
		"\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7D\3\2\2\2\u00b8\u00ba\t\4\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00c1\7\60\2\2\u00be\u00c0\t\4\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cb"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\60\2\2\u00c5\u00c7\t\4\2\2"+
		"\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00b9\3\2\2\2\u00ca\u00c4\3\2\2\2\u00cb"+
		"F\3\2\2\2\u00cc\u00d2\7$\2\2\u00cd\u00d1\n\5\2\2\u00ce\u00cf\7$\2\2\u00cf"+
		"\u00d1\7$\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6H\3\2\2\2\u00d7\u00db\7%\2\2\u00d8"+
		"\u00da\n\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\b%\2\2\u00dfJ\3\2\2\2\u00e0\u00e1\t\7\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\b&\2\2\u00e3L\3\2\2\2\u00e4\u00e5\13\2\2\2\u00e5N\3\2\2\2\f\2\u00b0"+
		"\u00b6\u00bb\u00c1\u00c8\u00ca\u00d0\u00d2\u00db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}