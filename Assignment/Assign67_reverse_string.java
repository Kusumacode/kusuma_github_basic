package Assignments_1to100;
//WAP to reverse a string value
public class Assign67_reverse_string 
{
	public static void main(String[] args) 
	{
		String name="Sumitra";
		//Always we need to convert the given sting to lower case
		String input=name.toLowerCase();
		//which is not known can be given as empty string
		String reverse="";
		 
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
	}
}
