# 🧠 Analisador Semântico (Parte 1)

Este projeto é a **primeira parte do Analisador Semântico** para a Linguagem Algorítmica, desenvolvido em **Java** com **ANTLR 4** e gerenciado via **Apache Maven**.

Ele processa arquivos escritos na Linguagem Algorítmica (criada pelo prof. Jander - DC/UFSCar), realizando análise semântica e produzindo como saída uma lista de verificações semânticas identificadas.

---

## 📋 Requisitos

Certifique-se de ter os seguintes softwares instalados:

* [Java JDK 17 ou superior](https://jdk.java.net/)
* [Apache Maven 3.6 ou superior](https://maven.apache.org/)
* [Git](https://git-scm.com/) (para clonar o repositório)

---

## 📥 Clonando o Repositório

Abra o terminal e execute:

```bash
git clone https://github.com/MurilooMiranda/Compiladores.git
```

Navegue até o diretório do projeto:

```bash
cd compiladores/T3
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
java -jar target/t3-1.0-SNAPSHOT-jar-with-dependencies.jar <entrada.txt> <saida.txt>
```

* `<entrada.txt>`: Caminho para o arquivo de entrada (código em Linguagem Algorítmica)
* `<saida.txt>`: Caminho para o arquivo de saída (lista de verificações semânticas)

### ✅ Exemplo

```bash
java -jar target/t3-1.0-SNAPSHOT-jar-with-dependencies.jar exemplos/entrada.txt exemplos/saida.txt
```

---

## 🧪 Casos de Teste

Casos de teste adicionais estão disponíveis neste link fornecido pelo professor:

📁 [Casos de Teste - Linguagem Algorítmica](https://drive.google.com/file/d/1Q2J-eIzQ199C4dzpZikBTZvXfYw5YIXv/view?usp=sharing)
""
