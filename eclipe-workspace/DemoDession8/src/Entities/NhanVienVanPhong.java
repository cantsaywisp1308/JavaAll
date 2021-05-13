package Entities;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien{
	private int DaysofWork;
	private double YearsofWork;
	
	
	public int getDaysofWork() {
		return DaysofWork;
	}
	public void setDaysofWork(int daysofWork) {
		DaysofWork = daysofWork;
	}
	public double getYearsofWork() {
		return YearsofWork;
	}
	public void setYearsofWork(double yearsofWork) {
		YearsofWork = yearsofWork;
	}
	
	
	public NhanVienVanPhong(String id, String name, String address, double index) {
		super(id, name, address, index);
	}
	
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Office employee " +this.getName()+ " :");
		System.out.println("Days of work: ");
		int days = scanner.nextInt();
		this.setDaysofWork(days);
		System.out.println("Years of Work: ");
		double year = scanner.nextDouble();
		this.setYearsofWork(year); 
		
	}
	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("Days of work: " + this.DaysofWork);
		System.out.println("Years of Work: "+ this.YearsofWork);
		System.out.println("Salary: " + this.salary());
		System.out.println("Benefits: " + this.benefits());
		System.out.println("============================="); 
		
	}
	@Override
	public double salary() {
		// TODO Auto-generated method stub
		double salary = this.DaysofWork * this.getIndex();
		return salary;
	}
	@Override
	public double benefits() {
		// TODO Auto-generated method stub
		double benefits = this.YearsofWork * 0.5 * 400; 
		return benefits;
	}
	
	
}
