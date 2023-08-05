// 6. A Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
   //Example like - 0,0,1,0,3,0,5,0,6
	//		    - O/P - 1  3  5  6  0  0  0  0  0 

import java.util.*;
import java.util.Scanner;

 public class Qus6 
 {
     public static void main(String[] args) 
	 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements for array:- ");
        for (int i = 0; i < size; i++)
		{
            arr[i] = sc.nextInt();
        }
		
        int i = 0;
		System.out.println("Original array:- ");
		for (int n : arr)
		{
            System.out.print(n+"  ");
		}
		
        for(int j = 0, l = arr.length; j < l;) 
		{
            if(arr[j] == 0)
			{
                j++;
			}
            else 
			{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i ++;
                j ++;
            }
        }
		
        while (i < arr.length)
		{
            arr[i++] = 0;
		}
		System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : arr)
		{
            System.out.print(n+"  ");
		}
		System.out.print("\n");
    }
}
