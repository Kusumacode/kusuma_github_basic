package Assignments_1to100;//method overriding with super keyword

//import java.util.Scanner;

class Bank
{
	void getRateOfInterest()
	{
		System.out.print("Genaral Rate of Interest:");
		double Total=100000*12/100;
		System.out.println(Total);
	}
}

class SBI extends Bank
{
	void getRateOfInterest()
	{
		super.getRateOfInterest(); //using super keyword
		System.out.print("SBI Rate of Interest per Year:");
		double Total=100000*13/100;
		System.out.println(Total);
	}
}

public class Assign43_SuperKeyword extends SBI
{
	public static void main(String[] args) 
	{
		Assign43_SuperKeyword A43=new Assign43_SuperKeyword();
		A43.getRateOfInterest();		
	}

}

/*Scanner Calc=new Scanner(System.in);
System.out.println("Please enter the Amount");
int Amt=Calc.nextInt();
System.out.println("Please enter the Rate of Interest");
double RofI=Calc.nextDouble();
double Total=Amt*RofI/100;*/
