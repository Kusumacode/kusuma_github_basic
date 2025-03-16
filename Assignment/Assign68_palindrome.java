package Assignments_1to100;
//WAP to check if the given string is palindrome
public class Assign68_palindrome 
{
	public static void main(String[] args) 
	{
		String name="rotator";
		//Always we need to convert the given sting to lower case
		String input=name.toLowerCase();
		//which is not known, can be given as empty string
		String reverse="";
		 
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
		}
			System.out.println(reverse);
			boolean result=name.equals(reverse);
			//System.out.println(result);
			
			if(result==true)
			{
				System.out.println("input is pallindrome");
			}
			else
			{
				System.out.println("input is not pallindrome");
			}
	}
}
