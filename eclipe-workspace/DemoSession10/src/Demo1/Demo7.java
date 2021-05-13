package Demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy HH:MM:SS");
		System.out.println(simpleDateFormat.format(today)); 
		
		String s ="20/10/2020"; 
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Date birthday = simpleDateFormat2.parse(s);
			SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd/mm/yyyy");
			System.out.println(simpleDateFormat3.format(birthday)); 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
