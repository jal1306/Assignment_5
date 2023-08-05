// 4. write a java program to swap two variables in One line without using temporary variables
// 4.  write a java program to swap two variables in One line without using temporary variables.

import java.io.*;
import java.util.Scanner;

public class Qus4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:- ");
		int a = sc.nextInt();
		System.out.println("Enter second number:- ");
		int b = sc.nextInt();
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping, a = " + a + " and b = " + b);
	}
}