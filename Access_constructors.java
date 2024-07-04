package Basic_program; // How to access the constructors.  it is non-parameterized

public class Access_constructors 
{
	Access_constructors()
	{
		System.out.println("Its how constructors work");
	}
	public static void main(String[] args) 
	{
		System.out.println("constructors access is done");
		Access_constructors Ac=new Access_constructors();
	}
}
