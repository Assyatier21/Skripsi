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
"public class T1 {\n" +
"	public static void main(String[] args) {\n" +
"		Scanner input = new Scanner(System.in);\n" +
"		System.out.print(\"Enter the radius and length of a cylinder: \");\n" +
"		double radius = input.nextDouble();\n" +
"		double length = input.nextDouble();\n" +
"\n" +
"		double area = radius * radius * 3.14159;\n" +
"		double volume = area * length;\n" +
"\n" +
"		System.out.println(\"The area is \" + area);\n" +
"		System.out.println(\"The volume of the cylinder is \" + volume);\n" +
"	}\n" +
"\n" +
"}";
       
        String duplicateDoc =
        "// Modification - 1\n" +
"// Percentage Change : 25%\n" +
"\n" +
"import java.util.Scanner;\n" +
"\n" +
"public class M1T1 {\n" +
"	public static void main(String[] args) {\n" +
"		Scanner in = new Scanner(System.in);\n" +
"\n" +
"		double radius = in.nextDouble();\n" +
"		double length = in.nextDouble();\n" +
"\n" +
"		System.out.println(\"Surface Area : \" + (radius * radius * 3.14159));\n" +
"		System.out.println(\"Volume of the cylinder : \" + (radius * radius * 3.14159 * length));\n" +
"	}\n" +
"\n" +
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
