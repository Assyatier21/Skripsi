/*
 * Name     : Muhammad Sholeh
 * NIM      : 09021281823172
 * Kelas    : Reguler C 2018
 */
package ro.algorithm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ROAlgorithm
{
    private static double similarity(final String authDoc, final String modifiedDoc)
    {
        if (authDoc == null || modifiedDoc == null) 
            throw new NullPointerException("Document must not be null");
        
        if (authDoc.equals(modifiedDoc))
            return 1.0d;

        List<String> matches = getMatchList(authDoc, modifiedDoc);
        int sum_of_matches = 0;

        for(String match : matches) 
            sum_of_matches += match.length();
        
        // RO-Formula-Calcuation
        return 2.0d * sum_of_matches / (authDoc.length() + modifiedDoc.length()); 
    }
     
    public static final double distance(final String authDoc, final String modifiedDoc) 
    {
        return 1.0d - similarity(authDoc, modifiedDoc);
    }
    
    private static List<String> getMatchList(final String authDoc, final String modifiedDoc) 
    {
        List<String> list = new ArrayList<String>();
        String match = frontMaxMatch(authDoc, modifiedDoc);

        if (match.length() > 0)
        {
            String frontSource = authDoc.substring(0, authDoc.indexOf(match));
            String frontTarget = modifiedDoc.substring(0, modifiedDoc.indexOf(match));
//            System.out.println(frontSource + " -- " + frontTarget);
            List<String> frontQueue = getMatchList(frontSource, frontTarget);
            
            String endSource = authDoc.substring(authDoc.indexOf(match) + match.length());
            String endTarget = modifiedDoc.substring(modifiedDoc.indexOf(match) + match.length());
//            System.out.println(endSource + " -- " + endTarget);
            List<String> endQueue = getMatchList(endSource, endTarget);
            
            list.add(match);
            list.addAll(frontQueue);
            list.addAll(endQueue);
        }

        return list;
    }
     private static String frontMaxMatch(final String s1, final String s2)
     {
        int longest = 0;
        String longestsubstring = "";

        for (int i = 0; i < s1.length(); i++)
        {
            for (int j = i + 1; j <= s1.length(); j++)
            {
                String substring = s1.substring(i, j);
                if (s2.contains(substring) && substring.length() > longest)
                {
                    longest = substring.length();
                    longestsubstring = substring;
                }
            }
        }
        return longestsubstring;
    }  
    public static void main(String[] args)
    {
        String kodeAsli = 
        "for (int i = 0; i <= 2; i++) \n" +
"        {\n" +
"            for (int j = 0; j <= 2; j++) \n" +
"            {\n" +
"                System.out.println(\"Print x[\"+i+\"] y[\"+j+\"]\");\n" +
"            }\n" +
"        }";
        
        String kodeDuplikat = 
        " int k;\n" +
"        int l;\n" +
"        for (k = 0; k < 3; k++){\n" +
"            for (l = 0; k < 2; l++){\n" +
"                System.out.println(\"Print x[\"+k+\"] y[\"+l+\"]\");\n" +
"            }\n" +
"        }";
        
        System.out.println(similarity(kodeAsli, kodeDuplikat));
    }
}
