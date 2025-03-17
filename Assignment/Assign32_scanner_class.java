package Assignments_1to100; 
/*Using scanner class static and non static lets do Addition,Subtraction , 
Multiplication division and modulus of 4 different method.*/

import java.util.Scanner;

public class Assign32_scanner_class
{
	 static Scanner s1=new Scanner(System.in);
	
	 void Addition()
	{
		int a =s1.nextInt();
		int b =s1.nextInt();
		int sum=a+b;
		System.out.println("The addition of 2 Numbers are - " +sum);
	}
	
	 void Subtraction()
	{
		int a =s1.nextInt();
		int b =s1.nextInt();
		int sub=a-b;
		System.out.println("The Subtraction of 2 Numbers are - " +sub);
	}
	 void Multiplication()
	{
		int a =s1.nextInt();
		int b =s1.nextInt();
		int mul=a*b;
		System.out.println("The Multiplication of 2 Numbers are - " +mul);
	}
	static void Division()
	{
		int a =s1.nextInt();
		int b =s1.nextInt();
		int div=a/b;
		System.out.println("The Division of 2 Numbers are - " +div);
	}
	static void Modulus()
	{
		int a =s1.nextInt();
		int b =s1.nextInt();
		int mod=a%b;
		System.out.println("The Modulus of 2 Numbers are - " +mod);
	}
	
	public static void main(String[] args)
	{
		Assign32_scanner_class a1=new Assign32_scanner_class();
		a1.Addition();
		a1.Subtraction();
		a1.Multiplication();
		Division();
		Modulus();
	}

}
