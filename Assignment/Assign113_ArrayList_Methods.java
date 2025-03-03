package Assignment_101to200;
//WAP on ArrayList Methods of get() , Set() , Indexof()
import java.util.ArrayList;

public class Assign113_ArrayList_Methods
{
	public static void main(String[] args) 
	{
		ArrayList AL1=new ArrayList();
		AL1.add("Aru");
		AL1.add("Brinda");
		AL1.add("Chinni");
		AL1.add("Deepu");
		System.out.println(AL1);
		
		System.out.println(AL1.get(1));
		
		int Inof=AL1.indexOf("Brinda");
		System.out.println(Inof);
		
		AL1.set(2, "Chinnu");
		System.out.println(AL1);
	}
}
