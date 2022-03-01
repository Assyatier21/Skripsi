/**
 * @author Assyatier21
 */
package similarity.source.code.AST.RO;

import java.util.Scanner;


public class MainProgram 
{
    
    public static void main(String[] args) throws Exception
    {
        String mainDoc =
        "Matematika Adalah Mata Pelajaran Yang Menyusahkan";
       
        String duplicateDoc =
        "Matematika Bukanlah Mata Pelajaran Yang Menyenangkan";
        
        try
        {
            prepText process = new prepText();
            String mainDocFiltered = process.ppTextnoAST(mainDoc);
            String duplicateDocFiltered = process.ppTextnoAST(duplicateDoc);

//            tokenizeCode next = new tokenizeCode();
//            String mainDocTokenized = next.tokenizerJava(mainDocFiltered);
//            String duplicateDocTokenized = next.tokenizerJava(duplicateDocFiltered);

//            System.out.println("Main Doc Token :\n" + mainDocTokenized);
//            System.out.println("");
//            System.out.println("Duplicate Doc Token:\n" + duplicateDocTokenized);
//            System.out.println("");
            ROalgorithm algorithm = new ROalgorithm();
            double percentage = algorithm.similarity(mainDocFiltered, duplicateDocFiltered);
            System.out.println("Percentage of Similarity : " + percentage);
            
            
            
        } 
        catch (Exception e)
        {
            System.out.println("");
        }
    }
}
