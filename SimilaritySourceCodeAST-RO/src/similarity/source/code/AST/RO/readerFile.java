/*
 * Nama    : Muhammad Sholeh
 * NIM     : 09021281823172
 * Kelas   : Reguler C 2018
 */

package similarity.source.code.AST.RO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readerFile 
{
    public static String[] read(String path) throws FileNotFoundException, IOException
    {
        File directoryPath = new File(path);
        File filesList[] = directoryPath.listFiles();
        String duplicateDocs[] = new String[filesList.length];
        int idx = 0;
        
        for(File file : filesList)
        {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[10];
            while (reader.read(buffer) != -1)
            {
                stringBuilder.append(new String(buffer));
                buffer = new char[10];
            }
            reader.close();

            duplicateDocs[idx] = stringBuilder.toString();
            idx++;
        }
        return duplicateDocs;
    }
}
