grammar HyTek;

init
: file;

file
: license exportInfo meetInfo NEWLINE event+;

license
: 'Licensed to' licensee NEWLINE;

licensee
: words '-'? words?;

exportInfo
: 'HY-TEK\'s Meet Manager' exportDate NEWLINE;

exportDate
: date clockTime;

meetInfo
: meetName '-' meetDate NEWLINE (meetLocation NEWLINE)? (date NEWLINE)? 'Results' NEWLINE;

meetName
: (ID|number)+;

meetDate
: date;

meetLocation
: words;

event
: eventInfo NEWLINE eventHeader eventResult+ NEWLINE+;

eventInfo
: eventNumber? eventGender eventName ;

eventNumber
: 'Event' number;

eventGender
: ('Girls'|'Boys') ;

eventName
: (ID|number)+;

eventHeader
: SEPARATOR NEWLINE words NEWLINE SEPARATOR NEWLINE 'Finals'?;

eventResult
: individualResult
  | relayResult;

individualResult
: place athleteName athleteYear? schoolName seed? performance metric? wind? heatNumber? points? tiebreaker? NEWLINE;

relayResult
: place schoolName seed? performance metric? wind? heatNumber? points? tiebreaker? NEWLINE legInfo?;

metric
: foot '.' inch 'm';

wind
: 'NWI';

legInfo
: leg leg NEWLINE leg leg NEWLINE;

leg
: legNumber ')' athleteName athleteYear?;

legNumber
: number;

place
: number | DQPLACE;

athleteName
: words '-'? '\''? words?;

athleteYear
: number;

schoolName
: words;

seed
: time
  | distance;

time
: minute? ':'? second '.' decimal
  | 'FS'
  | 'NH'
  | 'DQ';

distance
: foot '-' inch '.'? decimal?
  | 'FOUL';

performance
: time
  | distance;

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
: ('AM'|'PM');

day
: INTEGER_NUMBER;

month
: INTEGER_NUMBER;

year
: INTEGER_NUMBER;

date
: month '/' day '/' year;

clockTime
: hour ':' minute ':'? second? period;

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

DQPLACE : '--' ;
SEPARATOR : '='+ ;
INT : [0-9]+ ;
ID  : [a-zA-Z"#'.\-:]+ ;
NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;