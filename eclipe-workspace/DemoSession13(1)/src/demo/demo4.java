package demo;

import java.util.ArrayList;
import java.util.List;

import entities.Student;
import models.StudentModel;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StudentModel studentModel  = new StudentModel();
      List<Student> students = studentModel.importCSV("src\\data\\Student2.csv");
      if (students == null) {
    	  System.out.println("Import Failed");
    	  
      } else {
    	  System.out.println("student" + students.size());
    	  for(Student student : students) {
    		  System.out.println(student.toString());
    	  }
    	  
      }
	}

}
