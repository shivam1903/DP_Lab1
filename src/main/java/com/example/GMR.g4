grammar GMR;

// Lexer rules
LPAREN : '(';
RPAREN : ')';
NOT : '!';
AND : '&';
OR : '|';
IMPLIES : '->';
IFF : '<->';
VARIABLE : [a-zA-Z]+;

// Parser rules
expression : iff_expression;

iff_expression : implies_expression (IFF iff_expression)?;

implies_expression : or_expression (IMPLIES implies_expression)?;

or_expression : and_expression (OR and_expression)*;

and_expression : unary_expression (AND unary_expression)*;

unary_expression : NOT unary_expression
                 | primary_expression;

primary_expression : LPAREN expression RPAREN
                   | VARIABLE;

// Ignoring whitespace
WS : [ \t\r\n]+ -> skip;
