package Entities;

import java.util.Scanner;

public class Hinhhoc {
	private String hinh;
	private double doRongDuongBien;
	
	public String getHinh() {
		return hinh;
	}
	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
	public double getDoRongDuongBien() {
		return doRongDuongBien;
	}
	public void setDoRongDuongBien(double doRongDuongBien) {
		this.doRongDuongBien = doRongDuongBien;
	}
	
	public Hinhhoc(String hinh, double doRongDuongBien) {
		super();
	}
	
	public Hinhhoc() {
		
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập hình(square/circle): ");
		String hinh = scanner.nextLine();
		this.setHinh(hinh);
		System.out.println("Nhập độ rộng đường biên: ");
		double db = scanner.nextDouble();
		this.setDoRongDuongBien(db);
		if (this.getDoRongDuongBien() <0) {
			System.out.println("Invalid Data!");
			input();  
		}
		 
	}
	
	public void print() {
		System.out.println("Chu vi: "+ this.hinh);
		System.out.println("Diện tích: "+this.doRongDuongBien);
	}
	
	public void output(double chuvi, double dientich) {
		System.out.println("Chu vi: "+chuvi);
		System.out.println("Diện tích: "+dientich); 
	} 
}
