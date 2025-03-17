package Assignments_1to100;
//Logical Operators: AND, OR, And with not, OR with not
public class Assign10_And_operator 
{
	public static void main(String[] args) 
	{
		int age=20;
		char gender='F';
		int salary=10000;
		
		if(age==20 && salary==10000 && gender=='F') 
		{
			System.out.println("AND Operator");	//executes only the condition is true
		}
		if(age==10 || salary==10000)
		{
			System.out.println("OR Operator");	//executes only the condition is T/T, T/F, F/T
	    }
		if(!(age==20 && salary==10000))
		{
			System.out.println("AND with NOT ");	
	    }
		if(!(age==20 || salary==10000))
		{
			System.out.println("OR with NOT : both the conditions are false");	
	    }
	}
}
