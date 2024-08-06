package class_assignments; //WAP on area of circle using math.random()

public class MathRandom 
{
	static double pi_value=Math.PI;
	
	public static void main(String[] args) 
	{
		double r= (Math.random());
		double area=pi_value*r*r;
		System.out.println(area);
	}

}
