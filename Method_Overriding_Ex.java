package Basic_program;

class Method_parent
{
	void login()
	{
		System.out.println("Login from mobile no");
	}
}

public class Method_Overriding_Ex extends Method_parent
{
	void login()
	{
				System.out.println("Login from E-mail ID");
				super.login(); //super keyword
	}
	public static void main(String[] args) 
	{
		Method_Overriding_Ex mo=new Method_Overriding_Ex();
		mo.login();
	}

}
