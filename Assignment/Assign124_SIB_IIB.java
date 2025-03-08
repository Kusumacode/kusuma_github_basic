package Assignment_101to200;

//WAP with parameterized constructor in SIB,IIB Concept
public class Assign124_SIB_IIB {
	static // Static Initialization Block
	{
		System.out.println("SIB");
	}

	{ // Instance Initialization Block
		System.out.println("IIB");
	}

	Assign124_SIB_IIB(int a, double b) {
		double sum = a + b;
		System.out.println("Parameterized constructor--> " + sum);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new Assign124_SIB_IIB(100, 144.5);
	}

}

/*
 * How to invoke SIB? -if main method is present the SIB will automatically
 * invoke -the order execution will be sequential
 * 
 * How to invoke IIB? -by creating an object
 */
