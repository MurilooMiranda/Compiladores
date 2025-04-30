🧠 Analisador Sintático
Este projeto corresponde ao Trabalho 2 da disciplina Construção de Compiladores, focado no desenvolvimento de um analisador sintático para a Linguagem Algorítmica (UFSCar/DC). Utiliza ANTLR 4, Apache Maven e foi desenvolvido na IDE NetBeans.

📋 Requisitos
Certifique-se de ter os seguintes softwares instalados:

Java JDK 18.0.1.1 ou superior

NetBeans 13 ou superior

Apache Maven

📦 Estrutura do Projeto
t2Sint.g4: Arquivo de gramática ANTLR

src/: Implementação em Java

target/: Geração automática do .jar com dependências

▶️ Execução
Após abrir o projeto no NetBeans ou compilar via Maven com:

bash
Copiar
Editar
mvn clean package
Localize o arquivo gerado:

pgsql
Copiar
Editar
target/t2-1.0-SNAPSHOT-jar-with-dependencies.jar
Para rodar o analisador, use o comando:

bash
Copiar
Editar
java -jar <caminho_do_jar> <caminho_do_arquivo_de_entrada> <caminho_do_arquivo_de_saida>
✅ Exemplo:
bash
Copiar
Editar
java -jar C:\Compiladores\t2-1.0-SNAPSHOT-jar-with-dependencies.jar C:\Compiladores\teste.txt C:\Compiladores\saida.txt
🧪 Casos de Teste
Utilize os casos de teste fornecidos pelo professor, pois eles foram elaborados com base na gramática utilizada. Também é possível criar novos testes, desde que respeitem a sintaxe definida em t2Sint.g4.

🧬 Sobre a Gramática
A gramática foi adaptada para a sintaxe ANTLR e está definida no arquivo t2Sint.g4. A seguir, alguns destaques:

Tokens principais:
NUM_INT, NUM_REAL: Números inteiros e reais

IDENT: Identificadores válidos

CADEIA, COMENTARIO: Strings e comentários

CADEIA_ERRADA, COMENTARIO_ERRADO, ERRO: Tratamento de erros léxicos

Estruturas principais:
programa: Declarações + corpo (entre algoritmo e fim_algoritmo)

declaracoes: Declarações locais ou globais

cmd: Comandos como leia, escreva, se, para, enquanto, etc.

exp_aritmetica, exp_relacional, expressao: Expressões com precedência de operadores aritméticos, relacionais e lógicos

tipo, registro, procedimento, funcao: Definições de tipos e subprogramas

Mais detalhes podem ser consultados diretamente no arquivo t2Sint.g4.
