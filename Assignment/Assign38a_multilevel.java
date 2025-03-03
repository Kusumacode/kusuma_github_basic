package Assignments_1to100; //Multi level inheritance using static method

class fruit1
{
	static void fruit()
	{
		System.out.println("Its a Fruit");
	}
}

class  flower1 extends fruit1
	{
		static void flower()
		{
	System.out.println("Flower blooms");
		}
	}

public class Assign38a_multilevel extends flower1
{
	static void bud() 
	{
		System.out.println("Its a bud");
	}
	public static void main(String[] args) 
	{
	bud();
	flower();
	fruit();
	}
}
