package Assignments_1to100;

import java.util.Scanner;

public class Assign56_Switchcase 
{
	public static void main(String[] args)
	{
			Scanner s1=new Scanner(System.in);
			System.out.println("Choose any Shooping website you like to visit");
			System.out.println("1.amazon, 2. flipkart, 3.myntra, 4.meesho, 5.ajio");
			int a=s1.nextInt();
			switch(a)
			{
			case 1: System.out.println("https://www.amazon.in/");
					break;
			
			case 2: System.out.println("https://www.flipkart.com/");
					break;
			
			case 3: System.out.println("https://www.myntra.com/");
					break;
			
			case 4: System.out.println("https://www.meesho.com/");
					break;
			
			case 5: System.out.println("https://www.ajio.com/");
					break;
						
			default: System.out.println("You have choosed the number which is not in list");
			}
	}	
}
	