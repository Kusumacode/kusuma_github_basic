package Assignment_101to200;//WAP- Iterator in concept of Linklist

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assign110_Iter_linkedlist 
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
	 Iterator A110= L2.iterator(); //fetch the information and traverse the element in the farward direction
	 while(A110.hasNext())
	 {
		 System.out.println(A110.next());
	 }
	 
	 System.out.println("hasNext Linklist"); // forward and backward direction
	 ListIterator A111=L2.listIterator();
	 while(A111.hasNext())
	 {
		 System.out.println(A111.next());
	 }
	 System.out.println("hasPrevious Linklist");
	 while(A111.hasPrevious())
	 {
		 System.out.println(A111.previous());
	 }
	 
	/* L2.addFirst("Indu"); 
	 System.out.println(L2);*/

	}

}
