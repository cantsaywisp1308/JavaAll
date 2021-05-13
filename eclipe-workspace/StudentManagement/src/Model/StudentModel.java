package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Entities.Student;

public class StudentModel {

	public boolean add(Student student) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("insert into Student(username,password,fullname,gender,birthday,phone,email,status ) values(?,?,?,?,?,?,?)");
			preparedStatement.setString(1, student.getUsername());
			preparedStatement.setString(2, student.getPassword());
			preparedStatement.setString(3, student.getFullName());
			preparedStatement.setString(4, student.getGender());
			preparedStatement.setDate(5, new java.sql.Date(student.getBirthday().getTime()));
			preparedStatement.setString(6, student.getClassNumber());
			preparedStatement.setString(7, student.getPhone());
			preparedStatement.setString(8, student.getEmail());
			preparedStatement.setBoolean(9, student.isStatus());
			return preparedStatement.executeUpdate() > 0; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
						
	}
}
