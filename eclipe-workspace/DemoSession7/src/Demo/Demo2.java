package Demo;

import Entities.Employee;
import Entities.Student;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student2 = new Student("Name 3","Male", "id03", 8.3);
		student2.print();
		
		Employee employee2 = new Employee("Name 4", "Female", "id04", 1250);
		employee2.print();
	}
}
