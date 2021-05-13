package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.Location;

public class LocationModel {

	public List<Location> findAll() {
		List<Location> locations = new ArrayList<Location>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from location");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Location location = new Location();
				location.setLocationNumber(resultSet.getString("locationNumber"));
				location.setLocationName(resultSet.getString("locationName"));
				location.setAddress(resultSet.getString("address"));
				location.setManagerNumber(resultSet.getString("managerNumber"));
				locations.add(location);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
		return locations; 
	}
}
