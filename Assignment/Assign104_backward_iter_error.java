package Assignment_101to200;
/*Use backward iteration using list iterator for 
array list without forward iteration and note down the error*/

import java.util.ArrayList;
import java.util.ListIterator;

public class Assign104_backward_iter_error
{

	public static void main(String[] args)
	{
		ArrayList aex=new ArrayList();
		System.out.println("Printing the Arraylist");
		aex.add("Lilli");
		aex.add("Orchid");
		aex.add("Tilip");
		aex.add("Lavender");
		System.out.println(aex);
		
		System.out.println("Using backward iteration without farward iteration");
		ListIterator Lib=aex.listIterator();
		
		while(Lib.hasPrevious())
		{
			System.out.println(Lib.previous());
		}
	}
	
}
		