package Assignments_1to100;
//input mismatch exception with all the methods of scanner class

import java.util.Scanner;

public class Assign40_Scanner_inputmismatch 
{	
		public static void main(String[] args) 
		{
			Scanner s1=new Scanner(System.in); 
			System.out.println("Enter the String");
			String a=s1.next();
			System.out.println("Enter the int value");
			int a1=s1.nextInt(); //InputMismatchException
			System.out.println("Enter the short value");
			short a2=s1.nextShort();
			System.out.println("Enter the long value");
			long a3=s1.nextLong();
			System.out.println("Enter the byte value");
			byte a4=s1.nextByte();
			System.out.println("Enter the boolean value");
			boolean a5=s1.nextBoolean();
			System.out.println("Enter the float value");
			float a6=s1.nextFloat();
			System.out.println("Enter the double value");
			double a7=s1.nextDouble();
		}
	}

