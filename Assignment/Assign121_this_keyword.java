package Assignment_101to200;//this keyword 

public class Assign121_this_keyword 
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private long Mobno;
	private double salary;
	private String Address;
	
	void Employee_details(int id, String name, int age, String gender, long Mobno, double salary, String Address)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.Mobno=Mobno;
		this.salary=salary;
		this.Address=Address;
	}
	public static void main(String[] args) 
	{
		Assign121_this_keyword A121=new Assign121_this_keyword();
		A121.Employee_details(1101, "Chandra", 35, "Male", 1234512345, 65456.33, "Bengaluru");
		System.out.println(A121.id);
		System.out.println(A121.name);
		System.out.println(A121.age);
		System.out.println(A121.gender);
		System.out.println(A121.Mobno);
		System.out.println(A121.salary);
		System.out.println(A121.Address);
	}

}
