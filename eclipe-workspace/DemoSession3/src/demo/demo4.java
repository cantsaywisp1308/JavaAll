package demo;

import java.util.Scanner;

public class demo4 {
	
	public static void kiemTraTonTai(String[] names, String name) {
		boolean result = false; 
		for(String i : names) {
			result = i.equalsIgnoreCase(name);
			if(result) {
				System.out.println("Có! ");
				break;
			}
		}
		if(result == false) {	System.out.println("Nope ! "); }
	}
	
	public static void kiemTraKey(String[] names, String key) {
		key = key.toLowerCase(); 
		boolean result1 = false; 
		for(String i : names) {
			result1 = i.toLowerCase().contains(key);
			if(result1) {
				System.out.println("Có! ");
				break;
			} 	
		}
		if(result1 == false ) {
			System.out.println("Không! "); 
		}
	}

	public static void sapXepTen(String [] a) {
		for (int i = 0; i <a.length -1; i++) {
			for (int j = i+1; j<a.length; j++) {
				if(a[i].compareTo(a[j])  < 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Tên sau khi sắp xếp: ");
		for(String name : a) {
			System.out.print(name + "  ");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		String keyword = "he";
		boolean result = s.startsWith(keyword);
		System.out.println("result: "+result);
		boolean result2 = s.toLowerCase().startsWith(keyword); 
		System.out.println("result 2: " + result2);
		
		String keyword2 = "ld";
		boolean result3 = s.endsWith(keyword2);
		System.out.println("result 3: "+ result2);
		
		String keyword3 = "lo W";
		boolean result4 = s.contains(keyword3);
		System.out.println("result 4: "+ result4);
		
		//Xây dựng menu có các yêu cầu sau:
		// 1. Kiểm tra 1 tên có tồn tại hay không?
		// 2. Tìm kiếm tên có từ khoá 
		
		Scanner scanner = new Scanner(System.in);
		String[] names = {"Kevin", "Peter", "Mary", "Maxie", "Carl"};
		System.out.println("Lựa chon menu 1 hoặc 2: ");
		int menu = scanner.nextInt();
		if(menu ==1) {
			System.out.println("Enter your name : ");
			String name = scanner.next();
			kiemTraTonTai(names, name);
		} else if(menu ==2) {
			System.out.println("Enter the keyword: ");
			String key = scanner.next();
			kiemTraKey(names, key);
		} else if(menu == 3 ) {
			sapXepTen(names); 
		} else {
			System.out.print("Menu không hợp lệ !");
		}
		
	}

}
