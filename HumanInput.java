package Basic_program;

import java.util.Scanner;

public class HumanInput 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a= s1.nextInt();
		System.out.println("Please enter the value of b");
		int b= s1.nextInt();
		int sum=a+b;
		System.out.println("The Addition of a and b is:" +sum);
	}
}
