package Assignments_1to100;
//WAP to perform add,sub,multi,div using same 2 variables in switch case

import java.util.Scanner;

public class Assign55_Switchcase_2variables 
{
	public static void main(String[] args) 
	{
		Scanner asmd=new Scanner(System.in); 
		System.out.println("To perform Add,Sub,Multi,Divn");
		System.out.println("Choose to 1.Add, 2.Sub, 3.Multi, 4.Divn");
		int caln=asmd.nextInt();
		switch(caln)
		{
		case 1: System.out.println("CalculationOfAddition");
				int num1=100;
				int num2=200;
				int sum=num1+num2;
				System.out.println(sum);
				break;
					
		case 2: System.out.println("CalculationOfSubtraction");
				int num3=100;
				int num4=200;
				int sub=num3-num4;
				System.out.println(sub);
				break;
					
		case 3: System.out.println("CalculationOfMultiplcation");
				int num5=100;
				int num6=200;
				int mul=num5*num6;
				System.out.println(mul);
				break;
					
		case 4: System.out.println("CalculationOfDivision");
				int num7=100;
				int num8=200;
				int div=num7/num8;
				System.out.println(div);
				break;
				
		default: System.out.println("Can perfom the calculation only which are in list");		
		}
	}

}
