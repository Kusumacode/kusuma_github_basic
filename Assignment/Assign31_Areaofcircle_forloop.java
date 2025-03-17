package Assignments_1to100;
//WAP on area of circle using math.random five times using for loop
public class Assign31_Areaofcircle_forloop 
{
	public static void main(String[] args) 
	{
		double r=Math.random();
		double pivalue=Math.PI*r*r;
				
		for(int i=0; i<5; i++)
		{
			System.out.println(pivalue);
		}

	}

}

