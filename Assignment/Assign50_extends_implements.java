package Assignments_1to100;
/*WAP in which we are writing extends & implements keywords in a subclass*/
interface Amazon_login 
{
	void Login_with_Mob();
	void Login_with_Gmail();
}
abstract class FB_login
{
	abstract void Login_with_Mob();
	void Login_with_Gmail()
	{ 
		System.out.println("abstract class method FB Login with Gmail");
	}
}
public class Assign50_extends_implements extends FB_login implements Amazon_login 
{
	//Unimplemented methods
	public void Login_with_Mob() 
	{		
		System.out.println("abstract class method FB Login with Mobno");
	}

	
	public void Login_with_Gmail() 
	{
		System.out.println("abstract class method FB Login with Gmail");
	}

	public static void main(String[] args) 
	{
		Assign50_extends_implements A50=new Assign50_extends_implements();
		A50.Login_with_Mob();
		A50.Login_with_Gmail();
		
		//interface
		A50.Login_with_Gmail();
		A50.Login_with_Mob();
	}
	
}
