package Entities;

import java.util.Scanner;

public class HinhVuong extends Hinhhoc {
	private double a;
	
	
	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}
	
	public HinhVuong() {
		super(); 
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh: ");
		this.a = scanner.nextDouble();
	}
	
	
	public HinhVuong(String hinh, double doRongDuongBien, double a) {
		super(hinh, doRongDuongBien);
		this.a =a; 
	}
	public double ChuVi(double doRongDuongBien, double a) {
		double cv =(a + doRongDuongBien)*4;
		return cv; 
	}
	
	public double DienTich(double doRongDuongBien, double a) {
		double dt = (a + doRongDuongBien) * (a + doRongDuongBien);
		return dt; 
	}
	
}
