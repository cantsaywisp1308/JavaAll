package Demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
			Date date1 = simpleDateFormat.parse("15/10/2020");
			Date date2 = simpleDateFormat.parse("25/10/2020");
			int result = date1.compareTo(date2);
			if(result < 0) {
				System.out.println("Date 1 < Date 2");
			} else if (result == 0) {
				System.out.println("Date 1 = Date 2");
			} else {
				System.out.println("Date 1 > Date 2");
			}
		} catch(Exception e) {
			System.err.println(e.getMessage()); 
		}
		System.out.println("Done !");
	}

}
