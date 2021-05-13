package Demo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nhap ngay sinh dinh dang dd/mm/yyyy.Thuc hien cac yeu cau:
		//Kiem tra ngay sinh co du 18 tuoi hay ko?
		// Kiem tra coi hnay co phai sinh nhat ko?
		
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your birthday(dd//mm/yyyy):  ");
			String s = scanner.next();
			Date birthday = simpleDateFormat.parse(s);
			Date today = new Date();
			Calendar calendarBirthday = Calendar.getInstance();
			calendarBirthday.setTime(birthday);
			Calendar calendarToday = Calendar.getInstance();
			calendarToday.setTime(today);
			
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
			
		
		
		
		
	}

}
