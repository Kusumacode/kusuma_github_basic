package Assignments_1to100;
//WAP on static and non static main method overloading

public class Assign57_mainMethodOverloading 
{
	public static void sum(int mmo1, int mmo2) //static method
	{
		int sum=mmo1+mmo2;
		System.out.println("int arguments method invoked: " +(mmo1+mmo2));
	}
	
	public void sum(double mmo3, double mmo4) //non-static method
	{
		double sum=mmo3+mmo4;
		System.out.println("double arguments method invoked: "+(mmo3+mmo4));
	}
	
	public static void main(String[] args) 
	{
		Assign57_mainMethodOverloading ommo=new Assign57_mainMethodOverloading();
		sum(23,24);
		ommo.sum(2.3,2.3);
	}

}
