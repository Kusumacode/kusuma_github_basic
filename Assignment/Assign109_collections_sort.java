package Assignment_101to200;//WAP using sort

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Assign109_collections_sort {

	public static void main(String[] args) 
	{
		ArrayList So=new ArrayList();
		So.add(11);
		So.add(123);
		So.add(564);
		So.add(633);
		So.add(23);
		Collections.sort(So);
		System.out.println(So);
		
		List Ve=new Vector();
		Ve.add(1);
		Ve.add(4);
		Ve.add(2);
		Ve.add(3);
		Ve.add(5);
		//Collections.sort(Ve);
		System.out.println(Ve);
		
		LinkedList LL=new LinkedList();
		LL.add(1);
		LL.add(4);
		LL.add(2);
		LL.add(3);
		LL.add(5);
		Collections.sort(LL);
		System.out.println(LL);
		
		//Stack St=new Stack();
		Deque In=new LinkedList();
		In.add(11);
		In.add(123);
		In.add(564);
		In.add(633);
		In.add(23);
		System.out.println(In);
		
		
		
		
		
	}

}
