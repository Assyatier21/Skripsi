/**
 * @author Assyatier21
 */
package similarity.source.code.AST.RO;


public class MainProgram 
{
    public static void main(String[] args) throws Exception
    {
        String mainDoc =
        "Day = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']\n" +
        "num = int(input(\"Insert num of Day = \"))\n" +
        "\n" +
        "if (num >= 1) and (num <= 7):\n" +
        "    print 'The Day number is ' + str(num) + 'and the Name is ' +  hari[bil - 1]\n" +
        "else:\n" +
        "    print 'The day is not available'";
       
        String duplicateDoc =
        "hari = ['Senin', 'Selasa', 'Rabu', 'Kamis', 'Jumat', 'Sabtu', 'Minggu']\n" +
        "\n" +
        "bil = int(input(\"Masukkan angka untuk menentukan hari = \"))\n" +
        "\n" +
        "if (bil >= 1) and (bil <= 7):\n" +
        "    print 'Hari ke ', bil, ' adalah hari ', hari[bil - 1]\n" +
        "else:\n" +
        "    print 'Hari tidak tersedia'";
        
//        String mainDoc =
//        "import java.util.Scanner;\n" +
//        "public class testfile {\n" +
//        "\n" +
//        "	public static void main(String[] args) {\n" +
//        "\n" +
//        "for( int j=1; j<=7; j++) {\n" +
//        "			System.out.println(\"\");\n" +
//        "			for(int i=1; i<=j; i++) {\n" +
//        "				System.out.print(\"*\");\n" +
//        "			}\n" +
//        "			\n" +
//        "		}\n" +
//        "}\n" +
//        "}";
//       
//        String duplicateDoc =
//        "package com.company;\n" +
//        "import java.util.Scanner;\n" +
//        "public class law{\n" +
//        "	public static void main(String[ args) {\n" +
//        "		System.out.print(\"Masukkan angka : \");\n" +
//        "		Scanner ss = new Scanner(System.in);\n" +
//        "			Int l = ss.nextInt();\n" +
//        "			for( int k = 1; k <= 1; k++) {\n" +
//        "				System.out.println(\"\");\n" +
//        "				for(int i = 1; I<=k;i++) {\n" +
//        "				System.out.print(\"*\");\n" +
//        "				}\n" +
//        "			}\n" +
//        "	}\n" +
//        "}";
        
        try
        {
//            prepText process = new prepText();
//            String mainDocFiltered = process.ppTextwithAST(mainDoc);
//            String duplicateDocFiltered = process.ppTextwithAST(duplicateDoc);
//
//            tokenizeCode next = new tokenizeCode();
//            String mainDocTokenized = next.tokenizerJava(mainDocFiltered);
//            String duplicateDocTokenized = next.tokenizerJava(duplicateDocFiltered);
//
//            System.out.println("Main Doc Token :\n" + mainDocTokenized);
//            System.out.println("");
//            System.out.println("Duplicate Doc Token:\n" + duplicateDocTokenized);
//            System.out.println("");
//            ROalgorithm algorithm = new ROalgorithm();
//            double percentage = algorithm.similarity(mainDocTokenized, duplicateDocTokenized);
//            System.out.println("Percentage of Similarity : " + percentage);
            
            prepText process = new prepText();
            String mainDocFiltered = process.ppTextwithAST(mainDoc);
            String duplicateDocFiltered = process.ppTextwithAST(duplicateDoc);

            tokenizeCode next = new tokenizeCode();
            String mainDocTokenized = next.tokenizerPython(mainDocFiltered);
            String duplicateDocTokenized = next.tokenizerPython(duplicateDocFiltered);

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
