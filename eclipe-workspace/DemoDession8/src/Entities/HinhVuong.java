package Entities;

public class HinhVuong extends Hinhhoc  {
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

	public HinhVuong(String name, double a) {
		super(name);
		this.a = a;
	}

	@Override
	public double ChuVi() {
		// TODO Auto-generated method stub
		double cv = this.a *4; 
		return cv;
	}

	@Override
	public double DienTich() {
		// TODO Auto-generated method stub
		double dt  = Math.pow(this.a, 2);
		return dt;
	}
	
	
}
