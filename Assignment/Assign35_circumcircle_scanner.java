
package Assignments_1to100; // Circumference of circle using Scanner class

import java.util.Scanner;

public class Assign35_circumcircle_scanner 
{
	public static void main(String[] args) 
	{
		Scanner c1 =new Scanner(System.in);
		double pi=3.14;
		System.out.println("Enter the value of radius");
		double r=c1.nextDouble();
		double cofcir=2*pi*r;
		System.out.println("Circumference of circle is="+cofcir);
	}

}
