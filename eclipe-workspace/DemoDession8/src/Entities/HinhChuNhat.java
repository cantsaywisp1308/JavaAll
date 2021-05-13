package Entities;

public class HinhChuNhat extends Hinhhoc{
	private double a;
	private double b;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public HinhChuNhat(String name, double a, double b) {
		super(name);
		this.a = a;
		this.b = b;
	}
	
	public HinhChuNhat() {
		super(); 
	}
	@Override
	public double ChuVi() {
		// TODO Auto-generated method stub
		double cv = (this.a + this.b)*2; 
		return cv;
	}
	@Override
	public double DienTich() {
		// TODO Auto-generated method stub
		double dt = this.a * this.b; 
		return dt;
	}
}
