// 12. Java program to find the longest word in a text file.

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Qus12 
{
     public static void main(String [ ] args) throws FileNotFoundException 
	 {
        try
		{
			String longest_word = "";
			String current;
			Scanner sc = new Scanner(new File("xyz.txt"));

			while (sc.hasNext()) 
			{
				current = sc.next();
				if (current.length() > longest_word.length()) 
				{
					longest_word = current;
				}
			}
			System.out.println(longest_word);
		}
			catch (IOException e) 
			{
				System.out.println("File Not Found");
			}
	}
}
