package Entities;

public abstract class Hinhhoc {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	public Hinhhoc() {
		super(); 
	}

	public Hinhhoc(String name) {
		super();
		this.name = name;
	}
	
	public abstract double ChuVi ();
	public abstract double DienTich(); 

}
