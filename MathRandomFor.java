package class_assignments; // WAP on area of circle using math.random five times using for loop

public class MathRandomFor 
{
	static double PI_value=Math.PI;
	
	public static void main(String[] args) 
	{
	for(int i=0;i<5;i++)
			{
				double r= (Math.random());
				double area=PI_value*r*r;
				System.out.println(area);
			}	
	}
}
