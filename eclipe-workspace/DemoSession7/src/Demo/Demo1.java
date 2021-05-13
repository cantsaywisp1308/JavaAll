package Demo;

import Entities.Employee;
import Entities.Student;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.setName("Name 1");
		student1.setGender("Male");
		student1.setId("id01");
		student1.setScore(7.8);
		System.out.println("Student Info: ");
		System.out.println("Student 1 name: " + student1.getName());
		System.out.println("Student 1 gender: "+ student1.getGender());
		System.out.println("Student 1 id: "+ student1.getId());
		System.out.println("Student 1 score: "+ student1.getScore());
		
		Employee employee1 = new Employee();
		employee1.setName("Name 2");
		employee1.setGender("Female");
		employee1.setId("id02");
		employee1.setSalary(1500);
		System.out.println("Employee Info: ");
		System.out.println("Employee 1 name: " + employee1.getName());
		System.out.println("Employee 1 gender: "+ employee1.getGender());
		System.out.println("Employee 1 id: "+ employee1.getId());
		System.out.println("Employee 1 salary: "+ employee1.getSalary());
		
	}

}
