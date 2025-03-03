package Assignments_1to100; 
//WAP in which abstract class is present along with concrete class

abstract class Bike //abstract class
{
	abstract void run();
}

public class Assign45_Abs_ConcreteMethods extends Bike
{
	void run()
	{
		System.out.println("running safely");
	}

	public static void main(String[] args) //concrete method
	{
		Assign45_Abs_ConcreteMethods a45=new Assign45_Abs_ConcreteMethods();
		a45.run();
	}



}
