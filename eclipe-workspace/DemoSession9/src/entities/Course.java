package entities;

public class Course {

	private String id;
	private String name;
	private int hours;

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

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Course(String id, String name, int hours) {
		super();
		this.id = id;
		this.name = name;
		this.hours = hours;
	}

	public Course() {
		super();
	}
	
	public void print() {
		System.out.println("course id: " + this.id);
		System.out.println("course name: " + this.name);
		System.out.println("hours: " + this.hours);
	}

}
