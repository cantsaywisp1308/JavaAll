package entities;

import java.util.Scanner;

public class Student {
	private String id;
	private String name;
	private double score;
	
	public Student() {
		System.out.println("Constructor : 0 parameter");
	}
	
	public Student(String id) {
		System.out.println("Constructor 1 : parameter id");
	}
	
	public Student(double score) {
		System.out.println("Constructor 1 : parameter score");
	}
	
	public Student(String id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}


public void input() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("ID: ");
	this.id = scanner.nextLine();
	System.out.println("Name: ");
	this.name = scanner.nextLine();
	System.out.println("Score: ");
	this.score = scanner.nextDouble();
}

public void print() {
	System.out.println("ID: " + this.id);
	System.out.println("Name: " + this.name);
	System.out.println("Score: " + this.score);
}

public void rank() {
	if(this.score <5) {
		System.out.print("Failed! ");
	} else if ((this.score >=5) && (this.score <6.5)) {
		System.out.println("Average! ");
	} else if ((this.score >=6.5) && (this.score <8)) {
		System.out.println("Well-done! ");
	} else if ((this.score >=8) && (this.score <9)) {
		System.out.println("Good!");
	} else {
		System.out.println("Excellent! ");
	}
}
public String rank1() {
	if(this.score <5) {
		return "F";
	} else if ((this.score >=5) && (this.score <6.5)) {
		return "C";
	} else if ((this.score >=6.5) && (this.score <8)) {
		return "B";
	} else if ((this.score >=8) && (this.score <9)) {
		return "A";
	} else {
		return "A++";
	}
}		
}
