//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:\Users\antho\source\repos\HyTekGrammar\HyTek.g4 by ANTLR 4.7.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7.1")]
[System.CLSCompliant(false)]
public partial class HyTekLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		INTEGER_NUMBER=1, LICENSEDTO=2, HYTEK=3, RESULTS=4, EVENT=5, GIRLS=6, 
		BOYS=7, FINALS=8, DOT=9, METERS=10, NOWIND=11, LPAREN=12, RPAREN=13, DASH=14, 
		APOSTROPHE=15, COLON=16, FALSESTART=17, NOHEIGHT=18, DISQUALIFIED=19, 
		FOUL=20, NOTIME=21, TIE=22, AM=23, PM=24, SLASH=25, NUMBERSIGN=26, QUALIFY=27, 
		DQPLACE=28, SEPARATOR=29, INT=30, ID=31, NEWLINE=32, WS=33;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"INTEGER_NUMBER", "DIGIT", "LICENSEDTO", "HYTEK", "RESULTS", "EVENT", 
		"GIRLS", "BOYS", "FINALS", "DOT", "METERS", "NOWIND", "LPAREN", "RPAREN", 
		"DASH", "APOSTROPHE", "COLON", "FALSESTART", "NOHEIGHT", "DISQUALIFIED", 
		"FOUL", "NOTIME", "TIE", "AM", "PM", "SLASH", "NUMBERSIGN", "QUALIFY", 
		"DQPLACE", "SEPARATOR", "INT", "ID", "NEWLINE", "WS"
	};


	public HyTekLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public HyTekLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, null, "'Licensed to'", "'HY-TEK's Meet Manager'", "'Results'", "'Event'", 
		"'Girls'", "'Boys'", "'Finals'", "'.'", "'m'", "'NWI'", "'('", "')'", 
		"'-'", "'''", "':'", "'FS'", "'NH'", "'DQ'", "'FOUL'", "'NT'", "'J'", 
		"'AM'", "'PM'", "'/'", "'#'", null, "'--'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "INTEGER_NUMBER", "LICENSEDTO", "HYTEK", "RESULTS", "EVENT", "GIRLS", 
		"BOYS", "FINALS", "DOT", "METERS", "NOWIND", "LPAREN", "RPAREN", "DASH", 
		"APOSTROPHE", "COLON", "FALSESTART", "NOHEIGHT", "DISQUALIFIED", "FOUL", 
		"NOTIME", "TIE", "AM", "PM", "SLASH", "NUMBERSIGN", "QUALIFY", "DQPLACE", 
		"SEPARATOR", "INT", "ID", "NEWLINE", "WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "HyTek.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static HyTekLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '#', '\xDF', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x3', '\x2', '\x6', '\x2', 'I', '\n', '\x2', '\r', '\x2', 
		'\xE', '\x2', 'J', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\a', '\x3', '\a', '\x3', '\a', '\x3', '\a', '\x3', '\a', '\x3', 
		'\a', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', 
		'\x3', '\b', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', 
		'\t', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', 
		'\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', '\f', '\x3', 
		'\f', '\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\x10', '\x3', '\x10', 
		'\x3', '\x11', '\x3', '\x11', '\x3', '\x12', '\x3', '\x12', '\x3', '\x13', 
		'\x3', '\x13', '\x3', '\x13', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', 
		'\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', '\x16', '\x3', '\x16', 
		'\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', '\x3', '\x17', 
		'\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x19', '\x3', '\x19', 
		'\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1B', 
		'\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1D', '\x3', '\x1D', 
		'\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1F', '\x6', '\x1F', 
		'\xC6', '\n', '\x1F', '\r', '\x1F', '\xE', '\x1F', '\xC7', '\x3', ' ', 
		'\x6', ' ', '\xCB', '\n', ' ', '\r', ' ', '\xE', ' ', '\xCC', '\x3', '!', 
		'\x6', '!', '\xD0', '\n', '!', '\r', '!', '\xE', '!', '\xD1', '\x3', '\"', 
		'\x5', '\"', '\xD5', '\n', '\"', '\x3', '\"', '\x3', '\"', '\x3', '#', 
		'\x6', '#', '\xDA', '\n', '#', '\r', '#', '\xE', '#', '\xDB', '\x3', '#', 
		'\x3', '#', '\x2', '\x2', '$', '\x3', '\x3', '\x5', '\x2', '\a', '\x4', 
		'\t', '\x5', '\v', '\x6', '\r', '\a', '\xF', '\b', '\x11', '\t', '\x13', 
		'\n', '\x15', '\v', '\x17', '\f', '\x19', '\r', '\x1B', '\xE', '\x1D', 
		'\xF', '\x1F', '\x10', '!', '\x11', '#', '\x12', '%', '\x13', '\'', '\x14', 
		')', '\x15', '+', '\x16', '-', '\x17', '/', '\x18', '\x31', '\x19', '\x33', 
		'\x1A', '\x35', '\x1B', '\x37', '\x1C', '\x39', '\x1D', ';', '\x1E', '=', 
		'\x1F', '?', ' ', '\x41', '!', '\x43', '\"', '\x45', '#', '\x3', '\x2', 
		'\x6', '\x4', '\x2', 'S', 'S', 's', 's', '\x3', '\x2', '\x32', ';', '\b', 
		'\x2', '$', '%', ')', ')', '.', '\x30', '<', '<', '\x43', '\\', '\x63', 
		'|', '\x4', '\x2', '\v', '\v', '\"', '\"', '\x2', '\xE3', '\x2', '\x3', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\t', '\x3', '\x2', '\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\r', '\x3', '\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x17', '\x3', '\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'!', '\x3', '\x2', '\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '%', '\x3', '\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', 
		'\x2', '\x2', ')', '\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x33', '\x3', '\x2', '\x2', '\x2', '\x2', '\x35', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x37', '\x3', '\x2', '\x2', '\x2', '\x2', '\x39', '\x3', 
		'\x2', '\x2', '\x2', '\x2', ';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '?', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x41', '\x3', '\x2', '\x2', '\x2', '\x2', '\x43', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x45', '\x3', '\x2', '\x2', '\x2', '\x3', 'H', '\x3', '\x2', 
		'\x2', '\x2', '\x5', 'L', '\x3', '\x2', '\x2', '\x2', '\a', 'N', '\x3', 
		'\x2', '\x2', '\x2', '\t', 'Z', '\x3', '\x2', '\x2', '\x2', '\v', 'p', 
		'\x3', '\x2', '\x2', '\x2', '\r', 'x', '\x3', '\x2', '\x2', '\x2', '\xF', 
		'~', '\x3', '\x2', '\x2', '\x2', '\x11', '\x84', '\x3', '\x2', '\x2', 
		'\x2', '\x13', '\x89', '\x3', '\x2', '\x2', '\x2', '\x15', '\x90', '\x3', 
		'\x2', '\x2', '\x2', '\x17', '\x92', '\x3', '\x2', '\x2', '\x2', '\x19', 
		'\x94', '\x3', '\x2', '\x2', '\x2', '\x1B', '\x98', '\x3', '\x2', '\x2', 
		'\x2', '\x1D', '\x9A', '\x3', '\x2', '\x2', '\x2', '\x1F', '\x9C', '\x3', 
		'\x2', '\x2', '\x2', '!', '\x9E', '\x3', '\x2', '\x2', '\x2', '#', '\xA0', 
		'\x3', '\x2', '\x2', '\x2', '%', '\xA2', '\x3', '\x2', '\x2', '\x2', '\'', 
		'\xA5', '\x3', '\x2', '\x2', '\x2', ')', '\xA8', '\x3', '\x2', '\x2', 
		'\x2', '+', '\xAB', '\x3', '\x2', '\x2', '\x2', '-', '\xB0', '\x3', '\x2', 
		'\x2', '\x2', '/', '\xB3', '\x3', '\x2', '\x2', '\x2', '\x31', '\xB5', 
		'\x3', '\x2', '\x2', '\x2', '\x33', '\xB8', '\x3', '\x2', '\x2', '\x2', 
		'\x35', '\xBB', '\x3', '\x2', '\x2', '\x2', '\x37', '\xBD', '\x3', '\x2', 
		'\x2', '\x2', '\x39', '\xBF', '\x3', '\x2', '\x2', '\x2', ';', '\xC1', 
		'\x3', '\x2', '\x2', '\x2', '=', '\xC5', '\x3', '\x2', '\x2', '\x2', '?', 
		'\xCA', '\x3', '\x2', '\x2', '\x2', '\x41', '\xCF', '\x3', '\x2', '\x2', 
		'\x2', '\x43', '\xD4', '\x3', '\x2', '\x2', '\x2', '\x45', '\xD9', '\x3', 
		'\x2', '\x2', '\x2', 'G', 'I', '\x5', '\x5', '\x3', '\x2', 'H', 'G', '\x3', 
		'\x2', '\x2', '\x2', 'I', 'J', '\x3', '\x2', '\x2', '\x2', 'J', 'H', '\x3', 
		'\x2', '\x2', '\x2', 'J', 'K', '\x3', '\x2', '\x2', '\x2', 'K', '\x4', 
		'\x3', '\x2', '\x2', '\x2', 'L', 'M', '\x4', '\x32', ';', '\x2', 'M', 
		'\x6', '\x3', '\x2', '\x2', '\x2', 'N', 'O', '\a', 'N', '\x2', '\x2', 
		'O', 'P', '\a', 'k', '\x2', '\x2', 'P', 'Q', '\a', '\x65', '\x2', '\x2', 
		'Q', 'R', '\a', 'g', '\x2', '\x2', 'R', 'S', '\a', 'p', '\x2', '\x2', 
		'S', 'T', '\a', 'u', '\x2', '\x2', 'T', 'U', '\a', 'g', '\x2', '\x2', 
		'U', 'V', '\a', '\x66', '\x2', '\x2', 'V', 'W', '\a', '\"', '\x2', '\x2', 
		'W', 'X', '\a', 'v', '\x2', '\x2', 'X', 'Y', '\a', 'q', '\x2', '\x2', 
		'Y', '\b', '\x3', '\x2', '\x2', '\x2', 'Z', '[', '\a', 'J', '\x2', '\x2', 
		'[', '\\', '\a', '[', '\x2', '\x2', '\\', ']', '\a', '/', '\x2', '\x2', 
		']', '^', '\a', 'V', '\x2', '\x2', '^', '_', '\a', 'G', '\x2', '\x2', 
		'_', '`', '\a', 'M', '\x2', '\x2', '`', '\x61', '\a', ')', '\x2', '\x2', 
		'\x61', '\x62', '\a', 'u', '\x2', '\x2', '\x62', '\x63', '\a', '\"', '\x2', 
		'\x2', '\x63', '\x64', '\a', 'O', '\x2', '\x2', '\x64', '\x65', '\a', 
		'g', '\x2', '\x2', '\x65', '\x66', '\a', 'g', '\x2', '\x2', '\x66', 'g', 
		'\a', 'v', '\x2', '\x2', 'g', 'h', '\a', '\"', '\x2', '\x2', 'h', 'i', 
		'\a', 'O', '\x2', '\x2', 'i', 'j', '\a', '\x63', '\x2', '\x2', 'j', 'k', 
		'\a', 'p', '\x2', '\x2', 'k', 'l', '\a', '\x63', '\x2', '\x2', 'l', 'm', 
		'\a', 'i', '\x2', '\x2', 'm', 'n', '\a', 'g', '\x2', '\x2', 'n', 'o', 
		'\a', 't', '\x2', '\x2', 'o', '\n', '\x3', '\x2', '\x2', '\x2', 'p', 'q', 
		'\a', 'T', '\x2', '\x2', 'q', 'r', '\a', 'g', '\x2', '\x2', 'r', 's', 
		'\a', 'u', '\x2', '\x2', 's', 't', '\a', 'w', '\x2', '\x2', 't', 'u', 
		'\a', 'n', '\x2', '\x2', 'u', 'v', '\a', 'v', '\x2', '\x2', 'v', 'w', 
		'\a', 'u', '\x2', '\x2', 'w', '\f', '\x3', '\x2', '\x2', '\x2', 'x', 'y', 
		'\a', 'G', '\x2', '\x2', 'y', 'z', '\a', 'x', '\x2', '\x2', 'z', '{', 
		'\a', 'g', '\x2', '\x2', '{', '|', '\a', 'p', '\x2', '\x2', '|', '}', 
		'\a', 'v', '\x2', '\x2', '}', '\xE', '\x3', '\x2', '\x2', '\x2', '~', 
		'\x7F', '\a', 'I', '\x2', '\x2', '\x7F', '\x80', '\a', 'k', '\x2', '\x2', 
		'\x80', '\x81', '\a', 't', '\x2', '\x2', '\x81', '\x82', '\a', 'n', '\x2', 
		'\x2', '\x82', '\x83', '\a', 'u', '\x2', '\x2', '\x83', '\x10', '\x3', 
		'\x2', '\x2', '\x2', '\x84', '\x85', '\a', '\x44', '\x2', '\x2', '\x85', 
		'\x86', '\a', 'q', '\x2', '\x2', '\x86', '\x87', '\a', '{', '\x2', '\x2', 
		'\x87', '\x88', '\a', 'u', '\x2', '\x2', '\x88', '\x12', '\x3', '\x2', 
		'\x2', '\x2', '\x89', '\x8A', '\a', 'H', '\x2', '\x2', '\x8A', '\x8B', 
		'\a', 'k', '\x2', '\x2', '\x8B', '\x8C', '\a', 'p', '\x2', '\x2', '\x8C', 
		'\x8D', '\a', '\x63', '\x2', '\x2', '\x8D', '\x8E', '\a', 'n', '\x2', 
		'\x2', '\x8E', '\x8F', '\a', 'u', '\x2', '\x2', '\x8F', '\x14', '\x3', 
		'\x2', '\x2', '\x2', '\x90', '\x91', '\a', '\x30', '\x2', '\x2', '\x91', 
		'\x16', '\x3', '\x2', '\x2', '\x2', '\x92', '\x93', '\a', 'o', '\x2', 
		'\x2', '\x93', '\x18', '\x3', '\x2', '\x2', '\x2', '\x94', '\x95', '\a', 
		'P', '\x2', '\x2', '\x95', '\x96', '\a', 'Y', '\x2', '\x2', '\x96', '\x97', 
		'\a', 'K', '\x2', '\x2', '\x97', '\x1A', '\x3', '\x2', '\x2', '\x2', '\x98', 
		'\x99', '\a', '*', '\x2', '\x2', '\x99', '\x1C', '\x3', '\x2', '\x2', 
		'\x2', '\x9A', '\x9B', '\a', '+', '\x2', '\x2', '\x9B', '\x1E', '\x3', 
		'\x2', '\x2', '\x2', '\x9C', '\x9D', '\a', '/', '\x2', '\x2', '\x9D', 
		' ', '\x3', '\x2', '\x2', '\x2', '\x9E', '\x9F', '\a', ')', '\x2', '\x2', 
		'\x9F', '\"', '\x3', '\x2', '\x2', '\x2', '\xA0', '\xA1', '\a', '<', '\x2', 
		'\x2', '\xA1', '$', '\x3', '\x2', '\x2', '\x2', '\xA2', '\xA3', '\a', 
		'H', '\x2', '\x2', '\xA3', '\xA4', '\a', 'U', '\x2', '\x2', '\xA4', '&', 
		'\x3', '\x2', '\x2', '\x2', '\xA5', '\xA6', '\a', 'P', '\x2', '\x2', '\xA6', 
		'\xA7', '\a', 'J', '\x2', '\x2', '\xA7', '(', '\x3', '\x2', '\x2', '\x2', 
		'\xA8', '\xA9', '\a', '\x46', '\x2', '\x2', '\xA9', '\xAA', '\a', 'S', 
		'\x2', '\x2', '\xAA', '*', '\x3', '\x2', '\x2', '\x2', '\xAB', '\xAC', 
		'\a', 'H', '\x2', '\x2', '\xAC', '\xAD', '\a', 'Q', '\x2', '\x2', '\xAD', 
		'\xAE', '\a', 'W', '\x2', '\x2', '\xAE', '\xAF', '\a', 'N', '\x2', '\x2', 
		'\xAF', ',', '\x3', '\x2', '\x2', '\x2', '\xB0', '\xB1', '\a', 'P', '\x2', 
		'\x2', '\xB1', '\xB2', '\a', 'V', '\x2', '\x2', '\xB2', '.', '\x3', '\x2', 
		'\x2', '\x2', '\xB3', '\xB4', '\a', 'L', '\x2', '\x2', '\xB4', '\x30', 
		'\x3', '\x2', '\x2', '\x2', '\xB5', '\xB6', '\a', '\x43', '\x2', '\x2', 
		'\xB6', '\xB7', '\a', 'O', '\x2', '\x2', '\xB7', '\x32', '\x3', '\x2', 
		'\x2', '\x2', '\xB8', '\xB9', '\a', 'R', '\x2', '\x2', '\xB9', '\xBA', 
		'\a', 'O', '\x2', '\x2', '\xBA', '\x34', '\x3', '\x2', '\x2', '\x2', '\xBB', 
		'\xBC', '\a', '\x31', '\x2', '\x2', '\xBC', '\x36', '\x3', '\x2', '\x2', 
		'\x2', '\xBD', '\xBE', '\a', '%', '\x2', '\x2', '\xBE', '\x38', '\x3', 
		'\x2', '\x2', '\x2', '\xBF', '\xC0', '\t', '\x2', '\x2', '\x2', '\xC0', 
		':', '\x3', '\x2', '\x2', '\x2', '\xC1', '\xC2', '\a', '/', '\x2', '\x2', 
		'\xC2', '\xC3', '\a', '/', '\x2', '\x2', '\xC3', '<', '\x3', '\x2', '\x2', 
		'\x2', '\xC4', '\xC6', '\a', '?', '\x2', '\x2', '\xC5', '\xC4', '\x3', 
		'\x2', '\x2', '\x2', '\xC6', '\xC7', '\x3', '\x2', '\x2', '\x2', '\xC7', 
		'\xC5', '\x3', '\x2', '\x2', '\x2', '\xC7', '\xC8', '\x3', '\x2', '\x2', 
		'\x2', '\xC8', '>', '\x3', '\x2', '\x2', '\x2', '\xC9', '\xCB', '\t', 
		'\x3', '\x2', '\x2', '\xCA', '\xC9', '\x3', '\x2', '\x2', '\x2', '\xCB', 
		'\xCC', '\x3', '\x2', '\x2', '\x2', '\xCC', '\xCA', '\x3', '\x2', '\x2', 
		'\x2', '\xCC', '\xCD', '\x3', '\x2', '\x2', '\x2', '\xCD', '@', '\x3', 
		'\x2', '\x2', '\x2', '\xCE', '\xD0', '\t', '\x4', '\x2', '\x2', '\xCF', 
		'\xCE', '\x3', '\x2', '\x2', '\x2', '\xD0', '\xD1', '\x3', '\x2', '\x2', 
		'\x2', '\xD1', '\xCF', '\x3', '\x2', '\x2', '\x2', '\xD1', '\xD2', '\x3', 
		'\x2', '\x2', '\x2', '\xD2', '\x42', '\x3', '\x2', '\x2', '\x2', '\xD3', 
		'\xD5', '\a', '\xF', '\x2', '\x2', '\xD4', '\xD3', '\x3', '\x2', '\x2', 
		'\x2', '\xD4', '\xD5', '\x3', '\x2', '\x2', '\x2', '\xD5', '\xD6', '\x3', 
		'\x2', '\x2', '\x2', '\xD6', '\xD7', '\a', '\f', '\x2', '\x2', '\xD7', 
		'\x44', '\x3', '\x2', '\x2', '\x2', '\xD8', '\xDA', '\t', '\x5', '\x2', 
		'\x2', '\xD9', '\xD8', '\x3', '\x2', '\x2', '\x2', '\xDA', '\xDB', '\x3', 
		'\x2', '\x2', '\x2', '\xDB', '\xD9', '\x3', '\x2', '\x2', '\x2', '\xDB', 
		'\xDC', '\x3', '\x2', '\x2', '\x2', '\xDC', '\xDD', '\x3', '\x2', '\x2', 
		'\x2', '\xDD', '\xDE', '\b', '#', '\x2', '\x2', '\xDE', '\x46', '\x3', 
		'\x2', '\x2', '\x2', '\t', '\x2', 'J', '\xC7', '\xCC', '\xD1', '\xD4', 
		'\xDB', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
