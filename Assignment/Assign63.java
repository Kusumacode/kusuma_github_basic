package Assignments_1to100;//WAP using multiple catch block

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign63 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		try
		{
			System.out.println("Fill the details:");
			System.out.println("Enter the Age");
			int age=s1.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Enter the Age, numering value");
			try
			{
				Scanner s2=new Scanner(System.in);
				int age=s2.nextInt();
				
			}
			catch(InputMismatchException a2)
			{
				Scanner s3=new Scanner(System.in);
				System.out.println("Enter the Age");
				int age=s3.nextInt();
			}
		}
		
		try
		{
			Scanner s11=new Scanner(System.in);
			System.out.println("Enter the salary");
			double salary=s11.nextDouble();
		}
		catch(InputMismatchException a3)
		{
			System.out.println("Enter the exact salary, only numeric values");
			try
			{
				Scanner s22=new Scanner(System.in);
				double salary=s22.nextDouble();
			}
			catch(InputMismatchException a2)
			{
				Scanner s33=new Scanner(System.in);
				System.out.println("Enter the salary");
				int age=s33.nextInt();
			}
			
		}
}
}
