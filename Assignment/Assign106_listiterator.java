package Assignment_101to200;//WAP using ListIterator

import java.util.ArrayList;
import java.util.ListIterator;

public class Assign106_listiterator 
{
	public static void main(String[] args) 
	{
		ArrayList LI=new ArrayList();
		System.out.println("Printing the Arraylist for ListIterator");
		LI.add("Amar");
		LI.add("Brunda");
		LI.add("Cindrella");
		LI.add("Dolly");
		System.out.println(LI);
		
		System.out.println("It is List of Iterator forward direction");
		ListIterator L3=LI.listIterator();
		
		while(L3.hasNext())
		{
			System.out.println(L3.next());
		}
		System.out.println("It is List of Iterator backward direction");
		
		while(L3.hasPrevious())
		{
			System.out.println(L3.previous());
		}
	}
		
	}

