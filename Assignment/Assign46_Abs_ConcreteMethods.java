package Assignments_1to100;
/*WAP in which super most class having 2CM, abstract class having 2AM&2CM, 
subclass having 2CM*/

class SupermostClass
{
	static void concrete_method1()
	{
		System.out.println("Super most class CM1");
	}
	void concrete_method2()
	{
		System.out.println("Super most class CM2");
	}
}
abstract class Abs_class1 extends SupermostClass
{
	abstract void AM1();
	abstract void AM2();

	void CM1()
	{	
	System.out.println("It is Concrete method 1");
    }
	void CM2()
	{
		System.out.println("It is Concrete method 2");
	}
}
abstract class Abs_class2 extends Abs_class1
{
	void CM1()
	{	
	System.out.println("It is in AC2 - Concrete method 1");
    }
	void CM2()
	{
		System.out.println("It is in AC2 - Concrete method 2");
	}
}
public class Assign46_Abs_ConcreteMethods extends Abs_class2
{
	void AM1() 
	{
		System.out.println("It is Abstract method 1");
	}

	void AM2() 
	{
		System.out.println("It is Abstract method 2");
	}
	public static void main(String[] args)
	{
		Assign46_Abs_ConcreteMethods A46=new Assign46_Abs_ConcreteMethods();
		A46.AM1();
		A46.AM2();
	}
}


