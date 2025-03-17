package Assignment_101to200;
/*WAP in Methods of Linkedlist addFirst, addLast, getFirst, getLast, 
removeFirst, removeLast, pollFirst and pollLast*/

import java.util.LinkedList;

public class Assign112_linkedlist_methods 
{
	public static void main(String[] args) 
	{
		LinkedList L2=new LinkedList();
		 L2.add("Archana");
		 L2.add("Bhavana");
		 L2.add("Chinni");
		 L2.add("Dolly");
		 L2.add("Esha");
		 
		 //addFirst
		 L2.addFirst("Indu");
		 System.out.println("addFirst : " +L2);
		 //addLast
		 L2.addLast("Bindu");
		 System.out.println("addLast : " +L2);
		 //removeFirst
		 L2.removeFirst();
		 System.out.println("removeFirst : " +L2);
		 //removeLast
		 L2.removeLast();
		 System.out.println("removeLast : " +L2);
		 //getFirst
		 System.out.println(L2.getFirst());
		 //getLast
		  System.out.println(L2.getLast());
		 //pollFirst
		 L2.pollFirst();
		 System.out.println("pollFirst : " +L2);
		 //pollLast
		 L2.pollLast();
		 System.out.println("pollLast : " +L2);
		 
		 
	}		 

}
