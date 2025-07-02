#!/bin/bash

# Garante que o script pare se algum comando falhar
set -e

echo "🔄 Gerando código com ANTLR..."
mvn generate-sources

echo "🔨 Compilando projeto..."
mvn clean install

# Cria/limpa pasta de resultados
mkdir -p results
rm -f results/*

for testcase in casosTeste/*.reclang; do
  name=$(basename "$testcase" .reclang)

  echo ""
  echo "=============================="
  echo "📝 Rodando caso de teste: $name"
  echo "=============================="

  # Copia arquivo de teste atual para entrada.reclang
  cp "$testcase" entrada.reclang

  # Executa seu compilador com Maven
  mvn exec:java -Dexec.mainClass="br.ufscar.dc.compiladores.Main"

  # Salva os resultados com nomes distintos na pasta results/
  cp saida.html "results/${name}_saida.html"
  cp log.txt "results/${name}_log.txt"
done

echo ""
echo "✅ Todos os testes foram executados. Resultados salvos em ./results/"
