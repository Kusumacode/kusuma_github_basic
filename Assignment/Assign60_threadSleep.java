package Assignments_1to100;//WAP using thread.sleep

public class Assign60_threadSleep 
{
	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		System.out.println("In thread program");
		Thread.sleep(3000);
		System.out.println("After 3000ms");
		throw new NullPointerException("Sorry the cell is empty");
	}

}
