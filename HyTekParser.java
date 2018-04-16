// Generated from HyTek.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HyTekParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, INTEGER_NUMBER=19, DQPLACE=20, SEPARATOR=21, INT=22, ID=23, 
		NEWLINE=24, WS=25;
	public static final int
		RULE_init = 0, RULE_file = 1, RULE_license = 2, RULE_licensee = 3, RULE_exportInfo = 4, 
		RULE_exportDate = 5, RULE_meetInfo = 6, RULE_meetName = 7, RULE_meetDate = 8, 
		RULE_meetLocation = 9, RULE_event = 10, RULE_eventInfo = 11, RULE_eventNumber = 12, 
		RULE_eventGender = 13, RULE_eventName = 14, RULE_eventHeader = 15, RULE_eventResult = 16, 
		RULE_individualResult = 17, RULE_relayResult = 18, RULE_legInfo = 19, 
		RULE_leg = 20, RULE_legNumber = 21, RULE_place = 22, RULE_athleteName = 23, 
		RULE_athleteYear = 24, RULE_schoolName = 25, RULE_seed = 26, RULE_time = 27, 
		RULE_distance = 28, RULE_performance = 29, RULE_heatNumber = 30, RULE_points = 31, 
		RULE_tiebreaker = 32, RULE_hour = 33, RULE_minute = 34, RULE_second = 35, 
		RULE_decimal = 36, RULE_period = 37, RULE_day = 38, RULE_month = 39, RULE_year = 40, 
		RULE_date = 41, RULE_clockTime = 42, RULE_foot = 43, RULE_inch = 44, RULE_number = 45, 
		RULE_words = 46;
	public static final String[] ruleNames = {
		"init", "file", "license", "licensee", "exportInfo", "exportDate", "meetInfo", 
		"meetName", "meetDate", "meetLocation", "event", "eventInfo", "eventNumber", 
		"eventGender", "eventName", "eventHeader", "eventResult", "individualResult", 
		"relayResult", "legInfo", "leg", "legNumber", "place", "athleteName", 
		"athleteYear", "schoolName", "seed", "time", "distance", "performance", 
		"heatNumber", "points", "tiebreaker", "hour", "minute", "second", "decimal", 
		"period", "day", "month", "year", "date", "clockTime", "foot", "inch", 
		"number", "words"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Licensed to'", "'-'", "'HY-TEK's Meet Manager'", "'Results'", 
		"'Event'", "'Girls'", "'Boys'", "')'", "'''", "':'", "'.'", "'FS'", "'NH'", 
		"'DQ'", "'FOUL'", "'AM'", "'PM'", "'/'", null, "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "INTEGER_NUMBER", "DQPLACE", 
		"SEPARATOR", "INT", "ID", "NEWLINE", "WS"
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

	@Override
	public String getGrammarFileName() { return "HyTek.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HyTekParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			file();
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

	public static class FileContext extends ParserRuleContext {
		public LicenseContext license() {
			return getRuleContext(LicenseContext.class,0);
		}
		public ExportInfoContext exportInfo() {
			return getRuleContext(ExportInfoContext.class,0);
		}
		public MeetInfoContext meetInfo() {
			return getRuleContext(MeetInfoContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(HyTekParser.NEWLINE, 0); }
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			license();
			setState(97);
			exportInfo();
			setState(98);
			meetInfo();
			setState(99);
			match(NEWLINE);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				event();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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

	public static class LicenseContext extends ParserRuleContext {
		public LicenseeContext licensee() {
			return getRuleContext(LicenseeContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(HyTekParser.NEWLINE, 0); }
		public LicenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_license; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterLicense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitLicense(this);
		}
	}

	public final LicenseContext license() throws RecognitionException {
		LicenseContext _localctx = new LicenseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_license);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__0);
			setState(106);
			licensee();
			setState(107);
			match(NEWLINE);
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

	public static class LicenseeContext extends ParserRuleContext {
		public List<WordsContext> words() {
			return getRuleContexts(WordsContext.class);
		}
		public WordsContext words(int i) {
			return getRuleContext(WordsContext.class,i);
		}
		public LicenseeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_licensee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterLicensee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitLicensee(this);
		}
	}

	public final LicenseeContext licensee() throws RecognitionException {
		LicenseeContext _localctx = new LicenseeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_licensee);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			words();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(110);
				match(T__1);
				}
			}

			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(113);
				words();
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

	public static class ExportInfoContext extends ParserRuleContext {
		public ExportDateContext exportDate() {
			return getRuleContext(ExportDateContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(HyTekParser.NEWLINE, 0); }
		public ExportInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterExportInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitExportInfo(this);
		}
	}

	public final ExportInfoContext exportInfo() throws RecognitionException {
		ExportInfoContext _localctx = new ExportInfoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exportInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__2);
			setState(117);
			exportDate();
			setState(118);
			match(NEWLINE);
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

	public static class ExportDateContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public ClockTimeContext clockTime() {
			return getRuleContext(ClockTimeContext.class,0);
		}
		public ExportDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterExportDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitExportDate(this);
		}
	}

	public final ExportDateContext exportDate() throws RecognitionException {
		ExportDateContext _localctx = new ExportDateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exportDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			date();
			setState(121);
			clockTime();
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

	public static class MeetInfoContext extends ParserRuleContext {
		public MeetNameContext meetName() {
			return getRuleContext(MeetNameContext.class,0);
		}
		public MeetDateContext meetDate() {
			return getRuleContext(MeetDateContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HyTekParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HyTekParser.NEWLINE, i);
		}
		public MeetLocationContext meetLocation() {
			return getRuleContext(MeetLocationContext.class,0);
		}
		public MeetInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meetInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterMeetInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitMeetInfo(this);
		}
	}

	public final MeetInfoContext meetInfo() throws RecognitionException {
		MeetInfoContext _localctx = new MeetInfoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_meetInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			meetName();
			setState(124);
			match(T__1);
			setState(125);
			meetDate();
			setState(126);
			match(NEWLINE);
			setState(127);
			meetLocation();
			setState(128);
			match(NEWLINE);
			setState(129);
			match(T__3);
			setState(130);
			match(NEWLINE);
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

	public static class MeetNameContext extends ParserRuleContext {
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public MeetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterMeetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitMeetName(this);
		}
	}

	public final MeetNameContext meetName() throws RecognitionException {
		MeetNameContext _localctx = new MeetNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_meetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			words();
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

	public static class MeetDateContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public MeetDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meetDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterMeetDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitMeetDate(this);
		}
	}

	public final MeetDateContext meetDate() throws RecognitionException {
		MeetDateContext _localctx = new MeetDateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_meetDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			date();
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

	public static class MeetLocationContext extends ParserRuleContext {
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public MeetLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meetLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterMeetLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitMeetLocation(this);
		}
	}

	public final MeetLocationContext meetLocation() throws RecognitionException {
		MeetLocationContext _localctx = new MeetLocationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_meetLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			words();
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

	public static class EventContext extends ParserRuleContext {
		public EventInfoContext eventInfo() {
			return getRuleContext(EventInfoContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HyTekParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HyTekParser.NEWLINE, i);
		}
		public EventHeaderContext eventHeader() {
			return getRuleContext(EventHeaderContext.class,0);
		}
		public List<EventResultContext> eventResult() {
			return getRuleContexts(EventResultContext.class);
		}
		public EventResultContext eventResult(int i) {
			return getRuleContext(EventResultContext.class,i);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			eventInfo();
			setState(139);
			match(NEWLINE);
			setState(140);
			eventHeader();
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				eventResult();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER_NUMBER || _la==DQPLACE );
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				match(NEWLINE);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class EventInfoContext extends ParserRuleContext {
		public EventNumberContext eventNumber() {
			return getRuleContext(EventNumberContext.class,0);
		}
		public EventGenderContext eventGender() {
			return getRuleContext(EventGenderContext.class,0);
		}
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public EventInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterEventInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitEventInfo(this);
		}
	}

	public final EventInfoContext eventInfo() throws RecognitionException {
		EventInfoContext _localctx = new EventInfoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eventInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			eventNumber();
			setState(152);
			eventGender();
			setState(153);
			eventName();
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

	public static class EventNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public EventNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterEventNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitEventNumber(this);
		}
	}

	public final EventNumberContext eventNumber() throws RecognitionException {
		EventNumberContext _localctx = new EventNumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eventNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__4);
			setState(156);
			number();
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

	public static class EventGenderContext extends ParserRuleContext {
		public EventGenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventGender; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterEventGender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitEventGender(this);
		}
	}

	public final EventGenderContext eventGender() throws RecognitionException {
		EventGenderContext _localctx = new EventGenderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eventGender);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class EventNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HyTekParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HyTekParser.ID, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterEventName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitEventName(this);
		}
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eventName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(160);
					match(ID);
					}
					break;
				case INTEGER_NUMBER:
					{
					setState(161);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER_NUMBER || _la==ID );
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

	public static class EventHeaderContext extends ParserRuleContext {
		public List<TerminalNode> SEPARATOR() { return getTokens(HyTekParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(HyTekParser.SEPARATOR, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HyTekParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HyTekParser.NEWLINE, i);
		}
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public EventHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterEventHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitEventHeader(this);
		}
	}

	public final EventHeaderContext eventHeader() throws RecognitionException {
		EventHeaderContext _localctx = new EventHeaderContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eventHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(SEPARATOR);
			setState(167);
			match(NEWLINE);
			setState(168);
			words();
			setState(169);
			match(NEWLINE);
			setState(170);
			match(SEPARATOR);
			setState(171);
			match(NEWLINE);
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

	public static class EventResultContext extends ParserRuleContext {
		public IndividualResultContext individualResult() {
			return getRuleContext(IndividualResultContext.class,0);
		}
		public RelayResultContext relayResult() {
			return getRuleContext(RelayResultContext.class,0);
		}
		public EventResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterEventResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitEventResult(this);
		}
	}

	public final EventResultContext eventResult() throws RecognitionException {
		EventResultContext _localctx = new EventResultContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eventResult);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				individualResult();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				relayResult();
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

	public static class IndividualResultContext extends ParserRuleContext {
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public AthleteNameContext athleteName() {
			return getRuleContext(AthleteNameContext.class,0);
		}
		public SchoolNameContext schoolName() {
			return getRuleContext(SchoolNameContext.class,0);
		}
		public PerformanceContext performance() {
			return getRuleContext(PerformanceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(HyTekParser.NEWLINE, 0); }
		public AthleteYearContext athleteYear() {
			return getRuleContext(AthleteYearContext.class,0);
		}
		public SeedContext seed() {
			return getRuleContext(SeedContext.class,0);
		}
		public HeatNumberContext heatNumber() {
			return getRuleContext(HeatNumberContext.class,0);
		}
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public TiebreakerContext tiebreaker() {
			return getRuleContext(TiebreakerContext.class,0);
		}
		public IndividualResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individualResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterIndividualResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitIndividualResult(this);
		}
	}

	public final IndividualResultContext individualResult() throws RecognitionException {
		IndividualResultContext _localctx = new IndividualResultContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_individualResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			place();
			setState(178);
			athleteName();
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(179);
				athleteYear();
				}
				break;
			}
			setState(182);
			schoolName();
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(183);
				seed();
				}
				break;
			}
			setState(186);
			performance();
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(187);
				heatNumber();
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(190);
				points();
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << INTEGER_NUMBER))) != 0)) {
				{
				setState(193);
				tiebreaker();
				}
			}

			setState(196);
			match(NEWLINE);
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

	public static class RelayResultContext extends ParserRuleContext {
		public PlaceContext place() {
			return getRuleContext(PlaceContext.class,0);
		}
		public SchoolNameContext schoolName() {
			return getRuleContext(SchoolNameContext.class,0);
		}
		public PerformanceContext performance() {
			return getRuleContext(PerformanceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(HyTekParser.NEWLINE, 0); }
		public SeedContext seed() {
			return getRuleContext(SeedContext.class,0);
		}
		public HeatNumberContext heatNumber() {
			return getRuleContext(HeatNumberContext.class,0);
		}
		public PointsContext points() {
			return getRuleContext(PointsContext.class,0);
		}
		public TiebreakerContext tiebreaker() {
			return getRuleContext(TiebreakerContext.class,0);
		}
		public LegInfoContext legInfo() {
			return getRuleContext(LegInfoContext.class,0);
		}
		public RelayResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relayResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterRelayResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitRelayResult(this);
		}
	}

	public final RelayResultContext relayResult() throws RecognitionException {
		RelayResultContext _localctx = new RelayResultContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relayResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			place();
			setState(199);
			schoolName();
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(200);
				seed();
				}
				break;
			}
			setState(203);
			performance();
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(204);
				heatNumber();
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(207);
				points();
				}
				break;
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << INTEGER_NUMBER))) != 0)) {
				{
				setState(210);
				tiebreaker();
				}
			}

			setState(213);
			match(NEWLINE);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(214);
				legInfo();
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

	public static class LegInfoContext extends ParserRuleContext {
		public List<LegContext> leg() {
			return getRuleContexts(LegContext.class);
		}
		public LegContext leg(int i) {
			return getRuleContext(LegContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HyTekParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HyTekParser.NEWLINE, i);
		}
		public LegInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterLegInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitLegInfo(this);
		}
	}

	public final LegInfoContext legInfo() throws RecognitionException {
		LegInfoContext _localctx = new LegInfoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_legInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			leg();
			setState(218);
			leg();
			setState(219);
			match(NEWLINE);
			setState(220);
			leg();
			setState(221);
			leg();
			setState(222);
			match(NEWLINE);
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

	public static class LegContext extends ParserRuleContext {
		public LegNumberContext legNumber() {
			return getRuleContext(LegNumberContext.class,0);
		}
		public AthleteNameContext athleteName() {
			return getRuleContext(AthleteNameContext.class,0);
		}
		public AthleteYearContext athleteYear() {
			return getRuleContext(AthleteYearContext.class,0);
		}
		public LegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterLeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitLeg(this);
		}
	}

	public final LegContext leg() throws RecognitionException {
		LegContext _localctx = new LegContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_leg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			legNumber();
			setState(225);
			match(T__7);
			setState(226);
			athleteName();
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(227);
				athleteYear();
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

	public static class LegNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LegNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterLegNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitLegNumber(this);
		}
	}

	public final LegNumberContext legNumber() throws RecognitionException {
		LegNumberContext _localctx = new LegNumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_legNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			number();
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

	public static class PlaceContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DQPLACE() { return getToken(HyTekParser.DQPLACE, 0); }
		public PlaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_place; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterPlace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitPlace(this);
		}
	}

	public final PlaceContext place() throws RecognitionException {
		PlaceContext _localctx = new PlaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_place);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				number();
				}
				break;
			case DQPLACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(DQPLACE);
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

	public static class AthleteNameContext extends ParserRuleContext {
		public List<WordsContext> words() {
			return getRuleContexts(WordsContext.class);
		}
		public WordsContext words(int i) {
			return getRuleContext(WordsContext.class,i);
		}
		public AthleteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_athleteName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterAthleteName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitAthleteName(this);
		}
	}

	public final AthleteNameContext athleteName() throws RecognitionException {
		AthleteNameContext _localctx = new AthleteNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_athleteName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			words();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(237);
				match(T__1);
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(240);
				match(T__8);
				}
			}

			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(243);
				words();
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

	public static class AthleteYearContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AthleteYearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_athleteYear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterAthleteYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitAthleteYear(this);
		}
	}

	public final AthleteYearContext athleteYear() throws RecognitionException {
		AthleteYearContext _localctx = new AthleteYearContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_athleteYear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			number();
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

	public static class SchoolNameContext extends ParserRuleContext {
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public SchoolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schoolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterSchoolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitSchoolName(this);
		}
	}

	public final SchoolNameContext schoolName() throws RecognitionException {
		SchoolNameContext _localctx = new SchoolNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_schoolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			words();
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

	public static class SeedContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public SeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterSeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitSeed(this);
		}
	}

	public final SeedContext seed() throws RecognitionException {
		SeedContext _localctx = new SeedContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_seed);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				time();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				distance();
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

	public static class TimeContext extends ParserRuleContext {
		public SecondContext second() {
			return getRuleContext(SecondContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public MinuteContext minute() {
			return getRuleContext(MinuteContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_time);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(254);
					minute();
					}
					break;
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(257);
					match(T__9);
					}
				}

				setState(260);
				second();
				setState(261);
				match(T__10);
				setState(262);
				decimal();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(T__13);
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

	public static class DistanceContext extends ParserRuleContext {
		public FootContext foot() {
			return getRuleContext(FootContext.class,0);
		}
		public InchContext inch() {
			return getRuleContext(InchContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public DistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterDistance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitDistance(this);
		}
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_distance);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				foot();
				setState(270);
				match(T__1);
				setState(271);
				inch();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(272);
					match(T__10);
					}
				}

				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(275);
					decimal();
					}
					break;
				}
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(T__14);
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

	public static class PerformanceContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public PerformanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_performance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterPerformance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitPerformance(this);
		}
	}

	public final PerformanceContext performance() throws RecognitionException {
		PerformanceContext _localctx = new PerformanceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_performance);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				time();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				distance();
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

	public static class HeatNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public HeatNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heatNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterHeatNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitHeatNumber(this);
		}
	}

	public final HeatNumberContext heatNumber() throws RecognitionException {
		HeatNumberContext _localctx = new HeatNumberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_heatNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			number();
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

	public static class PointsContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_points; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterPoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitPoints(this);
		}
	}

	public final PointsContext points() throws RecognitionException {
		PointsContext _localctx = new PointsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_points);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			number();
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

	public static class TiebreakerContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public TiebreakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiebreaker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterTiebreaker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitTiebreaker(this);
		}
	}

	public final TiebreakerContext tiebreaker() throws RecognitionException {
		TiebreakerContext _localctx = new TiebreakerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tiebreaker);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				time();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				distance();
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

	public static class HourContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitHour(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(INTEGER_NUMBER);
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

	public static class MinuteContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public MinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitMinute(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(INTEGER_NUMBER);
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

	public static class SecondContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public SecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitSecond(this);
		}
	}

	public final SecondContext second() throws RecognitionException {
		SecondContext _localctx = new SecondContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(INTEGER_NUMBER);
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(INTEGER_NUMBER);
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

	public static class PeriodContext extends ParserRuleContext {
		public PeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterPeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitPeriod(this);
		}
	}

	public final PeriodContext period() throws RecognitionException {
		PeriodContext _localctx = new PeriodContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_period);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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

	public static class DayContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitDay(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(INTEGER_NUMBER);
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

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitMonth(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(INTEGER_NUMBER);
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

	public static class YearContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitYear(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(INTEGER_NUMBER);
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

	public static class DateContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			day();
			setState(310);
			match(T__17);
			setState(311);
			month();
			setState(312);
			match(T__17);
			setState(313);
			year();
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

	public static class ClockTimeContext extends ParserRuleContext {
		public HourContext hour() {
			return getRuleContext(HourContext.class,0);
		}
		public MinuteContext minute() {
			return getRuleContext(MinuteContext.class,0);
		}
		public PeriodContext period() {
			return getRuleContext(PeriodContext.class,0);
		}
		public SecondContext second() {
			return getRuleContext(SecondContext.class,0);
		}
		public ClockTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterClockTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitClockTime(this);
		}
	}

	public final ClockTimeContext clockTime() throws RecognitionException {
		ClockTimeContext _localctx = new ClockTimeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_clockTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			hour();
			setState(316);
			match(T__9);
			setState(317);
			minute();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(318);
				match(T__9);
				}
			}

			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER_NUMBER) {
				{
				setState(321);
				second();
				}
			}

			setState(324);
			period();
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

	public static class FootContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public FootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterFoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitFoot(this);
		}
	}

	public final FootContext foot() throws RecognitionException {
		FootContext _localctx = new FootContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_foot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(INTEGER_NUMBER);
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

	public static class InchContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public InchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterInch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitInch(this);
		}
	}

	public final InchContext inch() throws RecognitionException {
		InchContext _localctx = new InchContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_inch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(INTEGER_NUMBER);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(HyTekParser.INTEGER_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(INTEGER_NUMBER);
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

	public static class WordsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HyTekParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HyTekParser.ID, i);
		}
		public WordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).enterWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HyTekListener ) ((HyTekListener)listener).exitWords(this);
		}
	}

	public final WordsContext words() throws RecognitionException {
		WordsContext _localctx = new WordsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_words);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					match(ID);
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0155\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3h\n\3"+
		"\r\3\16\3i\3\4\3\4\3\4\3\4\3\5\3\5\5\5r\n\5\3\5\5\5u\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\6\f\u0091\n\f\r\f\16\f\u0092\3\f\6\f\u0096\n\f\r"+
		"\f\16\f\u0097\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\6\20"+
		"\u00a5\n\20\r\20\16\20\u00a6\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\5\22\u00b2\n\22\3\23\3\23\3\23\5\23\u00b7\n\23\3\23\3\23\5\23\u00bb"+
		"\n\23\3\23\3\23\5\23\u00bf\n\23\3\23\5\23\u00c2\n\23\3\23\5\23\u00c5\n"+
		"\23\3\23\3\23\3\24\3\24\3\24\5\24\u00cc\n\24\3\24\3\24\5\24\u00d0\n\24"+
		"\3\24\5\24\u00d3\n\24\3\24\5\24\u00d6\n\24\3\24\3\24\5\24\u00da\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00e7\n\26"+
		"\3\27\3\27\3\30\3\30\5\30\u00ed\n\30\3\31\3\31\5\31\u00f1\n\31\3\31\5"+
		"\31\u00f4\n\31\3\31\5\31\u00f7\n\31\3\32\3\32\3\33\3\33\3\34\3\34\5\34"+
		"\u00ff\n\34\3\35\5\35\u0102\n\35\3\35\5\35\u0105\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u010e\n\35\3\36\3\36\3\36\3\36\5\36\u0114\n\36"+
		"\3\36\5\36\u0117\n\36\3\36\5\36\u011a\n\36\3\37\3\37\5\37\u011e\n\37\3"+
		" \3 \3!\3!\3\"\3\"\5\"\u0126\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\5,\u0142\n,\3,\5,\u0145\n"+
		",\3,\3,\3-\3-\3.\3.\3/\3/\3\60\7\60\u0150\n\60\f\60\16\60\u0153\13\60"+
		"\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^\2\4\3\2\b\t\3\2\22\23\2\u014a\2`\3\2\2\2\4b\3"+
		"\2\2\2\6k\3\2\2\2\bo\3\2\2\2\nv\3\2\2\2\fz\3\2\2\2\16}\3\2\2\2\20\u0086"+
		"\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2\26\u008c\3\2\2\2\30\u0099\3"+
		"\2\2\2\32\u009d\3\2\2\2\34\u00a0\3\2\2\2\36\u00a4\3\2\2\2 \u00a8\3\2\2"+
		"\2\"\u00b1\3\2\2\2$\u00b3\3\2\2\2&\u00c8\3\2\2\2(\u00db\3\2\2\2*\u00e2"+
		"\3\2\2\2,\u00e8\3\2\2\2.\u00ec\3\2\2\2\60\u00ee\3\2\2\2\62\u00f8\3\2\2"+
		"\2\64\u00fa\3\2\2\2\66\u00fe\3\2\2\28\u010d\3\2\2\2:\u0119\3\2\2\2<\u011d"+
		"\3\2\2\2>\u011f\3\2\2\2@\u0121\3\2\2\2B\u0125\3\2\2\2D\u0127\3\2\2\2F"+
		"\u0129\3\2\2\2H\u012b\3\2\2\2J\u012d\3\2\2\2L\u012f\3\2\2\2N\u0131\3\2"+
		"\2\2P\u0133\3\2\2\2R\u0135\3\2\2\2T\u0137\3\2\2\2V\u013d\3\2\2\2X\u0148"+
		"\3\2\2\2Z\u014a\3\2\2\2\\\u014c\3\2\2\2^\u0151\3\2\2\2`a\5\4\3\2a\3\3"+
		"\2\2\2bc\5\6\4\2cd\5\n\6\2de\5\16\b\2eg\7\32\2\2fh\5\26\f\2gf\3\2\2\2"+
		"hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\5\3\2\2\2kl\7\3\2\2lm\5\b\5\2mn\7\32\2"+
		"\2n\7\3\2\2\2oq\5^\60\2pr\7\4\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5^\60"+
		"\2ts\3\2\2\2tu\3\2\2\2u\t\3\2\2\2vw\7\5\2\2wx\5\f\7\2xy\7\32\2\2y\13\3"+
		"\2\2\2z{\5T+\2{|\5V,\2|\r\3\2\2\2}~\5\20\t\2~\177\7\4\2\2\177\u0080\5"+
		"\22\n\2\u0080\u0081\7\32\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7\32\2"+
		"\2\u0083\u0084\7\6\2\2\u0084\u0085\7\32\2\2\u0085\17\3\2\2\2\u0086\u0087"+
		"\5^\60\2\u0087\21\3\2\2\2\u0088\u0089\5T+\2\u0089\23\3\2\2\2\u008a\u008b"+
		"\5^\60\2\u008b\25\3\2\2\2\u008c\u008d\5\30\r\2\u008d\u008e\7\32\2\2\u008e"+
		"\u0090\5 \21\2\u008f\u0091\5\"\22\2\u0090\u008f\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0096\7\32\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\27\3\2\2\2\u0099\u009a\5\32\16\2\u009a"+
		"\u009b\5\34\17\2\u009b\u009c\5\36\20\2\u009c\31\3\2\2\2\u009d\u009e\7"+
		"\7\2\2\u009e\u009f\5\\/\2\u009f\33\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\35"+
		"\3\2\2\2\u00a2\u00a5\7\31\2\2\u00a3\u00a5\5\\/\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\7\32\2\2\u00aa"+
		"\u00ab\5^\60\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\7\27\2\2\u00ad\u00ae\7"+
		"\32\2\2\u00ae!\3\2\2\2\u00af\u00b2\5$\23\2\u00b0\u00b2\5&\24\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2#\3\2\2\2\u00b3\u00b4\5.\30\2\u00b4"+
		"\u00b6\5\60\31\2\u00b5\u00b7\5\62\32\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\5\64\33\2\u00b9\u00bb\5\66\34"+
		"\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\5<\37\2\u00bd\u00bf\5> \2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00c2\5@!\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2"+
		"\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\5B\"\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\32\2\2\u00c7%\3\2\2\2\u00c8"+
		"\u00c9\5.\30\2\u00c9\u00cb\5\64\33\2\u00ca\u00cc\5\66\34\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\5<\37\2\u00ce"+
		"\u00d0\5> \2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2"+
		"\2\u00d1\u00d3\5@!\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5"+
		"\3\2\2\2\u00d4\u00d6\5B\"\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\7\32\2\2\u00d8\u00da\5(\25\2\u00d9\u00d8\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\'\3\2\2\2\u00db\u00dc\5*\26\2\u00dc\u00dd"+
		"\5*\26\2\u00dd\u00de\7\32\2\2\u00de\u00df\5*\26\2\u00df\u00e0\5*\26\2"+
		"\u00e0\u00e1\7\32\2\2\u00e1)\3\2\2\2\u00e2\u00e3\5,\27\2\u00e3\u00e4\7"+
		"\n\2\2\u00e4\u00e6\5\60\31\2\u00e5\u00e7\5\62\32\2\u00e6\u00e5\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7+\3\2\2\2\u00e8\u00e9\5\\/\2\u00e9-\3\2\2\2"+
		"\u00ea\u00ed\5\\/\2\u00eb\u00ed\7\26\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed/\3\2\2\2\u00ee\u00f0\5^\60\2\u00ef\u00f1\7\4\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\7\13"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f7\5^\60\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\61\3\2\2"+
		"\2\u00f8\u00f9\5\\/\2\u00f9\63\3\2\2\2\u00fa\u00fb\5^\60\2\u00fb\65\3"+
		"\2\2\2\u00fc\u00ff\58\35\2\u00fd\u00ff\5:\36\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\67\3\2\2\2\u0100\u0102\5F$\2\u0101\u0100\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105\7\f\2\2\u0104\u0103"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5H%\2\u0107"+
		"\u0108\7\r\2\2\u0108\u0109\5J&\2\u0109\u010e\3\2\2\2\u010a\u010e\7\16"+
		"\2\2\u010b\u010e\7\17\2\2\u010c\u010e\7\20\2\2\u010d\u0101\3\2\2\2\u010d"+
		"\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e9\3\2\2\2"+
		"\u010f\u0110\5X-\2\u0110\u0111\7\4\2\2\u0111\u0113\5Z.\2\u0112\u0114\7"+
		"\r\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0117\5J&\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2"+
		"\2\u0118\u011a\7\21\2\2\u0119\u010f\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		";\3\2\2\2\u011b\u011e\58\35\2\u011c\u011e\5:\36\2\u011d\u011b\3\2\2\2"+
		"\u011d\u011c\3\2\2\2\u011e=\3\2\2\2\u011f\u0120\5\\/\2\u0120?\3\2\2\2"+
		"\u0121\u0122\5\\/\2\u0122A\3\2\2\2\u0123\u0126\58\35\2\u0124\u0126\5:"+
		"\36\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126C\3\2\2\2\u0127\u0128"+
		"\7\25\2\2\u0128E\3\2\2\2\u0129\u012a\7\25\2\2\u012aG\3\2\2\2\u012b\u012c"+
		"\7\25\2\2\u012cI\3\2\2\2\u012d\u012e\7\25\2\2\u012eK\3\2\2\2\u012f\u0130"+
		"\t\3\2\2\u0130M\3\2\2\2\u0131\u0132\7\25\2\2\u0132O\3\2\2\2\u0133\u0134"+
		"\7\25\2\2\u0134Q\3\2\2\2\u0135\u0136\7\25\2\2\u0136S\3\2\2\2\u0137\u0138"+
		"\5N(\2\u0138\u0139\7\24\2\2\u0139\u013a\5P)\2\u013a\u013b\7\24\2\2\u013b"+
		"\u013c\5R*\2\u013cU\3\2\2\2\u013d\u013e\5D#\2\u013e\u013f\7\f\2\2\u013f"+
		"\u0141\5F$\2\u0140\u0142\7\f\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2"+
		"\2\u0142\u0144\3\2\2\2\u0143\u0145\5H%\2\u0144\u0143\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5L\'\2\u0147W\3\2\2\2\u0148\u0149"+
		"\7\25\2\2\u0149Y\3\2\2\2\u014a\u014b\7\25\2\2\u014b[\3\2\2\2\u014c\u014d"+
		"\7\25\2\2\u014d]\3\2\2\2\u014e\u0150\7\31\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152_\3\2\2\2"+
		"\u0153\u0151\3\2\2\2%iqt\u0092\u0097\u00a4\u00a6\u00b1\u00b6\u00ba\u00be"+
		"\u00c1\u00c4\u00cb\u00cf\u00d2\u00d5\u00d9\u00e6\u00ec\u00f0\u00f3\u00f6"+
		"\u00fe\u0101\u0104\u010d\u0113\u0116\u0119\u011d\u0125\u0141\u0144\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}