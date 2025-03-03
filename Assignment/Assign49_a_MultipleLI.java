package Assignments_1to100;
//Multiple level of inheritance using concept of interface

interface c
{
	static void c_method()
	{
	System.out.println("Interface c");
	}
}
class b implements c
{
	static void b_method()
	{
	System.out.println("Method b");
	}
}

public class Assign49_a_MultipleLI extends b
{
	static void Class_a()
	{
	System.out.println("class a");
	}
	public static void main(String[] args) 
	{
		Class_a();
		b_method();
		
	}

}
