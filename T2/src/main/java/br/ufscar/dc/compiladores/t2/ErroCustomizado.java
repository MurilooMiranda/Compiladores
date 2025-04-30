/* 
Classe criada para a geração de mensagens personalizadas para os
tipos de erros que são identificados pelo programa.
*/ 

package br.ufscar.dc.compiladores.t2;

import java.io.PrintWriter;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class ErroCustomizado implements ANTLRErrorListener {
    
    PrintWriter pw;
    public ErroCustomizado(PrintWriter pw) {
        this.pw = pw;    
    }
    
    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        
        Token t = (Token) offendingSymbol;
        
        switch (t.getType()) { // OBS: os valores de t.getType() podem ser conferidos no arquivo t2SintLexer.tokens.
            case -1: // -1 refere-se ao token EOF, que indica o fim do programa analisado.
                pw.println("Linha " + line + ": erro sintatico proximo a EOF");
                break;
            case 66: // 66 refere-se ao erro em uma cadeia literal.
                pw.println("Linha " + line + ": cadeia literal nao fechada");
                break;
            case 67: // 67 refere-se ao erro em um comentário.
                pw.println("Linha " + line + ": comentario nao fechado");
                break;
            case 68: // 68 refere-se a um erro na identificação de símbolos.
                pw.println("Linha " + line + ": " + t.getText() + " - simbolo nao identificado");
                break;
            default: // Por padrão, o programa exibe a mensagem de erro sintático.
                pw.println("Linha " + line + ": erro sintatico proximo a " + t.getText());
                break;
        }  
        pw.println("Fim da compilacao"); 
        throw new RuntimeException();
    }
}
