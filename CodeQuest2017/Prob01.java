/**
 * Is There an Echo in Here?
 *
 * @author (Ajoke Akinseye)
 * @version (12/24/2017)
 */
import java.io.*;
public class Prob01
{
   private static final String INPUT_FILE_NAME = "Prob01.in.txt";
   public static void main(String[]args) 
   {
       try
       {
           File inFile = new File(INPUT_FILE_NAME);
           FileReader fr = new FileReader(inFile);
           BufferedReader br = new BufferedReader(fr);
           
           String inLine = null;
           
           int TC = Integer.parseInt(br.readLine());
           
           while(TC-- > 0)
           {
               inLine = br.readLine();
               System.out.println(inLine);
               System.out.println(inLine);
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
