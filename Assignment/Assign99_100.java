package Assignments_1to100;//WAP to convert any String into array

import java.util.Arrays;

public class Assign99_100
{
	public static void main(String[] args) 
	{
		String spt="my name is kusuma";
		String spt1[]= spt.split(" "); //one scenario using space between word
		//String spt1[]= spt.split(""); //another scenario using empty string for character
		
	    System.out.println(spt1[0]);
	   	    
	    System.out.println(Arrays.toString(spt1)); //Assignment 100
	}

}
