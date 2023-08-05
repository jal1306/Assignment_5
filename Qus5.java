// 5. A java program to remove user define element from array if it is exist other wise display 'array element not found'.

import java.util.Scanner;
public class Qus5 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:- ");
        for (int i = 0; i < size; i++) 
		{
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to remove:- ");
        int element = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) 
		{
            if (arr[i] == element) 
			{
                found = true;
                for (int j = i; j < size - 1; j++) 
				{
                    arr[j] = arr[j + 1];
                }
                size--;
                i--;
            }
        }
        if (!found) 
		{
            System.out.println("Element not found in the array.");
        }
        System.out.println("Updated array:- ");
        for (int i = 0; i < size; i++) 
		{
            System.out.print(arr[i] + " ");
        }
    }
}