package Assignment_101to200;
//up casting implicitly and explicitly and down casting
class Postoffice
{
	void Transaction() 
	{
		System.out.println("Transaction can be witdrawal or depositing");
	}
}

public class Assign120_upcasting_downcasting extends Postoffice
{	
	void Transaction() 
	{
		System.out.println("Depositng the amount");
	}

	public static void main(String[] args) 
	{
		Postoffice Po=new Assign120_upcasting_downcasting();
		Po.Transaction();
		//downcasting explicitly
		//Postoffice Po= (Postoffice) new Assignment120(); 
	}
}
