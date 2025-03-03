package Assignment_101to200;
//WAP on Encapsulation for getter & setter
class Emp_Info
{
	private int age=21; 

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
}

public class Assign122_encapsulation 
{
	public static void main(String[] args) 
	{
		Emp_Info EI=new Emp_Info();
		EI.setAge(55);
		System.out.println("Given age=  " + EI.getAge());
	}

}
