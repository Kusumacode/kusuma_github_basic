package Assignment_101to200;
//WAP using Iterator (process of iteration through iterable)

import java.util.ArrayList;
import java.util.Iterator;

public class Assign105_Iterator_iterable 
{
	public static void main(String[] args) 
	{
		ArrayList It=new ArrayList();
		System.out.println("Printing the Arraylist");
		It.add("Ritu");
		It.add("Nitu");
		It.add("Aru");
		It.add("Miru");
		It.add("Tinku");
		System.out.println(It);
		
		System.out.println("Printing the Forward");
		Iterator It1=It.iterator();
		while(It1.hasNext())
		{
			System.out.println(It1.next()); 
			//it will check the next element
		}
	}
}
