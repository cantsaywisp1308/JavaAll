package Demo;
import java.util.ArrayList;
import java.util.List;

import Entities.Student;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("id01","name 01",9)); 
		students.add(new Student("id02","name 02",5.9)); 
		students.add(new Student("id03","name 03",6.4)); 
		students.add(new Student("id04","name 04",8.1)); 
		for(Student student:students) {
			System.out.println(student.toString());
			System.out.println("====================");
		}
	}

}
