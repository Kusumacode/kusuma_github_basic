package Assignments_1to100;
/*Write a program on combination of method overloading 
and constructor overloading*/

public class Assign15_Method_constructor_overloading 
{
	void add(int a, int b) 
	{
		int sum=a+b;
		System.out.println("Method overloading 1 >>>"+sum);
	}
	void add(int e, double f)
	{
		double result=e+f;
		System.out.println("Method overloading 2 >>>"+result);
	}
	Assign15_Method_constructor_overloading(int c, double d)
	{
		double mul=c*d;
		System.out.println("Constructor calling with parameters" +mul);
	}
	Assign15_Method_constructor_overloading()
	{
		int addition=11+5;
		System.out.println("Constructor calling without parameters" +addition);

	}
	public static void main(String[] args) 
	{
		Assign15_Method_constructor_overloading add1=new Assign15_Method_constructor_overloading ();
		add1.add(5,5);
		add1.add(5, 5.5);
		Assign15_Method_constructor_overloading cons2=new Assign15_Method_constructor_overloading(5, 5);
	}

}
