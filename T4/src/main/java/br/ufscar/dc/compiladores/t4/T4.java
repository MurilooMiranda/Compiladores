package br.ufscar.dc.compiladores.t4;
import br.ufscar.dc.compiladores.t4.t4GramParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class T4 {

    public static void main(String args[]) throws IOException {

        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            try {
                CharStream cs = CharStreams.fromFileName(args[0]);
                
                t4GramLexer lexer = new t4GramLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                
                t4GramParser parser = new t4GramParser(tokens);
                ProgramaContext arvore = parser.programa();
                T4Semantico t4s = new T4Semantico();
                
                t4s.visitPrograma(arvore);
                
                T4SemanticoUtils.errosSemanticos.forEach((s) -> pw.println(s));
                pw.println("Fim da compilacao");
                pw.close();                
            } catch (RuntimeException e) {
            }
        }
    }
}
