package Demo;

import java.util.List;

import Entities.Student;
import Model.StudentModel;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentModel studentModel = new StudentModel();
		List<Student> students = studentModel.importCSV("src/data/Students2.csv");
		if(students == null) {
			System.out.println("Import Fail"); 
		} else {
			System.out.println("Number of students: "+students.size());
			for (Student student:students) {
				System.out.println(student.toString());
			}
		}
	}

}
