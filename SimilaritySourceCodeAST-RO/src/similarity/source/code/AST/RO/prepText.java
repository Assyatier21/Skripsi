package similarity.source.code.AST.RO;

public class prepText 
{
    public String ppTextnoAST(String code)
    {
        code = code.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");
        code = code.replaceAll("(?m)^[ \t]*\r?\n", "");
        code = code.replace(" ", "");
        return code;
    }
    public String ppTextwithAST(String code)
    {
        code = code.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");
        code = code.replaceAll("(?m)^[ \t]*\r?\n", "");
        return code;
    }
    
}
