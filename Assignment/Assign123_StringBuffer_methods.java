package Assignment_101to200; //StringBuffer methods
 
public class Assign123_StringBuffer_methods 
{
	public static void main(String[] args) 
	{
		//append,
		StringBuffer sb=new StringBuffer("String Buffer methods -");
		sb.append(" now iam using appending method");
		//insert,
		sb.insert(23,"Append");
		//replace,
		sb.replace(34, 37, "here");
		//delete,
		sb.delete(51, 54);
		
		System.out.println("2nd char of string:" +sb.charAt(2));
		//capacity,
		System.out.println("Capacity of the string:" +sb.capacity());
		//length,
		System.out.println("Length of the string:" +sb.length());
		System.out.println(sb);
		
		//substring(oneparameter),
		System.out.println("Substring: " +sb.substring(6)); 
		//substring (oneparameter, two parameter)
		System.out.println("Substring 2 Para:" +sb.substring(0,6));
		
		StringBuffer sb1=new StringBuffer("String Buffer");
		//charAt,
		System.out.println("String Buffer charat method: "  + sb1.charAt(7));
		//reverse,
		System.out.println("String Buffer reverse: "  + sb1.reverse());
		}
}
