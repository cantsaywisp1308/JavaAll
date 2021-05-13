package Entities;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
	private String id;
	private String name;
	private List<Student> students = new ArrayList<Student>();
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
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Faculty(String id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}
	
	public Faculty() {
		super();
	}
	
	public void print() {
		System.out.println("id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Student info: ");
		for(Student student:students ) {
			System.out.println(student.toString());
			System.out.println("============================"); 
		}
	}
}
