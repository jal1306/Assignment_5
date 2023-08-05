// 7.  Calculate the factorial of a given positive integer using recursion.

import java.util.Scanner;
public class Qus7 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
        int factorial = factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }
    static int factorial(int number) 
	{
        if (number == 0) 
		{
            return 1;
        } 
		else 
		{
            return number * factorial(number - 1);
        }
    }
}