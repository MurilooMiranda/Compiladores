# 🧠 Analisador Semântico (Parte 2)

Este projeto é a **segunda parte do Analisador Semântico** para a Linguagem Algorítmica, desenvolvido em **Java** com **ANTLR 4** e gerenciado via **Apache Maven**.

Ele processa arquivos escritos na Linguagem Algorítmica (criada pelo prof. Jander - DC/UFSCar), realizando análise semântica e produzindo como saída uma lista de verificações semânticas identificadas.

---

## 📋 Requisitos

Certifique-se de ter os seguintes softwares instalados:

* [Java JDK 18 ou superior](https://jdk.java.net/)
* [Apache Maven 3.6 ou superior](https://maven.apache.org/)
* [Git](https://git-scm.com/) (para clonar o repositório)

> 🔧 **Obs:** O projeto foi desenvolvido na IDE NetBeans (versão 13), porém pode ser executado diretamente via terminal com Maven, sem necessidade de abrir na IDE.

---

## 📥 Clonando o Repositório

Abra o terminal e execute:

```bash
git clone https://github.com/MurilooMiranda/Compiladores.git
```

Navegue até o diretório do projeto:

```bash
cd compiladores/T4
```

---

## ⚙️ Compilação

Para compilar o projeto e baixar as dependências automaticamente via Maven, execute:

```bash
mvn clean package
```

O arquivo `.jar` será gerado no diretório `target/`, com todas as dependências incluídas.

---

## ▶️ Execução

Para executar o analisador semântico, utilize o seguinte comando:

```bash
java -jar target/t4-1.0-SNAPSHOT-jar-with-dependencies.jar <entrada.txt> <saida.txt>
```

* `<entrada.txt>`: Caminho para o arquivo de entrada (código em Linguagem Algorítmica)
* `<saida.txt>`: Caminho para o arquivo de saída (lista de verificações semânticas)

### ✅ Exemplo

```bash
java -jar target/t4-1.0-SNAPSHOT-jar-with-dependencies.jar exemplos/entrada.txt exemplos/saida.txt
```

---

## 🧪 Casos de Teste

Casos de teste adicionais estão disponíveis no link fornecido pelo professor:

📁 [Casos de Teste - Linguagem Algorítmica](https://drive.google.com/file/d/1Q2J-eIzQ199C4dzpZikBTZvXfYw5YIXv/view?usp=sharing)

---

## 📜 Gramática

A definição da gramática utilizada está disponível neste link:

📄 [Definição da Gramática - Linguagem Algorítmica](https://drive.google.com/file/d/1Cv9m52E5r72jb3sLI04Jyqc29Cykn5RQ/view?usp=sharing)

O arquivo de gramática adaptado para o ANTLR está no projeto:

📂 [`t4Gram.g4`](https://github.com/MurilooMiranda/Compiladores/main/T4/src/main/antlr4/br/ufscar/dc/compiladores/t4/t4Gram.g4)

---

## ⚠️ Observações Importantes

* Utilize os casos de teste recomendados para garantir compatibilidade com a gramática definida.
* Caso deseje testar algoritmos que não estão nos casos de teste, eles devem seguir estritamente a gramática da Linguagem Algorítmica.
* Alterações na gramática exigem também ajustes no arquivo `t4Gram.g4` e nas classes Java correspondentes.

---


