package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.Department;

public class DepartmentModel {

	public List<Department> findAll() {
		List<Department> departments = new ArrayList<Department>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from department");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Department department = new Department();
				department.setDepartmentNumber(resultSet.getString("departmentNumber"));
				department.setDeparmentName(resultSet.getString("departmentName"));
				department.setManagerNumber(resultSet.getString("managerNumber"));
				departments.add(department); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return departments; 
	}
}
