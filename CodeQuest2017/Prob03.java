/**
 * Addiply
 *
 * @author (Ajoke Akinseye)
 * @version (12/24/2017)
 */
import java.io.*;
public class Prob03
{
   private static final String INPUT_FILE_NAME = "Prob03.in.txt";
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
               String[] numbers = inLine.split(" ");
               int number1 = Integer.parseInt(numbers[0]);
               int number2 = Integer.parseInt(numbers[1]);
               int sum = number1 + number2;
               int product = number1 * number2;
               System.out.println(sum + " " + product);
           }//end while
       }//end try
       catch(Exception e)
       {
           e.printStackTrace();
       }//end catch
   }//end main 
}//end class
