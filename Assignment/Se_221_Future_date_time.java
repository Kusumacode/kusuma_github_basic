package Assignment_201to224;

import java.util.Date;

public class Se_221_Future_date_time {
	public static void main(String[] args) {
		// Epoch time
		Date d1 = new Date();
		System.out.println(d1.getTime());

		// Human understandable time
		Date d2 = new Date(d1.getTime() + (1000 * 60 * 60 * 24 * 3));
		System.out.println(d2);

		// convert to string
		String future_time = d2.toString();
		System.out.println(future_time);

		String year = future_time.substring(future_time.length() - 4);
		System.out.println(year);

		String month = future_time.substring(4, 7);
		System.out.println(month);

		String date = future_time.substring(8, 10);
		System.out.println(date);

		date.concat(month).concat(date);

	}

}
