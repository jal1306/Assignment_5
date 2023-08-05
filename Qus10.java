// 10. Java program to write and read a plain text file

import java.io.FileWriter;
import java.io.IOException;
public class Qus10 
{ 
    public static void main(String[] args) 
	{
        try 
		{
            FileWriter writer = new FileWriter("xyz.txt", true);
            writer.write("\nWelcome to Porbandar");
            writer.close();
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
    }
}