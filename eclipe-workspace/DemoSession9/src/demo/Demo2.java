package demo;

import entities.Course;
import entities.Faculty;
import entities.Student;

public class Demo2 {

	public static void main(String[] args) {

		Course[] courses = { new Course("c1", "Course 1", 20), new Course("c2", "Course 2", 21),
				new Course("c3", "Course 2", 22) };
		Student student = new Student();
		student.setCourses(courses);
		student.setFaculty(new Faculty("it", "CNTT"));
		student.setId("st01");
		student.setName("Name 1");
		student.setScore(6.7);
		System.out.println("Student Info");
		

	}

}
