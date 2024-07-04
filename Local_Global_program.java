package Basic_program;

public class Local_Global_program 
{
	int age=10;
	static String name="kusuma";
	public static void main(String[] args) 
	{
		name="k kusuma"; //updating the global static variable.
		System.out.println(name); // calling the static method 
		
		Local_Global_program lgp=new Local_Global_program(); // calling global non-static variable by creating an object.
		System.out.println(lgp.age); //updating the global non-static variable inside main method.
		System.out.println(lgp.age=90); 
	}

}
