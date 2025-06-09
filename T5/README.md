# 🛠️ T5: Gerador de Código C

Este projeto corresponde ao **quinto trabalho da disciplina de Construção de Compiladores** e consiste no desenvolvimento de um **gerador de código em C**, baseado na **Linguagem Algorítmica**. Ele complementa as etapas anteriores de compilação, e foi implementado em **Java**, com uso do **ANTLR 4** e gerenciamento via **Apache Maven**.

---

## 📋 Requisitos

Certifique-se de ter os seguintes softwares instalados:

* [Java JDK 17 ou superior](https://jdk.java.net/)
* [Apache Maven 3.6 ou superior](https://maven.apache.org/)
* [Git](https://git-scm.com/)

---

## 📥 Clonando o Repositório

Abra o terminal e execute:

```bash
git clone https://github.com/MurilooMiranda/Compiladores
```

Navegue até o diretório do projeto:

```bash
cd Compiladores/T5
```

---

## ⚙️ Compilação

Para compilar o projeto com o Maven e gerar o `.jar` com todas as dependências, execute:

```bash
mvn clean package
```

O arquivo `.jar` gerado estará localizado na pasta `target/`, com o nome:

```
t5-1.0-SNAPSHOT-jar-with-dependencies.jar
```

> 💡 **Dica:** você pode copiar esse `.jar` para um diretório de fácil acesso, como `C:\Compiladores\`, para facilitar a execução.

---

## ▶️ Execução

Utilize o seguinte comando no terminal ou prompt de comando:

```bash
java -jar <caminho_jar> <arquivo_entrada.txt> <arquivo_saida.txt>
```
---

## 🧪 Casos de Teste

Você pode utilizar os casos de teste disponibilizados pelo professor:

📁 [Casos de Teste - Linguagem Algorítmica](https://drive.google.com/file/d/1Q2J-eIzQ199C4dzpZikBTZvXfYw5YIXv/view?usp=sharing)

---

