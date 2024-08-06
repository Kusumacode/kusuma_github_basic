package class_assignments; // Calling Non-Static method with parameters inside main method

public class Calling_nonstatic1 
{
	void add(double a, double b)
	{
	double sum=a+b;
	System.out.println("Calling Non-Static method with parameters");
	System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		Calling_nonstatic1 cn1=new Calling_nonstatic1();
		cn1.add(23.33,33.44);
	}

}
