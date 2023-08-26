grammar PropositionalLogic;


formula : subformula EOF;

subformula : '(' subformula ')' #Parenthesis
           | <assoc=right> '!' subformula   #Not
           | subformula '&' subformula  #And
           | subformula '|' subformula  #Or
           | <assoc=right> subformula '->' subformula   #Imply
           | <assoc=right> subformula '<->' subformula  #Iff
           | VARIABLE   #Variable
           ;  

VARIABLE : [a-zA-Z]+;
// Ignoring whitespace
WS : [ \t\r\n]+ -> skip;