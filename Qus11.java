// 11. Java program to read the first 3 lines of a file.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Qus11 
{ 
    public static void main(String a[])
	{
        BufferedReader br = null;
        String strLine = "";
        try 
		{
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("xyz.txt"), "UTF-8"));
             while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3)
			 {
                System.out.println(strLine);
             }
           reader.close();
        } 
		catch (FileNotFoundException e) 
		{
            System.err.println("File not found");
        } 
		catch (IOException e) 
		{
            System.err.println("Unable to read the file.");
        }
     }
}