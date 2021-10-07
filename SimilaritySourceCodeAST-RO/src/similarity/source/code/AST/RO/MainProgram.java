package similarity.source.code.AST.RO;
/**
 *
 * @author Assyatier21
 */
public class MainProgram 
{
    public static void main(String[] args) throws Exception
    {
        String mainDoc =
        "import java.util.Scanner;\n" +
        "public class testfile {\n" +
        "\n" +
        "	public static void main(String[] args) {\n" +
        "\n" +
        "for( int j=1; j<=7; j++) {\n" +
        "			System.out.println(\"\");\n" +
        "			for(int i=1; i<=j; i++) {\n" +
        "				System.out.print(\"*\");\n" +
        "			}\n" +
        "			\n" +
        "		}\n" +
        "}\n" +
        "}";
       
        String duplicateDoc =
        "package com.company;\n" +
        "import java.util.Scanner;\n" +
        "public class law{\n" +
        "	public static void main(String[ args) {\n" +
        "		System.out.print(\"Masukkan angka : \");\n" +
        "		Scanner ss = new Scanner(System.in);\n" +
        "			Int l = ss.nextInt();\n" +
        "			for( int k = 1; k <= 1; k++) {\n" +
        "				System.out.println(\"\");\n" +
        "				for(int i = 1; I<=k;i++) {\n" +
        "				System.out.print(\"*\");\n" +
        "				}\n" +
        "			}\n" +
        "	}\n" +
        "}";
        
//        String mainDoc =
//        "081807111216172407130411182327283435374148162224283536424345468121416212229303181011131620121819222330313940813151618212412181922233031404181315161821231218192223303140418131516182123121819222330314041";
//       
//        String duplicateDoc =
//        "081807111216172407130411182327283435374148161921253233394042439131517192027282981011131618212325271218192223303139498131516182124272931331218192223303140418131516182124272931341218192223303140418131516182125283032361218192223303140418121819222330313940400";
        
        try
        {
            prepText process = new prepText();
            String mainDocFiltered = process.ppTextwithAST(mainDoc);
            String duplicateDocFiltered = process.ppTextwithAST(duplicateDoc);

            tokenizeCode next = new tokenizeCode();
            String mainDocTokenize = next.tokenizer(mainDocFiltered);
            String duplicateDocTokenize = next.tokenizer(duplicateDocFiltered);

            System.out.println("Main Doc Token :\n" + mainDocTokenize);
            System.out.println("");
            System.out.println("Duplicate Doc Token:\n" + duplicateDocTokenize);
            System.out.println("");
            ROalgorithm algorithm = new ROalgorithm();
            double percentage = algorithm.similarity(mainDocTokenize, duplicateDocTokenize);
            System.out.println("Percentage of Similarity : " + percentage);
        } 
        catch (Exception e)
        {
            System.out.println("");
        }
    }
}
