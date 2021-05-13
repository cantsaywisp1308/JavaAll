package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.Project;

public class ProjectModel {

	public List<Project> findAll() {
		List<Project> projects = new ArrayList<Project>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from project");
			ResultSet resultSet  =  preparedStatement.executeQuery();
			while(resultSet.next()) {
				Project project = new Project();
				project.setProjectNumber(resultSet.getString("projectNumber"));
				project.setProjectName(resultSet.getString("projectName"));
				project.setDescription(resultSet.getString("description"));
				project.setStatus(resultSet.getBoolean("status"));
				project.setManagerNumber(resultSet.getString("managerNumber"));
				projects.add(project); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
		return projects;
	}
}
