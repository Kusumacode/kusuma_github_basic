package Basic_program; //  Calling static method inside main method

public class Assignment3
{
	static void addition()
	{ 
		System.out.println("Addition of numer:->");
	}
	static void substraction()
	{ 
		System.out.println("substraction of numer:->");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method starting......");
		addition();
		substraction();
	}

}

