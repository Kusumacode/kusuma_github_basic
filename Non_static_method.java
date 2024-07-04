package Basic_program;

public class Non_static_method 
{
	void add()
	{
		System.out.println("Addition");
	}
	void Sub()
	{
		System.out.println("Substraction");
	}
	public static void main(String[] args) 
	{
		Non_static_method N1=new Non_static_method();
		N1.add();
		N1.Sub();
	}

}
