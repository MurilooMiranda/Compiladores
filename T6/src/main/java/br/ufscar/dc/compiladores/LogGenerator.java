package br.ufscar.dc.compiladores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LogGenerator {

    // Método responsável por gerar o arquivo de log (log.txt) com a lista de erros passada
    public static void gerarLog(List<String> erros) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {

            if (erros == null || erros.isEmpty()) {
                writer.write("Análise concluída com sucesso.\n");
                writer.write("Nenhum erro léxico, sintático ou semântico encontrado.\n");
            } else {
                writer.write("Erros encontrados durante a análise:\n");
                for (String erro : erros) {
                    writer.write(erro);
                    writer.newLine();
                }
            }

            System.out.println("Arquivo de log gerado com sucesso: log.txt");

        } catch (IOException e) {
            System.err.println("Erro ao escrever arquivo de log: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
