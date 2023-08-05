// 9. Java program to determine the last modified date of a file.

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Qus9 {

	public static void main(String[] args)
	{
		File file1 = new File("Qus9.java");
		File file2 = new File("xyz.txt");
		long time1 = file1.lastModified();
		long time2 = file2.lastModified();
		DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
		System.out.println("Qus9.java modified date is : " + sdf.format(time1));
		System.out.println("xyz.txt modified date is : " + sdf.format(time2));
	}
}
