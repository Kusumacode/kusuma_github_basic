package Basic_program; // a) Access specifier from methods within the class 

public class Access_specifier_method_case1 
{
  public void add()
  {
	  System.out.println("We can access public");
	  int add1=12;
	  int add2=14; 
	  int sum=add1+add2;
	  System.out.println(sum);
  }
  protected void sub()
  {
	  System.out.println("We can access protected");
	  int sub1=12;
	  int sub2=14; 
	  int subtraction=sub1-sub2;
	  System.out.println(subtraction);
  }
  private void multi()
  {
	  System.out.println("We can access private");
	  int multi1=12;
	  int multi2=14; 
	  int multiplication=multi1*multi2;
	  System.out.println(multiplication);
  }
  void div()
  {
	  System.out.println("We can access package/default");
	  int div1=12;
	  int div2=14; 
	  int division=div1*div2;
	  System.out.println(division);
  }
	public static void main(String[] args) 
	{
		System.out.println(" a) Access specifier from methods within the class");
		Access_specifier_method_case1 Asmc=new Access_specifier_method_case1();
		Asmc.add();
		Asmc.sub();
		Asmc.multi();
		Asmc.div();
	}

}
