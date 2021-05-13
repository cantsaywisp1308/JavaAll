package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String id;
	private String name;
	private double score;
	private Date birthday;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Student(String id, String name, double score, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.birthday = birthday;
	}
	
	public Student() {
		super();
	}
	@Override
	public String toString() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", birthday=" + simpleDateFormat.format(birthday) + "]";
	}
	
	
	
}
