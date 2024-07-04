package Basic_program; // How to Declare and initialize all the methods of Scanner Class

import java.util.Scanner;

public class HumanInput_Run 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in); // Passing the Parameter her bcz Scanner does not have Non-para
		String name=s1.next();
		byte a=s1.nextByte();
		int s=s1.nextInt();
		short b=s1.nextShort();
		long c=s1.nextLong();
		boolean d=s1.nextBoolean();
		float f1=s1.nextFloat();
		double d2=s1.nextDouble();
		
		System.out.println("all methods", s1 );
	}
}
