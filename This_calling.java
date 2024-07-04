package Basic_program;

public class This_calling 
{
	This_calling (int a)
	{
		System.out.println("1");
	}
	This_calling (int a, int b)
	{
		this(20);
		System.out.println("2");
	}
	This_calling (int a, double b)
	{
		this(20,11);
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		new This_calling(20,1.2);
	}

}
