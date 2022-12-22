/*
 * Nama    : Muhammad Sholeh
 * NIM     : 09021281823172
 * Kelas   : Reguler C 2018
 */

package similarity.source.code.AST.RO;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

public class tokenizeCode 
{
    public static String tokenizerJava(String code)
    {
          ANTLRInputStream in = new ANTLRInputStream(code);
          Java8Lexer lexer = new Java8Lexer(in);
        
          List<? extends Token> tokenList = new ArrayList<>();
          tokenList = lexer.getAllTokens();
         
          String tokenAll = "";
          
          for(Token token : tokenList){
              System.out.println( token);
              tokenAll += String.valueOf(token.getType());
          }
          return tokenAll;
    }
}


