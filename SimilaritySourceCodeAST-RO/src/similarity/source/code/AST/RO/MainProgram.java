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
        "import java.util.Scanner;\n" +
"\n" +
"public class SatuB {\n" +
"\n" +
"	public static void main(String[] args) {\n" +
"		Scanner in = new Scanner(System.in);\n" +
"	    String[][] kata={\n" +
"	    {\"satu\",\"one\"},{\"dua\",\"two\"},{\"tiga\",\"three\"},\n" +
"	    {\"empat\",\"four\"},{\"lima\",\"five\"}, {\"enam\",\"six\"},{\"tujuh\",\"seven\"},{\"delapan\",\"eight\"},\n" +
"	    {\"sembilan\",\"nine\"},{\"sepuluh\",\"ten\"}\n" +
"	    };\n" +
"	    String katadicari;\n" +
"\n" +
"	    System.out.println(\"KAMUS TRANSLATE INDONESIA - INGGRIS \");\n" +
"	    \n" +
"	    System.out.print(\"MASUKAN KATA = \");\n" +
"	    katadicari=in.nextLine();\n" +
"	    int i,k; k=-1;\n" +
"	    for(i=0;i<10;i++)\n" +
"	    {\n" +
"	      if(kata[i][0].equals(katadicari.toLowerCase()))\n" +
"	      {\n" +
"	        k=i;\n" +
"	      }\n" +
"	    }\n" +
"	      if(k==-1)\n" +
"	    {\n" +
"	      System.out.print(\"Kata Yang Dicari Tidak Ditemukan \");\n" +
"	    }\n" +
"	    else\n" +
"	    {\n" +
"	      System.out.println(\"TERJEMAHAN = \"+kata[k][1]);\n" +
"	    }\n" +
"		\n" +
"		\n" +
"	}\n" +
"	}\n" +
"\n" +
"";
       
        String duplicateDoc =
        "import java.util.Scanner;\n" +
"public class SatuB\n" +
"{\n" +
"  public static void main(String[] args)\n" +
"  {\n" +
"    Scanner in = new Scanner(System.in);\n" +
"    String[][] kata={{\"MAKAN\",\"EAT\"},{\"TIDUR\",\"SLEEP\"},{\"BERENANG\",\"SWIM\"},\n" +
"    {\"LARI\",\"RUN\"},{\"PERGI\",\"GO\"},{\"KETIK\",\"TYPE\"},{\"KOMPUTER\",\"COMPUTER\"},{\"TIKUS\",\"MOUSE\"},{\"BUKU\",\"BOOK\"},{\"PENA\",\"PEN\"},\n" +
"    };\n" +
"    String katadicari;\n" +
"\n" +
"    System.out.println(\"WELCOME TO INDONESIAN-ENGLISH DICTIONARY\");\n" +
"    System.out.print(\"MASUKAN KATA = \");\n" +
"    katadicari=in.nextLine();\n" +
"    int i,k; k=-1;\n" +
"    for(i=0;i<10;i++)\n" +
"    {\n" +
"      if(kata[i][0].equals(katadicari.toUpperCase()))\n" +
"      {\n" +
"        k=i;\n" +
"      }\n" +
"    }\n" +
"      if(k==-1)\n" +
"    {\n" +
"      System.out.print(\"Kata Yang Dicari Tidak Ditemukan \");\n" +
"    }\n" +
"    else\n" +
"    {\n" +
"      System.out.println(\"TERJEMAHAN = \"+kata[k][1]);\n" +
"    }\n" +
"  }\n" +
"}";
        
        try
        {
            prepText process = new prepText();
            String mainDocFiltered = process.ppTextwithAST(mainDoc);
            String duplicateDocFiltered = process.ppTextwithAST(duplicateDoc);

            tokenizeCode next = new tokenizeCode();
            String mainDocTokenized = next.tokenizerJava(mainDocFiltered);
            String duplicateDocTokenized = next.tokenizerJava(duplicateDocFiltered);

            System.out.println("Main Doc Token :\n" + mainDocTokenized);
            System.out.println("");
            System.out.println("Duplicate Doc Token:\n" + duplicateDocTokenized);
            System.out.println("");
            ROalgorithm algorithm = new ROalgorithm();
            double percentage = algorithm.similarity(mainDocTokenized, duplicateDocTokenized);
            System.out.println("Percentage of Similarity : " + percentage);
            
            
            
        } 
        catch (Exception e)
        {
            System.out.println("");
        }
    }
}
