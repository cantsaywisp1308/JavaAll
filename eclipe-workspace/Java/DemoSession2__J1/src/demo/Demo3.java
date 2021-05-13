package demo;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] a = { 5, 10, -3, 9, -6, 20 };
		System.out.println("1. Tinh tong cac phan tu cua mang");
		System.out.println("2. Tinh tong cac phan tu trong khoang tu min den max");
		System.out.println("3. Dem co bao nhieu so am trong mang");
		System.out.println("4. Tim gia tri lon nhat, nho nhat");
		System.out.println("5. Kiem tra x co ton tai trong mang hay khong?");
		System.out.println("6. Sap xep mang theo thu tu giam dan");
		int menu;
		do {
			System.out.print("Chon: ");
			menu = scanner.nextInt();
			if (menu < 1 || menu > 6) {
				System.out.println("Menu khong hop le");
			}
		} while (menu < 1 || menu > 6);
		if (menu == 1) {
			int s = 0;
			for (int i : a) {
				s += i;
			}
			System.out.println("Tong mang la " + s);
		} else if (menu == 2) {
			System.out.print("min: ");
			int min = scanner.nextInt();
			System.out.print("max: ");
			int max = scanner.nextInt();
			int s = 0;
			for (int i : a) {
				if (i >= min && i <= max) {
					s += i;
				}
			}
			System.out.println("Tong la " + s);
		} else if (menu == 3) {
			// XXXXX
		} else if (menu == 4) {
			// XXXXX
		} else if (menu == 5) {
			System.out.print("x: ");
			int x = scanner.nextInt();
			boolean flag = false;
			for (int i : a) {
				if (i == x) {
					flag = true;
					break;
				}
			}
			String result = flag ? "x ton tai" : "x khong ton tai";
			System.out.println(result);
		} else if (menu == 6) {
			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("Mang sau khi sap xep giam dan");
			for (int i : a) {
				System.out.print("   " + i);
			}
		}

	}

}
