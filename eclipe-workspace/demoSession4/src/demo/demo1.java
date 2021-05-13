package demo;

import java.util.Scanner;

import Entity.Student;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.id = "st01";
		student1.name ="Name 1";
		student1.age = 20; 
		System.out.println("Student 1 Info: ");
		System.out.println("id: "+ student1.id);
		System.out.println("name: "+ student1.name);
		System.out.println("age: "+ student1.age);
		
		Scanner scanner = new Scanner(System.in); 
		Student student2 = new Student();
		System.out.println("Nhập id student 2: "); 
		student2.id = scanner.nextLine(); 
		System.out.println("Nhập name student 2: "); 
		student2.name = scanner.nextLine();
		System.out.println("Nhập age student 2: "); 
		student2.age = scanner.nextInt();
		System.out.println("Student 2 Info: ");
		System.out.println("id: "+ student2.id);
		System.out.println("name: "+ student2.name);
		System.out.println("age: "+ student2.age);
		
	}

}
