package demo;

import java.util.Scanner;

import Entity.Employee;


public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(); 
		employee1.setId("e01");
		employee1.setName("Name 1");
		employee1.setSalary(100);
		System.out.println("Employee1 Info : ");
		System.out.println("ID: " + employee1.getId());
		System.out.println("Name: " + employee1.getName());
		System.out.println("Salary: " + employee1.getSalary());
		
		Scanner scanner = new Scanner(System.in);
		Employee employee2 = new Employee(); 
		System.out.println("Nhập ID employee2: ");
		employee2.setId(scanner.nextLine());
		System.out.println("Nhập name employee2: ");
		employee2.setName(scanner.nextLine());
		System.out.println("Nhập salary employee2: ");
		employee2.setSalary(scanner.nextDouble());
	}

}
