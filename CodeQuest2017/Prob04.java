/**
 * Fibonacci
 *
 * @author (Ajoke Akinseye)
 * @version (12/24/2017)
 */
import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;
public class Prob04
{
    private static final String INPUT_FILE_NAME = "Prob04.in.txt";
    public static void main(String[]args) throws IOException
    {
        HashMap<Integer, Long>fibonacci = new HashMap<Integer, Long>();
        fibonacci.put(0,0L);
        fibonacci.put(1,1L);
        for (int n = 2; n <= 90; n++)
        {   
            Long num = fibonacci.get(n-1) + fibonacci.get(n-2);
            fibonacci.put(n,num);
        }//end for
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
                int sequenceNum = Integer.parseInt(inLine);
                int index = sequenceNum - 1;
                System.out.println(sequenceNum + " = " + fibonacci.get(index));
            }//end while
        }//end try
        catch(Exception e) 
        {
            e.printStackTrace();
        }//end catch
    }//end main
}//end class