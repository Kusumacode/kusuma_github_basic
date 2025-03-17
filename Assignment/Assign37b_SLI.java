package Assignments_1to100; //Single inheritance using non-static method
class parent1
{
	void New_student1()
	{
		System.out.println("Name: C, class:10th, fee:20,000");
	}
}
public class Assign37b_SLI extends parent1
{
	void New_student2()
	{
		System.out.println("Name: D, class:10th, fee:20,000");
	}
	public static void main(String[] args) 
	{
		Assign37b_SLI Assign36_SLI=new Assign37b_SLI();
		Assign36_SLI.New_student1();
		Assign36_SLI.New_student2();
	}
}
