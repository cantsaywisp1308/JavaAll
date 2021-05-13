package demo;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Đổi độ C sang độ F
		System.out.print("Nhập độ C: ");
		double doC = scanner.nextDouble();
		double doF = (doC * 1.8) + 32;
		System.out.println("Độ F: " + doF);
		
		// Nhập toán lý hoá, tính trung bình, toán*3 lý*2 hoá*1
		System.out.print("Nhập điềm toán: ");
		double toan = scanner.nextDouble();
		
		System.out.print("Nhập điểm lý: ");
		double ly = scanner.nextDouble();
		
		System.out.print("Nhập điểm hoá: ");
		double hoa = scanner.nextDouble();
		
		double diemTB = (toan*3+ly*2+hoa)/6;
		System.out.println("Điểm trung bình: " + diemTB);
		
		//Nhập a1,b1, a2 b2 giải pt bậc 1
		System.out.print("Nhập a1 : ");
		double a1 = scanner.nextDouble();
		
		System.out.print("Nhập b1: ");
		double b1 = scanner.nextDouble();
		
		System.out.print("Nhập c1: ");
		double c1 = scanner.nextDouble();
		
		
		System.out.print("Nhập a2: ");
		double a2 = scanner.nextDouble();
		
		System.out.print("Nhập b2: ");
		double b2 = scanner.nextDouble();
		
		System.out.print("Nhập c2: ");
		double c2 = scanner.nextDouble();
		
		double dd = (a1*b2 - a2*b1);
		double dx = (b2*c1 - b1*c2);
		double dy = (a1*c2 - a2*c1);
		double x = dx/dd;
		double y = dy/dd;
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		
	}

}
