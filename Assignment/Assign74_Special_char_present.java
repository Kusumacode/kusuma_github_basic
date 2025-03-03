package Assignments_1to100;
//WAP on given string to find out how many special characters present?

import java.util.Arrays;

public class Assign74_Special_char_present 
{
	static int count=0;
	static int letters=0;
	static int spaces=0;
	
	public static void main(String[] args) 
	{
		String find=":: 1count 2letters 3spaces ::";
		System.out.println(find.length());
		
		char c2[]=find.toCharArray();
		System.out.println(Arrays.toString(c2));
		
		for(int i=0;i<find.length();i++)
		{
			boolean b1=Character.isDigit(c2[i]);
			boolean b2=Character.isLetter(c2[i]);
			boolean b3=Character.isSpaceChar(c2[i]);
			
			if(b1==true)
			{
				count++;
			}
			if(b2==true)
			{
				letters++;
			}
			if(b3==true)
			{
				spaces++;
			}
		}
		System.out.println("The count"+count);
		System.out.println("The letters"+letters);
		System.out.println("The Spcaces"+spaces);
		
		int characters=find.length()-(count+letters+spaces);
		System.out.println("The number of special characters" +characters);
	}
			
	}

