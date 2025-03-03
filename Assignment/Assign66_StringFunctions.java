package Assignments_1to100;
//WAP using charAt, indexofchar,trim, subString- Single and double

public class Assign66_StringFunctions 
{
	public static void main(String[] args) 
	{
		String Ch="     Today is Sunday    ";
		char first_char=Ch.charAt(0);
		System.out.println(first_char);

		int Ch1=Ch.indexOf("i");
		System.out.println(Ch1);
		
		String trimmed=Ch.trim(); //trim will only delete the space which has front and back
		System.out.println(trimmed);
		
		String Ch3="Hello kusuma";
		String Ch4=Ch3.substring(2); // It will give the output from 2nd index till the end
		System.out.println(Ch4);
		
		String C1="Hello kusuma"; //substring double
		String Ch5=C1.substring(6,12);
		System.out.println(Ch5);
		
		String C2="Hello kusuma"; //substring single
		String Ch6=C2.substring(6);
		System.out.println(Ch6);
		
		
	}

}
