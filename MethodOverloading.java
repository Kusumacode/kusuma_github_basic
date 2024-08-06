package class_assignments; // Write a program on combination of method overloading and constructor overloading

public class MethodOverloading 
{
	static void add(int a) //Static Method Overloading 
	{
		int sum=a+1;
		System.out.println(sum);	
	}
	void sub(double a, double b) //Non-Static Method Overloading 
	{
		double sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) 
	{
		add(100); //Static method calling directly
		
		MethodOverloading MO=new MethodOverloading();//non-static method by creating object
		MO.sub(2.3,1.2);		
	} 
}
