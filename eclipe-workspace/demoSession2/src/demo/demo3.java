package demo;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a = { 3, 5, -1, 0, 10, -4 };
		
		System.out.println("1. Tính tổng các phần tử của mảng: ");
		System.out.println("2. Tính tổng các phần tử từ min đến max : ");
		System.out.println("3. Có bao nhiêu phần tử trong mảng: ");
		System.out.println("4. Tìm min max của mảng: ");
		System.out.println("5. Kiểm tra x có trong mảng hay không: ");
		System.out.println("6. Sắp xếm mảng theo thứ tự tăng dần: ");
		int menu; 
		do {
			System.out.print("Nhập vào menu số:  ");
			menu = scanner.nextInt();
			if ((menu < 1) || (menu > 6)) {
				System.out.println("Menu không hợp lệ! ");
			}
		} while ((menu > 0) && (menu < 7 )); 
		
		if(menu == 1) {
			int tong;
			tong = 0;
			for (int i=0; i < a.length; i++) {
				tong += a[i];
			}
			System.out.print("Tổng là: " + tong);
			
		} else if (menu ==2) {
			System.out.println("Nhập min: ");
			int min = scanner.nextInt();
			System.out.println("Nhập max: ");
			int max = scanner.nextInt();
			int tong;
			tong = 0;
			if(min < max) {
				for(int i=min;i<max;i++) {
					tong += i;
				}
			} else {
				for(int i = max; i < min; i++) {
					tong += i; 
				}
			}
			System.out.print("Tồng là: " + tong);
		} 
		
		else if (menu == 3) {
			System.out.print("Số phần tử trong mảng là: " + a.length);
		} 
		
		else if(menu == 4) {
			System.out.print("Câu này để từ từ nha ^^ ");
		} 
		
		else if (menu == 5 ) {
			System.out.println("Nhập số x: ");
			int x = scanner.nextInt();
			for (int i =0; i< a.length;i++) {
				if (x == a[i]) {
					System.out.print("Có phần tử trùng trong mảng");
					break; 
				} else {
					System.out.print("Không có thằng nào trùng");
				}
			}
		} 
		
		else {
			int temp;
			for(int i = 0; i<a.length;i++) {
				for(int j = i+1;j<a.length;j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp; 
					}
				}
			}
			System.out.println("Mảng sau khi sắp xếp: ");
			for (int i = 0; i<a.length; i++) {
				System.out.print(" "+ a[i]);
			}
		}
			
	}
}
