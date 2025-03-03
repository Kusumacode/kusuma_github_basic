package Assignments_1to100; //WAP with simple try catch block

public class Assign61_try_catch_block 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=1/0;
			System.out.println(a);
		}
		catch (ArithmeticException AE)
		{
			System.out.println("handled the exception");
		}
	}
}
