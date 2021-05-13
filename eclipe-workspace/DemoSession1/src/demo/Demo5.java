package demo;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// Nhập năm và tháng xem coi nó phải là năm nhuận hay không 
		System.out.print("Nhập năm : ");
		int year = scanner.nextInt();
		System.out.print("Nhập tháng: ");
		int month = scanner.nextInt();
		

		

		if ((year%4 == 0 ) && (year%100 != 0) |(year%400 == 0)) {

			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:	
			case 8:
			case 10:
			case 12:
				System.out.print(31);
				break;
			case 2:
				System.out.print(29);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print(30);
				break;
			}
		} else {
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:	
			case 8:
			case 10:
			case 12:
				System.out.print(31);
				break;
			case 2:
				System.out.print(28);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.print(30);
				break;
			}
	}
		
}

}
