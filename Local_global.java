package Basic_program;

public class Local_global 
{
	int age=90;
	static double salary=10000.12;
	
			
	public static void main(String[] args) 
	{
		System.out.println(salary);
		Local_global lg=new Local_global();
		System.out.println(age);
	}

}
