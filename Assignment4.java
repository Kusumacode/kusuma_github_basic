package Basic_program; //  Addition,sub,multiplication and division

public class Assignment4 
{
	static void add()
	{
		System.out.println("Arthematic operators");
		int n1=100;
		int n2=2;
		int sum=n1+n2;
		System.out.println(sum);
	}
	static void sub()
	{
		int n1=100;
		int n2=2;
		int sub=n1-n2;
		System.out.println(sub);
	}
	static void mul()
	{
		int n1=100;
		int n2=2;
		int mul=n1*n2;
		System.out.println(mul);
	}
	static void div()
	{
		int n1=100;
		int n2=2;
		int div=n1/n2;
		System.out.println(div);
	}
	static void mod()
	{
		int n1=100;
		int n2=2;
		int mod=n1%n2;
		System.out.println(mod);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}
}
