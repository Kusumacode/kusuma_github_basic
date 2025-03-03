package Assignments_1to100; 
//WAP to check (Assignment 79 cont) both the arrays are equals are not

import java.util.Arrays;

public class Assign80_Arrays_are_equals 
{
	public static void main(String[] args) 
		{
		   int rollno[] = new int[5];
				rollno[0] = 10;
				rollno[1] = 11;
				rollno[2] = 15;
				rollno[3] = 6;
				rollno[4] = 61;
						
				int rollno_copied[]=new int[rollno.length];//5
				
				for(int i=0;i<rollno.length;i++)
				{
					rollno_copied[i]=rollno[i];
				}					
				System.out.println(Arrays.toString(rollno));
				System.out.println(Arrays.toString(rollno_copied));
			}
}


