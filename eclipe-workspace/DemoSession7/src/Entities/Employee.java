package Entities;

public class Employee extends Human{
	
	private String id;
	private double salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String gender, String id, double salary) {
		super(name, gender);
		this.id = id;
		this.salary = salary;
	}
	
	public Employee() {
		super(); 
	}
	
	public void print() {
		super.print();
		System.out.println("id: "+this.id);
		System.out.println("score: "+this.salary);
	}
}
