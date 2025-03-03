package Assignments_1to100; 
//Calling Static method with and without parameters inside main method

public class Assign12_Calling_static_Para_nonPara 
{
Assign12_Calling_static_Para_nonPara() 
	   {
		   System.out.println("To call Non-Static menthod we need to create an object");
	   }
	static void add(int a) // parameter 1
	{
	int sum=a+6;
	System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
	Assign12_Calling_static_Para_nonPara c1=new Assign12_Calling_static_Para_nonPara();
	add(100); 
	// static method can be called directly
	}

}
