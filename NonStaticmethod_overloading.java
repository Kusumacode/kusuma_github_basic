package Basic_program;

public class NonStaticmethod_overloading // 
{
	void add(double a)
	{
		double sum=6+a;
		System.out.println(sum);
	}
	void add(int a)
	{
		double sum=6+a;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		NonStaticmethod_overloading NS=new NonStaticmethod_overloading();
		NS.add(1.2);
		NS.add(5);
	}

}
