# T6: RecLang - Linguagem de Declaração de Receitas

Neste repositório encontra-se o sexto trabalho da disciplina **Construção de Compiladores**, referente ao desenvolvimento de um compilador completo.

## Sumário

  1. Introdução
  2. Projeto da Linguagem
  3. Dependências e Instalações
  4. Casos de Teste e Estrutura da Linguagem
  5. Uso do Compilador
  6. Saídas e Resultados
  7. Conclusão

---

## 1. Introdução

**RecLang** é uma linguagem de domínio específico desenvolvida para a declaração de receitas culinárias de forma estruturada e compreensível. O compilador da linguagem foi desenvolvido em **Java**, utilizando **ANTLR 4** para análise léxica e sintática, e **Maven** para gerenciamento do projeto. A partir de um programa escrito em RecLang, o compilador gera um arquivo `.html` com a receita formatada e um arquivo `.txt` com a listagem de erros semânticos (caso existam).

---

## 2. Projeto da Linguagem

A gramática da linguagem foi desenvolvida para suportar programas divididos em três seções obrigatórias:

1. **Cabeçalho de receita:** iniciado pela palavra-chave `receita`, seguido por um identificador.
2. **Lista de ingredientes:** iniciada pela palavra-chave `ingredientes:`, seguida de uma ou mais linhas com a quantidade, unidade e nome do ingrediente.
3. **Modo de preparo:** iniciado pela palavra-chave `modo_de_preparo:`, seguido por uma ou mais instruções de preparo em linhas separadas.

### Exemplo de programa em RecLang:

```

receita BoloSimples
ingredientes:
3 unidades ovo
2 xicaras farinha
1 xicara acucar

modo_de_preparo:
misture todos os ingredientes
asse por 30 minutos

````

---

## 3. Dependências e Instalações

O projeto foi desenvolvido com as seguintes tecnologias:

- **Java 17+**
- **ANTLR 4.13.1**
- **Apache Maven** para gerenciamento do projeto

Para rodar o projeto localmente:

1. Certifique-se de que o Java está instalado:
   ```bash
   java -version
````

2. Instale o Apache Maven:

   ```bash
   mvn -version
   ```

3. Clone o repositório:

   ```bash
   git clone https://github.com/MurilooMiranda/T6.git
   cd T6
   ```
---

## 4. Casos de Teste e Estrutura da Linguagem

Um programa válido em RecLang deve conter:

* Um cabeçalho de receita (`receita <nome>`),
* Pelo menos um ingrediente declarado após `ingredientes:`,
* Pelo menos uma instrução após `modo_de_preparo:`.

### Caso válido:

```
receita Panqueca
ingredientes:
  1 xicara leite
  1 unidade ovo
  1 xicara farinha

modo_de_preparo:
  misture os ingredientes
  frite em fogo médio
```

### Caso com erro:

```
receita
ingredientes:
  leite 1 xicara
modo_de_preparo:
  frite tudo
```

Este exemplo possui erros semânticos e sintáticos: o nome da receita está ausente e a ordem dos ingredientes está incorreta.

---

## 5. Uso do Compilador

Para executar o compilador, há duas formas:

1. Use o Maven para geração de código, compilação e execução de um único caso teste:

  ```bash
  mvn generate-sources
  mvn clean install
  mvn exec:java -Dexec.mainClass="br.ufscar.dc.compiladores.Main"

  ```
  OBS: Insira em 'entrada.reclang' o caso teste que quer ser analisado;

2. Use o script para geração de código, compilação e execução de todos os casos teste: 

  ```bash
  chmod +x run_tests.sh                                          
  ./run_tests.sh

  ```


## 6. Saídas e Resultados

Após a execução do compilador, são gerados dois arquivos:

### `log.txt`

Contém os erros encontrados durante a análise semântica do programa de entrada. Se nenhum erro for identificado, uma mensagem indicando isso será exibida.

Exemplo (sem erros):

```
Análise semântica concluída: nenhum erro encontrado.
```

Exemplo (com erros):

```
Erros semânticos encontrados: 2
   - Erro semântico: receita sem ingredientes.
   - Erro semântico: receita sem modo de preparo.

```

### `saida.html`

Contém o conteúdo da receita formatado com:

* Título da receita
* Lista de ingredientes
* Lista numerada com as instruções de preparo
* Notas de erro (caso existam)

---

## 7. Conclusão

O desenvolvimento do compilador RecLang proporcionou uma experiência completa com todas as etapas fundamentais da construção de compiladores: desde o projeto da linguagem e definição da gramática, até a análise semântica e a geração de código de saída. A proposta de uma linguagem simples, voltada à declaração de receitas, permitiu explorar de forma prática os conceitos vistos ao longo da disciplina, com foco em clareza, coerência estrutural e usabilidade.

