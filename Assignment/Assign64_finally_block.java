package Assignments_1to100; //WAP using finally block in try catch

import java.util.Scanner;

public class Assign64_finally_block 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		try 
		{
		System.out.println("Fill the Form:");
		System.out.print("Enter the age");
		int age=s1.nextInt();
		
		System.out.println("Enter the salary");
		double salary=s1.nextDouble();
		
		System.out.println("Enter the weight");
		double weight=s1.nextDouble();

		System.out.println("Are you Student:");
		System.out.println("Mention: True or False");
		boolean Are_you_student=s1.nextBoolean();
		
		System.out.println("Entered details:");
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Weight:"+weight);
		System.out.println("Student:"+Are_you_student);
		}
		catch (Exception InputMismatchException)
		{
			System.out.println("enter valid data");
		}
		
		finally
		{
		 System.out.println("No matter what but i will always be there");
		}
	}
}
