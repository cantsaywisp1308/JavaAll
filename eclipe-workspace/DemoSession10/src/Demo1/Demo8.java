package Demo1;

import java.util.Calendar;
import java.util.Date;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today =  new Date();
		Calendar calendar = Calendar.getInstance(); 
		calendar.setTime(today);
		int year = calendar.get(Calendar.YEAR);
		System.out.println("Year: "+year); 
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println("Month: "+month);
		int day = calendar.get(Calendar.DAY_OF_MONTH); 
		System.out.println("Date: "+day);
	}

}
