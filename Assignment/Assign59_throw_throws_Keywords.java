package Assignments_1to100; //WAP using throw & throws keywords

public class Assign59_throw_throws_Keywords 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.out.println("In thread program");
	Thread.sleep(3000);
	System.out.println("After 3000ms");
	throw new NullPointerException("Sorry the cell is empty");
    }
}
