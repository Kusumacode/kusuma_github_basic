package Assignment_101to200;//WAP using up casting concept

interface Parent1
{
	void method1();
	
	void method2();
}

public class Assign107_upcasting implements Parent1
{
	void child()
	{
		System.out.println("It is child method");
	}
	public void method1() 
	{
			System.out.println("Implement method1");
	}
	
	public void method2() 
	{		
		System.out.println("Implement method2");
	}
	public static void main(String[] args) 
	{
		Parent1 p1=new Assign107_upcasting();
		p1.method1();
		p1.method2();
	}
}
