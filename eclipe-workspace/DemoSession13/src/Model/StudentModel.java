package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Entities.Student;

public class StudentModel {
	public List<Student> importCSV(String path ) {
		List<Student> students = new ArrayList<Student>() ;
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
			String line = "";
			while ((line = bufferedReader.readLine()) != null ) {
				String[] result = line.split(",");
				Student student = new Student();
				student.setId(result[0]);
				student.setName(result[1]);
				student.setScore(Double.parseDouble(result[2]));
				student.setName(result[1]);
				student.setBirthday(simpleDateFormat.parse(result[3]));
				students.add(student);
			}
			bufferedReader.close();
		} catch(Exception e) {
			return null;
		}
		return students; 
	}
	

}
