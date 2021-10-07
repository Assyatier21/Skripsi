package similarity.source.code.AST.RO;

import java.util.ArrayList;
import java.util.List;

public class ROalgorithm 
{
    public final double similarity(final String s1, final String s2)
    {
        if (s1 == null) 
            throw new NullPointerException("s1 must not be null");
        if (s2 == null) 
            throw new NullPointerException("s2 must not be null");
        if (s1.equals(s2)) 
            return 1.0d;

        List<String> matches = getMatchList(s1, s2);
        int sum_of_matches = 0;

        for (String match : matches)
            sum_of_matches += match.length();

        return 2.0d * sum_of_matches / (s1.length() + s2.length());
    }

    private static List<String> getMatchList(final String s1, final String s2)
    {
        List<String> list = new ArrayList<String>();
        String match = frontMaxMatch(s1, s2);

        if (match.length() > 0)
        {
            String frontsource = s1.substring(0, s1.indexOf(match));
            String fronttarget = s2.substring(0, s2.indexOf(match));
            List<String> frontqueue = getMatchList(frontsource, fronttarget);

            String endsource = s1.substring(s1.indexOf(match) + match.length());
            String endtarget = s2.substring(s2.indexOf(match) + match.length());
            List<String> endqueue = getMatchList(endsource, endtarget);

            list.add(match);
            list.addAll(frontqueue);
            list.addAll(endqueue);
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
}
