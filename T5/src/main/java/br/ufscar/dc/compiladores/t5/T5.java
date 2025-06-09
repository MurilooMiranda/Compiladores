
/*
  @author Daniel de Souza Sobrinho Macedo - 813524, Murilo de Miranda Silva - 812069
  
  Gerador de código para a linguagem LA
 */

package br.ufscar.dc.compiladores.t5;

// Importações básicas para o funcionamento do programa.
import br.ufscar.dc.compiladores.t5.t5GramParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class T5 {

    public static void main(String args[]) throws IOException {

        // Inicialização da leitura e escrita em arquivo.
        CharStream cs = CharStreams.fromFileName(args[0]);

        // Inicialização do analisador léxico.
        t5GramLexer lexer = new t5GramLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Inicialização do analisador sintático.
        t5GramParser parser = new t5GramParser(tokens);
        ProgramaContext arvore = parser.programa();
        T5Semantico t5s = new T5Semantico();

        // Inicialização do programa.
        t5s.visitPrograma(arvore);

        // Verifica a existência de erros, imprime todos os que foram identificados
        // e encerra a execução do analisador.
        T5SemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));

        // Caso não tenham erros no programa, é gerado o código em C equivalente.
        if (T5SemanticoUtils.errosSemanticos.isEmpty()) {
            GeraC agc = new GeraC();
            agc.visitPrograma(arvore);
            
            try(PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.saida.toString());
            }
        }
    }
}
