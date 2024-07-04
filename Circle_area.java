package Basic_program;

public class Circle_area 
{
	static double pi_value=Math.PI;
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			double r= Math.random();
			double area=pi_value*r*r;
			System.out.println("The area of Circle is ->" +area);
		}
	}

}
