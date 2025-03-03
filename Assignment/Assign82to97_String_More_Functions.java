package Assignments_1to100;//Assignment 82 to 97

public class Assign82to97_String_More_Functions 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Assignment 82 - WAP to remove 'A' letter in your name");
		String k1="kusuma";
		String k11=k1.replaceAll("a","");
		System.out.println(k11);
		
		System.out.println("Assignment 83 - WAP to replace 'A' letter with 'R' in a name");
		String ar="kusuma";
		String arr=ar.replaceAll("a", "r");
		System.out.println(arr);	
		
		System.out.println("Assignment 84 - WAP to remove all spaces from my name is yourname");
		String spa="my name is kusuma";
		String spac=spa.replaceAll(" ","");
		System.out.println(spac);	
		
		System.out.println("Assignment 85 - WAP to remove all capital letters in a given string");
		String rcap="indONASia";
		String rcap1=rcap.replaceAll("[A-Z]", "");
		System.out.println(rcap1);
		
		System.out.println("Assignment 86 - WAP to remove all smaller letters in a given string");
		String rsma="INDonasIA";
		String rsma1=rsma.replaceAll("[a-z]","");
		System.out.println(rsma1);
		
		System.out.println("Assignment 87 - WAP to remove all numeric values in a given string");
		String rnum="hundred100";
		String rnum1=rnum.replaceAll("[0-9]","");
		System.out.println(rnum1);
		
		System.out.println("Assignment 88 - WAP to check if the given String has 4 letters in it");
		String ltr4="suma";
		boolean lr4=ltr4.matches("....");
		System.out.println(lr4);
		
		System.out.println("Assignment 89 - WAP to check if the given String ends with 'A'");
		String ends="assignment";
		boolean ends_a=ends.matches("(.*)a");
		System.out.println(ends_a);
		
		System.out.println("Assignment 90 - WAP to check if the given String starts with 'K'");
		String A90="karnaraka";
		boolean check=A90.matches("k(.*)");
		System.out.println(check);
		
		System.out.println("Assignment 91 - WAP to check if the given String 'M' is present or not");
		String A91="mathematics";
		boolean check1=A91.matches("m(.*)m(.*)");
		System.out.println(check1);
		
		System.out.println("Assignment 92 - WAP to check if the given String 'Z' is present or not");
		String A92="amazon";
		boolean check2=A92.matches("(.*)z(.*)");
		System.out.println(check2);
		
		System.out.println("Assignment 93 - WAP to check if the given String 'U' is present or not");
		String A93="automation";
		boolean check3=A93.matches(".u(.*)");
		System.out.println(check3);
		
		System.out.println("Assignment 94 - WAP to check if the given String 'R' is present at the second place or not");
		String rsec="aryan";
		System.out.println(rsec.matches(".r(.*)"));
		
		System.out.println("Assignment 95 - Write down the difference between Equals,Contains & Matches");
		String Equ1="equal method";                              //equals() method
		String Equ2="equal method";
		System.out.println("equals method:" +Equ1.equals(Equ2));

		String aa1="Write Once, Run Anywhere";                   //contains()method
		System.out.println("The given word present:" +aa1.contains("hello"));
		System.out.println("The given word Present:" +aa1.contains("Write Once"));

		String aa2="Internet";								//matches()method		
		boolean mat1=aa2.matches("........");
		System.out.println("Word Matches: " +mat1);

		System.out.println("Assignment 96 - WAP to check if 'n' is present in the middle of given string attomation testing or not");
		String aa3="Automation Testing";				
		System.out.println(aa3.matches("(.*)n(.*)"));

		System.out.println("Assignment 97 -WAP to check in a given string starts with 's' , ends with 'h' and 4 letters in between");
		String aa4="surath";								
		boolean mat2=aa4.matches("s....h");
		System.out.println(mat2);

		String aa5="h ell o.. w or l d";									//remove spaces 
		System.out.println(aa5.replaceAll(" ",""));

		String aa6="Brinda";												//replace letter
		String a1=aa6.replaceAll("B", "V");
		System.out.println(a1); 
	}

}
