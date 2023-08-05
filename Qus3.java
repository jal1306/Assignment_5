// 3. write a java program to print 1 to 100 without using by loop

public class Qus3
{
	public static void main(String[] args) 
	{
		int number = 1;
		printNumbers(number);	
	}
	
	public static void printNumbers(int num)
	{
		if(num <= 100)
		{
			System.out.print(num +" "); 
			printNumbers(num + 1);
		}	
	}
}