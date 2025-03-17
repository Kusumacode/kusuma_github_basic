package Assignments_1to100;//Find out the average value of 4 numbers in array of int data type

public class Assign76_Average_4Nos
{
	static int sum=0;
	static double average=0;
	
	public static void main(String[] args) 
	{
		int no[]=new int[4];
		no[0]=78;
		no[1]=72;
		no[2]=15;
		no[3]=33;
		
		//or int number[]={11,43,67}; 
		//String name[]={"name1", "name2", "name3"};
		
		for(int i=0;i<no.length;i++) 
		{
			sum=sum+no[i];
		}
		
		System.out.println("The addition of the 4 numers in Array: " +sum);
		
		average=sum/no.length;
				
		System.out.println("The average of 4 numers are: " +average);
	}

}	
		
