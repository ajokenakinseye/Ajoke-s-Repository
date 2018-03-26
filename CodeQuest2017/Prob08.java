/**
 * Mission to Mars
 * 
 * @author (Ajoke Akinseye)
 * @version (3/12/2018)
 */
import java.io.*;
public class Prob08 
{
    private static final String INPUT_FILE_NAME = "Prob08.in.txt";
    public static void main(String[]args) throws IOException
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
                String[] numbers = inLine.split(" ");
                double distance_between_earth_and_mars = Double.parseDouble(numbers[0]) * 1000000.0;
                double ship_speed = Double.parseDouble(numbers[1]);
                double time = distance_between_earth_and_mars / ship_speed;
                double days = 0.0;
                for(days = 0.0; time >= 24.0; days++)
                {
                    time -= 24.0;
                }//end for
                double hours = 0.0;
                for(hours = 0.0; time >= 1.0; hours++)
                {
                    time -= 1;
                }//end for
                double minutes = 0.0;
                for(minutes = 0.0; time >= (1.0 / 60.0); minutes++)
                {
                    time -= (1.0 / 60.0);
                }//end for
                double seconds = 0.0;
                for(seconds = 0.0; time >= (1.0 / 3600.0); seconds++)
                {
                    time -= (1.0 / 3600.0);
                }
                System.out.println("Time to Mars: " + (int) days + " days, " + (int) hours + " hours, " + (int) minutes + " minutes, " + (int) seconds + " seconds");
            }//end while
        }//end try
        catch(Exception e)
        {
            e.printStackTrace();
        }//end catch
    }//end main 
}//end class