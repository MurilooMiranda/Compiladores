grammar Recipe;

// Regra principal: estrutura completa da receita
program: 'receita' WS? ID NEWLINE ingredients NEWLINE* steps EOF;

// Bloco de ingredientes: começa com 'ingredientes:' e pelo menos um ingrediente listado
ingredients: 'ingredientes:' NEWLINE (ingredient NEWLINE)+;

// Cada ingrediente: quantidade (INT), unidade (UNIT) e nome do ingrediente (ID)
ingredient: INT WS? UNIT WS? ID;

// Bloco de passos do modo de preparo: começa com 'modo_de_preparo:' e pelo menos um passo
steps: 'modo_de_preparo:' NEWLINE (step)+;

// Cada passo pode ter várias palavras, números e unidades; aceita linhas como "adicione 2 xicaras"
step: step_line NEWLINE?;
step_line: (ID | INT | UNIT | WS)+;

// Unidades aceitas (poderia ser estendido com mais opções)
UNIT: 'xicara' | 'xicaras' | 'gramas' | 'unidade' | 'unidades';

// Tokens principais para palavras, números, linhas e espaços
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
NEWLINE: '\r'? '\n';

// Ignora espaços em branco
WS: [ \t]+ -> skip;
