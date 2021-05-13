package Entities;

public class Student extends Human {
	private String id; 
	private double score;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	

	
	public Student() {
		
	}
	
	public Student(String name, String gender, String id, double score) {
		super(name, gender);
		this.id = id;
		this.score = score; 
	}
	
	public void print() {
		super.print();
		System.out.println("id: "+this.id);
		System.out.println("score: "+this.score);
	}
	
}
