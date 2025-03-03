package Assignments_1to100; 
// WAP in which age,salary,your_weight,are_you_student with try catch block
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign62_try_catch_block_StdDetails 
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
			float weight=s1.nextFloat();
			
			System.out.println("Are you Student:");
			System.out.println("Mention: True or False");
			boolean Are_you_student=s1.nextBoolean();
			
			
			System.out.println("Entered details:");
			System.out.println("Age:"+age);
			System.out.println("Salary:"+salary);
			System.out.println("Weight:"+weight);
			System.out.println("Student:"+Are_you_student);
		}
		
		catch(InputMismatchException a2)
		{
			System.out.println("You have entered invalid data, Please fill the form again");
			Scanner s2=new Scanner(System.in);
			System.out.print("Enter the age");
			int age=s2.nextInt();
			System.out.print("Age is:" +age);
			
			Scanner s3=new Scanner(System.in);
			System.out.println("Enter the salary");
			double salary=s3.nextDouble();
			System.out.print("Salary is:"+salary);
			
			Scanner s4=new Scanner(System.in);
			System.out.println("Enter the weight");
			double weight=s4.nextDouble();
			System.out.print(" Weigh is:"+weight);
			
			Scanner s5=new Scanner(System.in);
			System.out.println("Are you Student:");
			boolean Are_you_student=s5.nextBoolean();
			System.out.print("Age Student is:"+Are_you_student);
			
		}
		
	}
}
