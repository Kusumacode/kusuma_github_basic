package Assignments_1to100;//This calling with parameterized 

public class Assign41_This_callingstatement 
{
	Assign41_This_callingstatement(int g, int h)
	{
		System.out.println(g*h);
	}
	
	Assign41_This_callingstatement(int i, double j, int k )
	{
		this(23,24);
		System.out.println(i-j+k);
	}
	
	Assign41_This_callingstatement(double l, double m, int n)
	{
		this(2,2.2,2);
		System.out.println(l+m+n);
	}
	
	public static void main(String[] args) 
	{
		new Assign41_This_callingstatement(1.2,2.3,4);
	}

}
