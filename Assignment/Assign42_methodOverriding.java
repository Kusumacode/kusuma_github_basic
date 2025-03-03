package Assignments_1to100;//method overriding

class Assign42b
{
	void OTP()
	{
		System.out.println("OTP to Mobile number");
	}
}
class Assign42a extends Assign42b
{
	void OTP()
	{		 
		System.out.println("OTP to GMail");
	}
}
public class Assign42_methodOverriding extends Assign42a
{
	public static void main(String[] args) 
	{
		Assign42_methodOverriding A42=new Assign42_methodOverriding();
		A42.OTP();
	}

}
