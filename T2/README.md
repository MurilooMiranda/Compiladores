
# 🧠 Analisador Sintático

Este projeto corresponde ao **Trabalho 2** da disciplina **Construção de Compiladores**, focado no desenvolvimento de um analisador sintático para a **Linguagem Algorítmica** (UFSCar/DC).  
Utiliza **ANTLR 4**, **Apache Maven** e foi desenvolvido na **IDE NetBeans**.

---

## 📋 Requisitos

Certifique-se de ter os seguintes softwares instalados:

- Java JDK **18.0.1.1** ou superior  
- NetBeans **13** ou superior  
- Apache Maven

---

## 📦 Estrutura do Projeto

- `t2Sint.g4`: Arquivo de gramática ANTLR  
- `src/`: Implementação em Java  
- `target/`: Geração automática do `.jar` com dependências

---

## ▶️ Execução

### 1. Compilar o projeto

Abra o terminal no diretório raiz do projeto e execute:

```bash
mvn clean package
```

O arquivo `.jar` será gerado em:

```
target/t2-1.0-SNAPSHOT-jar-with-dependencies.jar
```

---

### 2. Executar o analisador

Utilize o seguinte comando:

```bash
java -jar <caminho_do_jar> <caminho_do_arquivo_de_entrada> <caminho_do_arquivo_de_saida>
```

#### ✅ Exemplo:

```bash
java -jar C:\Compiladores\t2-1.0-SNAPSHOT-jar-with-dependencies.jar C:\Compiladores\teste.txt C:\Compiladores\saida.txt
```

> **Observação:** O uso dos casos de teste fornecidos pelo professor é altamente recomendado, pois eles foram elaborados com base na gramática utilizada.  
> É possível criar novos testes, desde que sigam as regras definidas no arquivo `t2Sint.g4`.

---

## 🧪 Casos de Teste

Os casos de teste oficiais estão disponíveis no repositório ou na plataforma da disciplina. Eles contêm códigos escritos na Linguagem Algorítmica e suas respectivas saídas esperadas.

---

## 🧬 Sobre a Gramática

A gramática foi definida no arquivo `t2Sint.g4`, utilizando a sintaxe do ANTLR 4.  
A seguir, alguns dos principais elementos definidos:

### 🔹 Tokens principais

- `NUM_INT`, `NUM_REAL`: Números inteiros e reais  
- `IDENT`: Identificadores válidos  
- `CADEIA`, `COMENTARIO`: Strings e comentários  
- `CADEIA_ERRADA`, `COMENTARIO_ERRADO`, `ERRO`: Tratamento de erros léxicos

### 🔸 Estruturas principais

- `programa`: Declarações e comandos entre `algoritmo` e `fim_algoritmo`  
- `declaracoes`: Declarações locais ou globais  
- `cmd`: Comandos como `leia`, `escreva`, `se`, `para`, `enquanto`, entre outros  
- `exp_aritmetica`, `exp_relacional`, `expressao`: Expressões com precedência de operadores  
- `tipo`, `registro`, `procedimento`, `funcao`: Tipos e subprogramas

Mais detalhes podem ser encontrados diretamente no arquivo [`t2Sint.g4`](./t2Sint.g4).

