package Assignments_1to100; 
// Area of rectangle using Scanner class

import java.util.Scanner;

public class Assign34_areaofRect_scanner 
{
	public static void main(String[] args) 
	{
		Scanner r1 =new Scanner(System.in);
		System.out.println("Enter the value of Length");
		double length=r1.nextDouble();
		System.out.println("Enter the value of Width");
		double width=r1.nextDouble();
		double areaofrect=length*width;
		System.out.println("Area of rectangle="+areaofrect);
	}
}
