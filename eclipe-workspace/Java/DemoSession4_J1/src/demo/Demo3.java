package demo;

import java.util.Scanner;

import entities.Employee;

public class Demo3 {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setId("e01");
		employee1.setName("Name 1");
		employee1.setSalary(100);
		System.out.println("Employee 1 Info");
		System.out.println("id: " + employee1.getId());

		Scanner scanner = new Scanner(System.in);
		Employee employee2 = new Employee();
		System.out.print("id: ");
		employee2.setId(scanner.nextLine());
		System.out.print("name: ");
		employee2.setName(scanner.nextLine());
		System.out.print("salary: ");
		employee2.setSalary(scanner.nextDouble());
		

	}

}
