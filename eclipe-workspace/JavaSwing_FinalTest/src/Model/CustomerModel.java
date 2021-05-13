package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.Customer;



public class CustomerModel {

	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = ConnectDB.getConnection().prepareStatement("select * from Customer");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer = new  Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setName(resultSet.getString("name"));
				customer.setAddress(resultSet.getString("address"));
				customer.setBirthday(resultSet.getDate("birthday"));
				customer.setPhone(resultSet.getString("phone"));
				customers.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return customers; 
	}
	
	public Customer find(int id) {
		Customer customer = null; 
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from Customer where id =? ");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				customer = new Customer(); 
				customer.setId(resultSet.getInt("id"));
				customer.setName(resultSet.getString("name"));
				customer.setAddress(resultSet.getString("address"));
				customer.setBirthday(resultSet.getDate("birthday"));
				customer.setPhone(resultSet.getString("phone"));
			}
		} catch(Exception e) {
			customer = null;
		}
		return customer; 
	}
	
	public boolean update(Customer customer) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("update Customer set name =?, address =?, birthday =?,phone =? where id =? ");
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getAddress());
			preparedStatement.setDate(3, new java.sql.Date(customer.getBirthday().getTime()));
			preparedStatement.setString(4, customer.getPhone());
			preparedStatement.setInt(5, customer.getId());
			return preparedStatement.executeUpdate() >0; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public boolean delete(int id) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("delete from Customer where id = ?");
			preparedStatement.setInt(1, id);
			return preparedStatement.executeUpdate() >0; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
}
