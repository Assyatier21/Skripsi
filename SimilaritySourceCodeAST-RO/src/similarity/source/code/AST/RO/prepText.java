package similarity.source.code.AST.RO;

public class prepText 
{
    public String ppTextnoAST(String document)
    {
        document = document.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");
        document = document.replaceAll("(?m)^[ \t]*\r?\n", "");
        document = document.replace(" ", "");
        return document;
    }
    public String ppTextwithAST(String document)
    {
        document = document.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)","");
        document = document.replaceAll("(?m)^[ \t]*\r?\n", "");
        return document;
    }
    
}
