package class_assignments;

public class ConstructorOverloadingProgram 
{
	ConstructorOverloadingProgram(int a, int b)
	{
	int multi=a*b;
	System.out.println(multi);
	}
	
	ConstructorOverloadingProgram()
	{
	double multiply=11*14.1*15;
	System.out.println(multiply);
	}
	

	
	public static void main(String[] args) 
	{
		ConstructorOverloadingProgram cop=new ConstructorOverloadingProgram(12,12);
		ConstructorOverloadingProgram co=new ConstructorOverloadingProgram();		
	}

}
