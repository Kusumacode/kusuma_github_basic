package Assignments_1to100; 
//super calling with parameterized and non parameterized using Constructor

class Constructor3
{
	Constructor3(int q, int r)
	{		
		System.out.println("Constructor3 created");		
	}
} 
class Constructor2 extends Constructor3
{
	Constructor2()
	{
		super(11,12);
		System.out.println("Constructor2 created");	
		System.out.println();
	}
}

public class Assign39a_super_calling_constructor  extends Constructor2
{	
	Assign39a_super_calling_constructor ()
	{
		super();
		System.out.println("Super calling statement is used in constructor");
	}
	
	public static void main(String[] args)
	{
		new Assign39a_super_calling_constructor ();
	}
}

