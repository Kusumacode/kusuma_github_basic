package Assignments_1to100; 
//WAP on constructor calling with and without parameters

public class Assign14_constructor_calling 
{
	Assign14_constructor_calling(int a, int b)
	{
		int sum=a+b;
		System.out.println("Constructor calling with parameters-"+sum);
	}
	Assign14_constructor_calling()
	{
		int sum=1+2;
		System.out.println("Constructor calling without parameters-" +sum);
	}
	public static void main(String[] args) 
	{
		Assign14_constructor_calling C1=new Assign14_constructor_calling(1,1);
		Assign14_constructor_calling C2=new Assign14_constructor_calling();
	}

}
