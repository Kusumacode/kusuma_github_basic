package Basic_program;
class Set_URL
{
	Set_URL(int age)
	{
		System.out.println("Set_URL");
	}
}
class Launch_the_Browser extends Set_URL
{
	Launch_the_Browser(String Google_Chrome)
	{
		super(90);
		System.out.println("Launch the Browser");
	}
}
public class Super_calling extends Launch_the_Browser
{
	Super_calling()
	{
		super("http://amazon.com");
		System.out.println("Super calling statement");
	}
	public static void main(String[] args) 
	{
		Super_calling s1=new Super_calling();
	}

}
