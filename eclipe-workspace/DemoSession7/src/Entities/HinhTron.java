package Entities;

import java.util.Scanner;

public class HinhTron extends Hinhhoc {
	private double r;

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public HinhTron(String hinh, double doRongDuongBien, double r) {
		super(hinh, doRongDuongBien);
		this.r =r;
	}
	
	public HinhTron() {
		super();
	}
	
	public double ChuVi(double r, double doRongDuongBien) {
		double cv = (r + doRongDuongBien) *2 *3.14;
		return cv; 
	}
	
	public double DienTich(double r, double doRongDuongBien) {
		double dt = (r+doRongDuongBien) * (r+doRongDuongBien) *3.14; 
		return dt; 
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập bán kinh: ");
		this.r = scanner.nextDouble();
	}
	
}
