package Demo;
import java.util.ArrayList;
import java.util.List;

import Entities.Faculty;
import Entities.Student;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Faculty> faculties = new ArrayList<Faculty>();
		Faculty it = new Faculty();
		it.setId("it");
		it.setName("CNTT");
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("id01","name 01",9)); 
		students.add(new Student("id02","name 02",5.9)); 
		students.add(new Student("id03","name 03",6.4)); 
		students.add(new Student("id04","name 04",8.1));
		it.setStudents(students);
		faculties.add(it);
		
		Faculty hh = new Faculty();
		hh.setId("hh");
		hh.setName("Chemistry");
		hh.getStudents().add(new Student("id05","name 05",8.9)); 
		hh.getStudents().add(new Student("id06","name 06",5.7)); 
		hh.getStudents().add(new Student("id07","name 07",9.1)); 
		faculties.add(hh);
		
		for(Faculty faculty:faculties) {
			faculty.print();
		}
	}

}
