package Basic_program; // Method Overloading - multiple methods with the same name but parameter is different from each other.

public class parameterized_method 
{
	static void add(int a) // parameter 1
	{
		int sum=a+6;
		System.out.println(sum);
	}
	static void add(int a, int b) // parameter 2
	{
		int sum=a+b+6;
		System.out.println(sum);
	}
	static void add(double a) // parameter 3
	{
		double sum=a+6;
		System.out.println(sum);
	}
	static void add(int a, double b, double c) // parameter 4
	{
		double sum=a+b+c+6;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		add(100); // parameterized value
		add(100,200); // two parameters
		add(6.28);
		add(11,2.1,2.3);
	}

}
