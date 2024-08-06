package class_assignments; //WAP on updating global static and non static variable

public class GlobalVarUpdating 
{
	static int sub1=90;
	static int sub2=92;
	static int sub3=88;
	int sub4=82;
	int sub5=66;
	int sub6=77;
	
	static void sub1()
	{
		System.out.println("Sub1 Marks="+sub1);
		sub1=95;
		System.out.println("After Updating="+sub1);
	}
	static void sub2()
	{
		System.out.println("Sub2 Marks="+sub2);
		sub2=96;
		System.out.println("After Updating="+sub2);
	}
	static void sub3()
	{
		System.out.println("Sub3 Marks="+sub3);
		sub3=90;
		System.out.println("After Updating="+sub3);
	}
	
	void sub4()
	{
		System.out.println("Sub4 Marks="+sub4);
		sub4=85;
		System.out.println("After Updating="+sub4);
	}
	void sub5()
	{	
		System.out.println("Sub4 Marks="+sub5);
		sub5=71;
		System.out.println("After Updating="+sub5);
	}
	void sub6()
	{	
		System.out.println("Sub4 Marks="+sub6);
		sub6=82;
		System.out.println("After Updating="+sub6);
	}
	public static void main(String[] args) 
	{
		sub1();
		sub2();
		sub3();
		GlobalVarUpdating gv=new GlobalVarUpdating();
		gv.sub4();
		gv.sub5();
		gv.sub6();
	}

}
