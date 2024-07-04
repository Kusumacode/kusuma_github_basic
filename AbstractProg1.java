package Basic_program;
abstract class Command_prompt //abstract class
{
	abstract void add(); //abstract method
}
public class AbstractProg1 extends Command_prompt//Concrete class
{
	void add() 
	{
		System.out.println("The real implementation will be here");
	}
	
	public static void main(String[] args) //Concrete method
	{
		AbstractProg1 ap=new AbstractProg1();
		ap.add();
	}
}
