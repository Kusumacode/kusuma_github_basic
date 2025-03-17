package Assignment_101to200;//WAP on Vector methods

import java.util.Vector;

public class Assign114_Vector_methods 
{

	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.add("Banu");
		v1.add("Renu");
		v1.add("Veni");
		System.out.println(v1);
		
		//addElement()
		v1.addElement("Indu");
		v1.addElement("Janu");
		System.out.println(v1);
		
		//capacity();
		System.out.println(v1);				
		System.out.println("Elements capacity: " +v1.capacity());	
		
		//firstElement
		System.out.println(v1.firstElement());
		
		//lastElement
		System.out.println(v1.lastElement());
		
		//removeElement();
		System.out.println("Elements Present:  " +v1);
		System.out.println(v1.removeElement("Veni"));
		System.out.println("Elements removal:  " +v1);
		
		//removeElementAt();
		System.out.println("Elements Present:  " +v1);
		v1.removeElementAt(1);		
		System.out.println("Elements After removal: " +v1);
		
		//removeAllElements()
		System.out.println("Elements Present:  " +v1);
		v1.removeAllElements();		
		System.out.println("Elements After removal: " +v1);
	}

}
