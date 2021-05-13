package demo;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "ABC";
		//So sánh phân biệt hoa thường 
		boolean result = s1.equals(s2);
		System.out.println("result 1: " + result);
		// so sánh không phân biệt hoa thường 
		boolean result2 = s1.equalsIgnoreCase(s2);
		System.out.println("result 2: " + result2); 
		// Viết chtrinh nhập login và password kiểm tra login có phải là 
		//acc1 và pass có phải là abc 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Username: "); 
		String login = scanner.next();
		System.out.println("Password: ");  
		String password = scanner.next();
		boolean kqlogin  = login.equals("acc1");
		boolean kqpassword   = password.equals("abc");
		if (kqlogin && kqpassword ) {
			System.out.print("Welcome");
		} else {
			System.out.println("Get out of here"); 
		}
	}

}
