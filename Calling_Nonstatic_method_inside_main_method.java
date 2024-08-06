package class_assignments; //Calling Non-static method inside main method

public class Calling_Nonstatic_method_inside_main_method 
{
	void Tomainmenthod()
	{
		System.out.println("How to Calling Non-static method inside main method");
		System.out.println("By Creating an object");
	}
	public static void main(String[] args) 
	{
		Calling_Nonstatic_method_inside_main_method Cns=new Calling_Nonstatic_method_inside_main_method();
		Cns.Tomainmenthod();
	}

}
