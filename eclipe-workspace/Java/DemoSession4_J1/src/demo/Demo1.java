package demo;

import java.util.Scanner;

import entities.Student;

public class Demo1 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.id = "st01";
		student1.name = "Name 1";
		student1.age = 200;
		System.out.println("Student 1 Info");
		System.out.println("id: " + student1.id);
		System.out.println("name: " + student1.name);
		System.out.println("age: " + student1.age);
		
		Student student2 = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.print("id: ");
		student2.id = scanner.nextLine();
		
		
		

	}

}
