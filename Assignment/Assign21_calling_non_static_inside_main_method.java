package Assignments_1to100;
//Calling Non-static method inside main method
public class Assign21_calling_non_static_inside_main_method 
{
	void add()
	{
	int a=100;
	int b=200;
	int sum=a+b;
	System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		Assign21_calling_non_static_inside_main_method a21=new Assign21_calling_non_static_inside_main_method();
		a21.add();

	}

}
