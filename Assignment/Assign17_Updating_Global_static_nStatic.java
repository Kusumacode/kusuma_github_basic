package Assignments_1to100;
//WAP on updating global static and non static variable
public class Assign17_Updating_Global_static_nStatic 
{
	int age=10;
	static String name="Kusuma";
		
	public static void main(String[] args) 
	{
		//updating the static variable
		name="K kusuma";
		System.out.println(name);
		
		//updating the non static variable
		Assign17_Updating_Global_static_nStatic gss=new Assign17_Updating_Global_static_nStatic();
		System.out.println(gss.age);
		System.out.println(gss.age=90);

		
		
		
		
		/*updating the value local
		int age=10;
		System.out.println("Age" +age);
		age=90;
		System.out.println("After updating" +age);*/

	}

}
