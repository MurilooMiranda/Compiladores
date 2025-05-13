## 🧠 Analisador Léxico

Este projeto é um **analisador léxico em Java**, desenvolvido com **ANTLR 4** e gerenciado via **Apache Maven**.

Ele processa arquivos escritos na **Linguagem Algorítmica** (criada pelo prof. Jander - DC/UFSCar), produzindo como saída uma lista de tokens reconhecidos.

---

## 📋 Requisitos

Certifique-se de ter os seguintes softwares instalados:

- [Java JDK 17 ou superior](https://jdk.java.net/)
- [Apache Maven 3.6 ou superior](https://maven.apache.org/)
- [Git](https://git-scm.com/) (para clonar o repositório)

---

## 📥 Clonando o Repositório

Abra o terminal e execute:

```bash
git clone https://github.com/MurilooMiranda/Compiladores.git
```

Navegue até o diretório do projeto:

```bash
cd compiladores/T1/AnalisadorLexico
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

Para executar o analisador léxico, utilize o seguinte comando:

```bash
java -jar target/AnalisadorLexico-1.0-SNAPSHOT-jar-with-dependencies.jar <entrada.txt> <saida.txt>
```

- `<entrada.txt>`: Caminho para o arquivo de entrada (código em Linguagem Algorítmica)
- `<saida.txt>`: Caminho para o arquivo de saída (lista de tokens)

### ✅ Exemplo

```bash
java -jar target/AnalisadorLexico-1.0-SNAPSHOT-jar-with-dependencies.jar exemplos/entrada.txt exemplos/saida.txt
```

---

## 🧪 Casos de Teste

Casos de teste adicionais estão disponíveis neste link fornecido pelo professor:

📁 [Casos de Teste - Linguagem Algorítmica](https://drive.google.com/file/d/1SwQg-O3dG_N5okejIwTe1ujFUjffw6R_/view)

---

