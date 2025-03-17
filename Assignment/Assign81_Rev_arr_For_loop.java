package Assignments_1to100;

import java.util.Arrays;

public class Assign81_Rev_arr_For_loop 
{	
		static int k=0;
		
		public static void main(String[] args) 
		{
			int rollno[]= {15,87,65,44,32};
			int rollno_reverse[]=new int[rollno.length];
			
			for(int i=rollno.length-1;i>=0;i--)
			{
				rollno_reverse[i] = rollno[k];
				k++;
			}
			System.out.println(Arrays.toString(rollno));
			System.out.println(Arrays.toString(rollno_reverse));
			
		}
}

