package Assignment_101to200;

import java.util.ArrayList;

//WAP using Collection methods
public class Assign101_Collection_Methods
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		//add method- add element in the form of object
		a1.add("kusuma");
		a1.add("savitha");
		a1.add("anitha");
		a1.add("shwetha");
		a1.add("ramya");
		a1.add(32);
		a1.add(false);
		a1.add('c');
		a1.add(2324553);
		a1.add(null);
		a1.add("kusuma");
		System.out.println(a1);
		
		/* ArrayList follow indexing
		 *ArrayList store null
		 *ArrayList accept duplicate value
		 * */
		
		//addAll- stores the data in the form of collection
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Ram");
		System.out.println(a2);
		
		//contains- return type is boolean (particular object)
		System.out.println(a2.contains("Ram"));
		
		//containsAll-return type is boolean (entire collection)
		System.out.println(a2.containsAll(a1));
		
		//isEmpty-return type is boolean
		System.out.println(a2.isEmpty());
		
		ArrayList a3=new ArrayList();
		System.out.println(a3.isEmpty());
		
		//remove
		ArrayList a4=new ArrayList();
		a4.add("kusuma");
		a4.add("savitha");
		a4.add("anitha");
		a4.add("shwetha");
		a4.add("ramya");
		System.out.println("Before Remove"+a4);
		a4.remove("kusuma");
		System.out.println("After Remove"+a4);
		
		ArrayList a5=new ArrayList();
		a5.addAll(a4);
		a5.add("surya");
		a5.removeAll(a4);
		System.out.println(a5);
		
		//size
		System.out.println(a5.size());
		
		//clear - clear the arraylist
		ArrayList a6=new ArrayList();
		a6.add("1");
		a6.add("23");
		a6.add("44");
		a6.add("33");
		a6.add("21");
		System.out.println("Before Clearing" +a6);
		a6.clear();
		System.out.println("After Clearing" +a6);
	}

}


