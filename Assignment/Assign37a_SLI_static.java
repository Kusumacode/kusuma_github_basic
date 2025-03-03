package Assignments_1to100; 
//Single inheritance using static method
class parent
{
	static void Student_details1()
	{
		System.out.println("Name: A, Class:10th, fee:20,000");
	}	
}
public class Assign37a_SLI_static extends parent
{
	static void Student_details2()
	{
		System.out.println("Name: B, Class:10th, fee:20,000");
	}	

	public static void main(String[] args) 
	{
		Student_details1();
		Student_details2();
	}
}
