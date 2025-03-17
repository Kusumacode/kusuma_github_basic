package Assignment_201to224;

import java.util.Date;

public class Se_221_Current_date_time 
{
 	public static void main(String[] args) 
	{
		// Epoch time
		Date d1 = new Date();
		System.out.println(d1.getTime());

		// Human understandable time
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);

		// convert to string
		String current_time = d2.toString();
		System.out.println(current_time);
	}

}
