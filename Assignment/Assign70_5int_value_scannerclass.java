package Assignments_1to100;//WAP to send 5int value from scanner class in the array

import java.util.Arrays;
import java.util.Scanner;

public class Assign70_5int_value_scannerclass 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter Number:");
			numbers[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
	}
}
