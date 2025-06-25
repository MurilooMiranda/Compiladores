grammar Recipe;

program: 'receita' ID ingredients steps EOF;

ingredients: 'ingredientes:' ingredient+;
ingredient: INT UNIT ID;

steps: 'modo_de_preparo:' step+;
step: ~('\n')+ '\n';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
UNIT: 'xicara' | 'xicaras' | 'gramas' | 'unidade' | 'unidades';

WS: [ \t\r\n]+ -> skip;