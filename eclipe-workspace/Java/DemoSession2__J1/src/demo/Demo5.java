package demo;

import java.util.Scanner;

public class Demo5 {

	public static void question1(int[] a) {

	}

	public static void question2(int[] a) {
		System.out.println("Min: " + min(a));

	}

	public static void question3(int[] a) {
		for (int i : a) {
			if (ktnt(i)) {
				System.out.print(i + "   ");
			}
		}
	}

	public static boolean ktnt(int n) {
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				counter++;
			}
		}
		return counter == 2;
	}

	public static int min(int[] a) {
		int m = a[0];
		for (int i : a) {
			if (i < m) {
				m = i;
			}
		}
		return m;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] a = { 5, 10, -3, 9, -6, 20 };
		System.out.println("1. Tinh tong mang");
		System.out.println("2. Tim min, max");
		System.out.println("3. Liet ke cac so nguyen to trong mang");
		System.out.print("Chon: ");
		int menu = scanner.nextInt();
		if (menu == 1) {
			question1(a);
		} else if (menu == 2) {
			question2(a);
		} else if (menu == 3) {
			question3(a);
		}

	}

}
