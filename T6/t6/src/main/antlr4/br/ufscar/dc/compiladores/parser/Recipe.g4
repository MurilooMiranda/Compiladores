grammar Recipe;

program: 'receita' WS? ID NEWLINE ingredients NEWLINE* steps EOF;

ingredients: 'ingredientes:' NEWLINE (ingredient NEWLINE)+;
ingredient: INT WS? UNIT WS? ID;

steps: 'modo_de_preparo:' NEWLINE (step)+;
step: step_line NEWLINE?;

step_line: (ID | INT | UNIT | WS)+;

// Tokens de unidades
UNIT: 'xicara' | 'xicaras' | 'gramas' | 'unidade' | 'unidades';

// Tokens principais
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;

NEWLINE: '\r'? '\n';

// Ignorar espaços em branco
WS: [ \t]+ -> skip;
