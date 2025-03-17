package Assignments_1to100;//Create class and inherit property of interface

interface Farming_Game
{
	void farming_game1_Logic();
}
public class Assign48_class_interface implements Farming_Game
{
	public void farming_game1_Logic() 
	{
			System.out.println("class - Farmcity game logic");
	}
	
	public static void main(String[] args) 
	{
		Assign48_class_interface A48=new Assign48_class_interface();
		A48.farming_game1_Logic();
	}
	
	
}