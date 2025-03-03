package Assignments_1to100;
/*WAP in which super most interface class having 2AM, abstract class having 2AM&2CM, 
subclass having 2CM*/
interface Amazon_Products
{
	 void addtoCart(); //abstract method
	 void buyNow();//abstract method
}
abstract class Amazon_select //abstract class
{
	abstract void addtoCart(); //Abstract method1
	void Product1()
	{
		System.out.println("Added Product1");
	}
	abstract void buyNow(); //Abstract method2
	void Product2()
	{
		System.out.println("Added Product2");
	}
		
}
public class Assign47_Abs_ConcreteMethods extends Amazon_select implements Amazon_Products
{
	public void addtoCart() 
	{
		System.out.println("Added to cart");
	}

	public void buyNow() 
	{
		System.out.println("Buy now");
	}
	
	public static void main(String[] args) 
	{
		Assign47_Abs_ConcreteMethods A47=new Assign47_Abs_ConcreteMethods();
		
		//A47.Product1();
		//A47.Product2();
		A47.addtoCart();
		A47.buyNow();
		
	}

}
