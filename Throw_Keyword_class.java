package Basic_program;

public class Throw_Keyword_class 
{
	public static void main(String[] args) throws NullPointerException, InterruptedException
	{	
		System.out.println("Kusuma");
		Thread.sleep(5000);
		System.out.println("Student");
		throw new NullPointerException("Sorry the cell is empty");
	}

}
