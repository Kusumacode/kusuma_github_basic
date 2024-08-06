package class_assignments; // WAP on GLobal Variable static and non static variable calling 

public class global_var_example 
{
	static int a=11;
	static int b=12;
	static double c=1.2;
	
	static void addition()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void substraction()
	{
		int sub=a-b;
		System.out.println(sub);
	}
	static void multiplication()
	{
		double multi=a*c;
		System.out.println(multi);
	}
	void Division()
	{
		double div=b/c;
		System.out.println(div);
	}
	void Modulus()
	{
		int mod=a%b;
		System.out.println(mod);
	}
	
	public static void main(String[] args) 
	{
		addition();												//Static Variable
		substraction();
		multiplication();
		
		global_var_example gv=new global_var_example(); //Non-Static Variable
		gv.Division();
		gv.Modulus();
	}

}


