package Assignments_1to100; //WAP on area of circle using global variable

public class Assign18_areaof_circle_global_oper 
{
	static double pi=3.14;
		
	static void Areaofcircle()
	{
		int r=10;
		double area=pi*r*r;
		System.out.println(area);
	}

	public static void main(String[] args) 
	{
		System.out.print("Print area of circle=");
		Areaofcircle();
	}

}
