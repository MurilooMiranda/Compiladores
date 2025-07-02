package br.ufscar.dc.compiladores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LogGenerator {

    // Método responsável por gerar o arquivo de log (log.txt) com a lista de erros passada
    public static void gerarLog(List<String> erros) {
        // Usa try-with-resources para garantir que o BufferedWriter será fechado automaticamente
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            
            // Se a lista de erros for nula ou vazia, escreve mensagem padrão de sucesso
            if (erros == null || erros.isEmpty()) {
                writer.write("Análise semântica concluída: nenhum erro encontrado.");
            } else {
                // Caso existam erros, escreve cada erro em uma nova linha no arquivo
                for (String erro : erros) {
                    writer.write(erro);
                    writer.newLine();
                }
            }
            
            // Mensagem no console indicando que o arquivo de log foi criado com sucesso
            System.out.println("Arquivo de log gerado com sucesso: log.txt");
        
        // Captura possíveis exceções de entrada/saída durante a escrita do arquivo
        } catch (IOException e) {
            // Exibe mensagem de erro no console caso falhe a escrita do arquivo
            System.err.println("Erro ao escrever arquivo de log: " + e.getMessage());
            e.printStackTrace(); // Mostra detalhes da exceção para ajudar na depuração
        }
    }
}
