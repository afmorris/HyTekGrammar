grammar HyTek;

init
: file;

file
: license exportInfo meetInfo NEWLINE event+;

license
: LICENSEDTO licensee (NEWLINE)?;

licensee
: words (DASH words)?;

exportInfo
: HYTEK exportDate NEWLINE;

exportDate
: date clockTime;

meetInfo
: meetName DASH? meetDate? NEWLINE (meetLocation NEWLINE)? (date NEWLINE)? RESULTS NEWLINE;

meetName
: (ID|INTEGER_NUMBER)+;

meetDate
: date;

meetLocation
: words;

event
: eventInfo NEWLINE eventHeader eventResult+ NEWLINE+;

eventInfo
: eventNumber? eventGender eventName ;

eventNumber
: EVENT number;

eventGender
: (GIRLS|BOYS) ;

eventName
: (ID|number)+;

eventHeader
: SEPARATOR NEWLINE columnHeaders NEWLINE SEPARATOR NEWLINE FINALS?;

columnHeaders
: (ID|number)+;

eventResult
: individualResult
  | relayResult;

individualResult
: place jerseyNumber? athleteName athleteYear? schoolName seed? performance metric? wind? heatNumber? points? tiebreaker? NEWLINE;

relayResult
: place schoolName seed? performance metric? wind? heatNumber? points? tiebreaker? NEWLINE legInfo?;

metric
: foot DOT inch METERS;

wind
: NOWIND;

legInfo
: leg leg NEWLINE leg leg NEWLINE;

leg
: legNumber RPAREN jerseyNumber? athleteName athleteYear?;

legNumber
: number;

place
: number | DQPLACE;

jerseyNumber
: NUMBERSIGN number;

athleteName
: words (DASH words)? (APOSTROPHE words)? (LPAREN words)? (RPAREN words)?;

athleteYear
: number;

schoolName
: words;

seed
: time
  | distance
  | dq;

time
: (minute COLON)? second DOT decimal;

distance
: foot DASH inch DOT? decimal?;

dq : FALSESTART | NOHEIGHT | DISQUALIFIED | FOUL | NOTIME;

performance
: TIE? time QUALIFY?
  | TIE? distance QUALIFY?
  | dq;

heatNumber
: number;

points
: number;

tiebreaker
: time
  | distance;

hour
: INTEGER_NUMBER;

minute
: INTEGER_NUMBER;

second
: INTEGER_NUMBER;

decimal
: INTEGER_NUMBER;

period
: (AM|PM);

day
: INTEGER_NUMBER;

month
: INTEGER_NUMBER;

year
: INTEGER_NUMBER;

date
: month SLASH day SLASH year;

clockTime
: hour COLON minute COLON? second? period;

foot
: INTEGER_NUMBER;

inch
: INTEGER_NUMBER;

number
: INTEGER_NUMBER;

words
: ID*;

INTEGER_NUMBER
: DIGIT+;

fragment
DIGIT : ('0'..'9');

LICENSEDTO: 'Licensed to';
HYTEK: 'HY-TEK\'s Meet Manager';
RESULTS: 'Results';
EVENT: 'Event';
GIRLS: 'Girls';
BOYS: 'Boys';
FINALS: 'Finals';
DOT: '.';
METERS: 'm';
NOWIND: 'NWI';
LPAREN: '(';
RPAREN: ')';
DASH: '-';
APOSTROPHE: '\'';
COLON: ':';
FALSESTART: 'FS';
NOHEIGHT: 'NH';
DISQUALIFIED: 'DQ';
FOUL: 'FOUL';
NOTIME: 'NT';
TIE: 'J';
AM: 'AM';
PM: 'PM';
SLASH: '/';
NUMBERSIGN: '#';
QUALIFY: [qQ];

DQPLACE : '--' ;
SEPARATOR : '='+ ;
INT : [0-9]+ ;
ID  : [a-zA-Z"#'.\-:,]+ ;
NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;