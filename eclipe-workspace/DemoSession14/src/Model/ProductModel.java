package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.Product;
import Entities.ProductInfo;

public class ProductModel {
	public boolean create(Product product) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("insert into product(name,price,quantity,status,description,created) values(?,?,?,?,?,?)");
			preparedStatement.setString(1, product.getName());
			preparedStatement.setDouble(2, product.getPrice());
			preparedStatement.setInt(3, product.getQuantity());
			preparedStatement.setBoolean(4, product.isStatus());
			preparedStatement.setString(5, product.getDescription());
			preparedStatement.setDate(6, new java.sql.Date(product.getCreated().getTime()));
			return preparedStatement.executeUpdate() >0; 
		} catch(Exception e) {
			e.getMessage();
			return false; 
		}
	}
	
	public boolean update(Product product) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("update product set id =?, name = ?, quantity = ?, status = ?, description =?, created =? "
							+ "where id = ?");
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setDouble(3, product.getPrice());
			preparedStatement.setInt(4 , product.getQuantity());
			preparedStatement.setBoolean(5, product.isStatus());
			preparedStatement.setString(6, product.getDescription());
			preparedStatement.setDate(6, new java.sql.Date(product.getCreated().getTime()));
			preparedStatement.setInt(7, product.getId());
			return preparedStatement.executeUpdate() >0;
		} catch(Exception e) {
			System.err.println(e.getMessage()); 
			return false; 
			
		}
	}
	
	public boolean delete(int id) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("delete from  product where id = ?");
			preparedStatement.setInt(1, id);
			return preparedStatement.executeUpdate() >0;
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false; 
		}
	}
	
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product");
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				products.add(product); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			products = null;
		}
		return products; 
	}
	
	public List<Product> findAll(boolean status ) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product where status = ?");
			preparedStatement.setBoolean(1, status);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				products.add(product); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			products = null;
		}
		return products; 
	}
	
	public List<Product> findAll(double min, double max) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product where price >= ? and price <= ?");
			preparedStatement.setDouble(1, min);
			preparedStatement.setDouble(2, max);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				products.add(product); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			products = null;
		}
		return products; 
	}
	
	public List<Product> findAll(String keyword) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product where name like ?");
			preparedStatement.setString(1, "%" + keyword + "%");
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				products.add(product); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			products = null;
		}
		return products; 
	}
	
	public List<Product> findAll(int year) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product where year(created)= ?");
			preparedStatement.setInt(1, year);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				products.add(product); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			products = null;
		}
		return products; 
	}
	
	public List<Product> findAll(int year, int month) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product where year(created)= ? and month(created) = ?");
			preparedStatement.setInt(1, year);
			preparedStatement.setInt(2, month);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				products.add(product); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			products = null;
		}
		return products; 
	}
	
	public List<Product> findAll(int year, int month, int day) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product where year(created)= ? and month(created) = ? and day(created)=?");
			preparedStatement.setInt(1, year);
			preparedStatement.setInt(2, month);
			preparedStatement.setInt(3, day);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				products.add(product); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			products = null;
		}
		return products; 
	}
	
	public List<Product> findAll(Date start, Date end) {
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product where created >= ? and created <= ?");
			preparedStatement.setDate(1, new java.sql.Date(start.getTime()));
			preparedStatement.setDate(2, new java.sql.Date(end.getTime()));
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				products.add(product); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			products = null;
		}
		return products; 
	}

	public Product find(int id) {
		Product product = null;
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from product where id = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			if(resultSet.next()) {
				product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setStatus(resultSet.getBoolean("status"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
		return product;
	}
	
	public Long sum1() {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select sum(quantity) from product");
			ResultSet resultSet = preparedStatement.executeQuery(); 
			resultSet.next();
			return resultSet.getLong(1);
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
	}
	
	public Double sum2() {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select sum(price * quantity) from product");
			ResultSet resultSet = preparedStatement.executeQuery(); 
			resultSet.next();
			return resultSet.getDouble(1);
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
	}
	
	public Long count(boolean status) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select count(*) from product where status = ?");
			preparedStatement.setBoolean(1, status);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			resultSet.next();
			return resultSet.getLong(1);
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
	}
	
	public List<ProductInfo> findAll2() {
		List<ProductInfo> productInfos = new ArrayList<ProductInfo>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select p.id, p.name, price, c.name as categoryName from product p, category c where p.category_id = c.id");
			ResultSet resultSet = preparedStatement.executeQuery(); 
			while(resultSet.next()) {     //kiểm tra có còn dòng hay không, duyệt qua từng dòng
				ProductInfo productInfo = new ProductInfo();
				productInfo.setCategoryName(resultSet.getString("categoryName"));
				productInfo.setId(resultSet.getInt("id"));
				productInfo.setName(resultSet.getString("name"));
				productInfo.setPrice(resultSet.getDouble("price"));
				productInfos.add(productInfo); 
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
		return productInfos; 
	}
}
