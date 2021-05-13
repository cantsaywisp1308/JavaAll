package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.Product;

public class ProductModel {
	
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from product");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setCreated(resultSet.getDate("created"));
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				products.add(product); 
			}
		} catch(Exception e) {
			products = null;
		}
		return products; 
	}
	
	public List<Product> search(String keyword) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from product where name like ?");
			preparedStatement.setString(1,"%" + keyword + "%");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setCreated(resultSet.getDate("created"));
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				products.add(product); 
			}
		} catch(Exception e) {
			products = null;
		}
		return products; 
	}
	
	public List<Product> search(double min, double max) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from product where price >= ? and price <=? ");
			preparedStatement.setDouble(1, min);
			preparedStatement.setDouble(2, max);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setCreated(resultSet.getDate("created"));
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				products.add(product); 
			}
		} catch(Exception e) {
			products = null;
		}
		return products; 
	}
	
	public boolean create(Product product) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("insert into product(name,price,quantity,status,description,created ) values(?,?,?,?,?,?)");
			preparedStatement.setString(1, product.getName());
			preparedStatement.setDouble(2, product.getPrice());
			preparedStatement.setInt(3, product.getQuantity());
			preparedStatement.setBoolean(4, product.isStatus());
			preparedStatement.setString(5, product.getDescription());
			preparedStatement.setDate(6, new java.sql.Date(product.getCreated().getTime()));
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
					prepareStatement("delete from product where id = ?");
			preparedStatement.setInt(1, id);
			return preparedStatement.executeUpdate() >0; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public Product find(int id) {
		Product product = null; 
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from product where id =? ");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				product = new Product(); 
				product.setCreated(resultSet.getDate("created"));
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
			}
		} catch(Exception e) {
			product = null;
		}
		return product; 
	}
	
	public boolean update(Product product) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("update product set name =?, price =?, quantity =?,status =?, description =?, created =? where id =? ");
			preparedStatement.setString(1, product.getName());
			preparedStatement.setDouble(2, product.getPrice());
			preparedStatement.setInt(3, product.getQuantity());
			preparedStatement.setBoolean(4, product.isStatus());
			preparedStatement.setString(5, product.getDescription());
			preparedStatement.setDate(6, new java.sql.Date(product.getCreated().getTime()));
			preparedStatement.setInt(7, product.getId()); 
			return preparedStatement.executeUpdate() >0; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
}
