package Assignments_1to100;
//WAP with equalsIgnoreCase, ends with, isEmpty & Repeat in String Class

public class Assign98 
{
	public static void main(String[] args) 
	{
		//equalsIgnoreCase
		String eqigca="kusuma"; 					
		boolean eq1=eqigca.equalsIgnoreCase("kusuma");
		System.out.println(eq1);
		//isEmpty
		String empt="hi";									
		System.out.println(empt.isEmpty());
		//ends with
		String endw="kusuma";						
		System.out.println(endw.endsWith("a"));
	}

}
