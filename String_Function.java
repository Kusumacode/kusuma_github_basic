package Basic_program;
public class String_Function 
{

	public static void main(String[] args) 
	{
		String s1="rama";
		boolean b1=		s1.matches("....");
		System.out.println(b1);
		String s2="kusuma";
		System.out.println(s2.matches("(.*)a"));
		System.out.println(s2.matches("k(.*)"));	
		System.out.println(s2.matches("(.*)z(.*)"));
		System.out.println(s2.matches("(.*)u(.*)"));
		System.out.println(s2.matches(".u(.*)"));
		
//. indicates->single char search,  in SQL-> _
//(.*) indicates ->multi search search, in SQL-> %
		
		
		
			
		
		
		
	}
	
	
}
