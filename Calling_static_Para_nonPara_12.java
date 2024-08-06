package class_assignments; 
//Calling Static method with and without parameters inside main method

public class Calling_static_Para_nonPara_12 
{
	Calling_static_Para_nonPara_12() 
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
			Calling_static_Para_nonPara_12 c1=new Calling_static_Para_nonPara_12();
			add(100); // static method can be called directly
	}

}
