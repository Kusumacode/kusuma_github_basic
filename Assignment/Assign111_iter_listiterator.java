package Assignment_101to200;//WAP- Iterator in concept of ListIterator

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assign111_iter_listiterator 
{
	public static void main(String[] args)
	{
		LinkedList L2=new LinkedList();
		 L2.add("Archana");
		 L2.add("Bhavana");
		 L2.add("Chinni");
		 L2.add("Dolly");
		 L2.add("Esha");
		 
		 System.out.println("Iterator in concept of Linklist");
		 Iterator A110= L2.iterator();
		 while(A110.hasNext())
		 {
			 System.out.println(A110.next());
		 }
	}
}
