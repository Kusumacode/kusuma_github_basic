package Assignments_1to100;

import java.util.Arrays;

//WAP on copy of one array into another array using iteration
public class Assign79_Arr_using_iteration {

	public static void main(String[] args) 
	{
		int no[]=new int[5];
			no[0]=11;
			no[1]=33;
			no[2]=54;
			no[3]=77;
			no[4]=11;
			
		int copy_array[]=new int[no.length];	
		
		for(int i=no.length-1;i>=0;i--)
		{
			copy_array[i]=no[i];
		}
			System.out.println(Arrays.toString(no));
			System.out.println(Arrays.toString(copy_array));
	}

}
