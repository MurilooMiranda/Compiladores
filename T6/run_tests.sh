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

  # Copia o arquivo de teste atual para entrada.reclang
  cp "$testcase" entrada.reclang

  # Executa o compilador com Maven
  if ! mvn exec:java -Dexec.mainClass="br.ufscar.dc.compiladores.Main"; then
    echo "❌ Erro durante execução do caso $name"
  fi

  # Salva os resultados com nomes distintos na pasta results/
  cp -f saida.html "results/${name}_saida.html" 2>/dev/null || true
  cp -f log.txt "results/${name}_log.txt" 2>/dev/null || true
done

echo ""
echo "✅ Todos os testes foram executados. Resultados salvos em ./results/"
