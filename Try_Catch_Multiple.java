package Basic_program;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class Try_Catch_Multiple 
{
	public static void main(String[] args) 
	{
		int rollno[]=new int[3];
		rollno[0]=15;
		rollno[1]=19;
		rollno[2]=20;
		
		try
		{
		rollno[3]=33;
	    }
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("You excised the size");
		}
		catch(NullPointerException e2)
		{
			System.out.println("Handled the exception called NPE");
		}
		catch(InputMismatchException e3)
		{
			System.out.println("Handled the exception called NPE");
		}
		catch(IllegalFormatException e4)
		{
			System.out.println("Handled the exception called IME");
		}
	}
}


