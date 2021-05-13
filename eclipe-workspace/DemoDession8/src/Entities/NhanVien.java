package Entities;

public abstract class NhanVien {
	private String id;
	private String name;
	private String address;
	private double index;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getIndex() {
		return index;
	}
	public void setIndex(double index) {
		this.index = index;
	}
	public NhanVien(String id, String name, String address, double index) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.index = index;
	}
	
	public NhanVien() {
		super(); 
	}
	
	public abstract void input();
	public abstract void output();
	public abstract double salary();
	public abstract double benefits();
	
	
}
