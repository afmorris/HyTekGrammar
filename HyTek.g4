grammar HyTek;

init : file;

file : license
	   exportInfo
	   meetInfo
	   NEWLINE
	   event+;

license : 'Licensed to ' ID+ NEWLINE ;

exportInfo : 'HY-TEK\'s Meet Manager' exportDate NEWLINE ;
exportDate : INT '/' INT '/' INT INT ':' INT ('AM'|'PM') ;

meetInfo : meetName '-' meetDate NEWLINE meetLocation NEWLINE 'Results' NEWLINE;
meetName : ID+ ;
meetDate : INT '/' INT '/' INT ;
meetLocation : ID+ ;

event : eventInfo eventHeader eventResult+ NEWLINE;

eventInfo : eventNumber eventGender eventName NEWLINE ;
eventNumber : 'Event' INT ;
eventGender : ('Girls'|'Boys') ;
eventName : (ID|INT)+;

eventHeader : SEPARATOR* NEWLINE 
              ID* NEWLINE
              SEPARATOR* NEWLINE;

eventResult : place athleteName athleteYear+ schoolName seed? performance heatNumber? points? NEWLINE;
place : INT | DQPLACE;
athleteName : ID+;
athleteYear : INT;
schoolName : ID+;
seed : time | distance;
time : INT? ':'? INT '.' INT;
distance : INT '-' INT '.'? INT?;
performance : time | distance;
heatNumber: INT;
points: INT;

ID  : [a-zA-Z\-"#]+ ;
INT : [0-9]+ ;
NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;
SEPARATOR : '=' ;
DQPLACE : '--' ;