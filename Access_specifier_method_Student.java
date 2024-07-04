package Basic_program;

public class Access_specifier_method_Student 
{
	public static void main(String[] args) 
	{
		System.out.println("b) what happens within the package");
		Access_specifier_method_Teacher T1=new Access_specifier_method_Teacher();
		T1.add(); //public
		T1.sub();//protected
		T1.div();//package or default
	}

}
