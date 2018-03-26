
/**
 * Something's Missing
 *
 * @author (Ajoke Akinseye)
 * @version (12/24/2017)
 */
import java.io.*;
public class Prob02
{
    private static final String INPUT_FILE_NAME = "Prob02.in.txt";
    public static void main(String[]args) throws IOException
    {
        try
        {
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            
            String inLine = null;
            
            int TC = Integer.parseInt(br.readLine());
            
            while (TC-- > 0)
            {
                inLine = br.readLine();
                //System.out.println(inLine);
                String[] word = inLine.split(" ");
                int index = Integer.parseInt(word[1]);
                String newWord = word[0].substring(0,index) + word[0].substring(index + 1);
                System.out.println(newWord);
            }//end while
            br.close();
            fr.close();
        }//end try
        catch(Exception e)
        {
            e.printStackTrace();
        }//end catch
    }//end main
}//end class
