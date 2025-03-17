package Assignments_1to100;
// Calling Non-Static method with and without parameters inside main method

public class Assign13_calling_nonstatic 
{
	void add()
	{
		int a=100; 
		int b=200;
		int sum=a+b;
		System.out.println("Calling Non-Static method without parameters");
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Assign13_calling_nonstatic cn=new Assign13_calling_nonstatic();
		cn.add();
	}

}
