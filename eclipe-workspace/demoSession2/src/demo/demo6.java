package demo;

import java.util.Scanner;

public class demo6 {
	
	public static void giaipt(double a, double b, double c) {
		double delta;
		delta = b*b - 4*a*c;
		if(delta > 0) {
			System.out.println("Phương trình có 2 nghiệm: ");
			double x1, x2 ; 
			x1 = (-b + Math.sqrt(delta)) / (2*a);
			x2 = (-b - Math.sqrt(delta)) / (2*a);
			System.out.println("Nghiệm 1: " + x1);
			System.out.println("Nghiệm 2: " + x2);

		} else if(delta == 0) {
			System.out.println("Phương trình có 1 nghiệm kép: ");
			double x;
			x = (-b + Math.sqrt(delta)) / (2*a);
			System.out.println("nghiệm kép: " + x);
		} else {
			System.out.println("Phương trình vô nghiệm ");
		}
	}
	
	public static boolean ktsnt(int a) {
		int count = 0;
		for(int i=1; i<= a;i++) {
			if (a % i == 0) {
				count++; 
			}
		}
		if(count==2 ) {return true; 
		} else {return false;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.println("Nhập b: ");
		double b = scanner.nextDouble();
		System.out.println("Nhập c: ");
		double c = scanner.nextDouble();
		giaipt(a,b,c);
		
		System.out.println("Nhập m: ");
		int m = scanner.nextInt();
		System.out.println("Nhập m: ");
		int n = scanner.nextInt();
		int tong = 0;
		for (int i=m;i<=n;i++) {
			tong += i;

		}
		System.out.println("Tổng là: " + tong);
		if (ktsnt(tong)==true) {
			System.out.println("Tổng là số nguyên tố");
		} else {
			System.out.println("không phải số nguyên tố"); 
		}
	}

}
