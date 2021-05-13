package Model;

import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Entities.BookStore;

public class BookStoreModel {
	
	public boolean created(BookStore bookStore) {
		
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("insert into BookStore(name,price,quantity,status,created) values(?,?,?,?,?,?)");
			preparedStatement.setString(1, bookStore.getName());
			preparedStatement.setDouble(2, bookStore.getPrice());
			preparedStatement.setInt(3, bookStore.getQuantity());
			preparedStatement.setBoolean(4, bookStore.isStatus());
			preparedStatement.setDate(5, new java.sql.Date(bookStore.getCreated().getTime()));
			return preparedStatement.executeUpdate() > 0; 
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false; 
		}
	}
	
	public List<BookStore> find() {
		List<BookStore> bookStores = new ArrayList<BookStore>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from BookStore");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				BookStore bookStore = new BookStore();
				bookStore.setId(resultSet.getString("id"));
				bookStore.setName(resultSet.getString("name"));
				bookStore.setPrice(resultSet.getDouble("price"));
				bookStore.setQuantity(resultSet.getInt("quantity"));
				bookStore.setStatus(resultSet.getBoolean("status"));
				bookStore.setCreated(resultSet.getDate("created"));
				bookStores.add(bookStore);
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
		return bookStores; 
	}
	
	public List<BookStore> find(int month, int year, boolean status) {
		List<BookStore> bookStores = new ArrayList<BookStore>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from BookStore where month(created) = ? and year(created)=? and status =? ");
			preparedStatement.setInt(1, month);
			preparedStatement.setInt(2, year);
			preparedStatement.setBoolean(3, status);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				BookStore bookStore = new BookStore();
				bookStore.setId(resultSet.getString("id"));
				bookStore.setName(resultSet.getString("name"));
				bookStore.setPrice(resultSet.getDouble("price"));
				bookStore.setQuantity(resultSet.getInt("quantity"));
				bookStore.setStatus(resultSet.getBoolean("status"));
				bookStore.setCreated(resultSet.getDate("created"));
				bookStores.add(bookStore);
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
		return bookStores; 
	}
	
	public List<BookStore> find(String key, int min, int max) {
		List<BookStore> bookStores = new ArrayList<BookStore>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from BookStore where name like ? and quantity >= ? and quantity <= ?");
			preparedStatement.setString(1, "%" + key + "%");
			preparedStatement.setInt(2 , min);
			preparedStatement.setInt(3 , max);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				BookStore bookStore = new BookStore();
				bookStore.setId(resultSet.getString("id"));
				bookStore.setName(resultSet.getString("name"));
				bookStore.setPrice(resultSet.getDouble("price"));
				bookStore.setQuantity(resultSet.getInt("quantity"));
				bookStore.setStatus(resultSet.getBoolean("status"));
				bookStore.setCreated(resultSet.getDate("created"));
				bookStores.add(bookStore);
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
		return bookStores; 
	}
	
	public List<BookStore> find(String key) {
		List<BookStore> bookStores = new ArrayList<BookStore>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from BookStore where id like ?");
			preparedStatement.setString(1, "%" + key + "%");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				BookStore bookStore = new BookStore();
				bookStore.setId(resultSet.getString("id"));
				bookStore.setName(resultSet.getString("name"));
				bookStore.setPrice(resultSet.getDouble("price"));
				bookStore.setQuantity(resultSet.getInt("quantity"));
				bookStore.setStatus(resultSet.getBoolean("status"));
				bookStore.setCreated(resultSet.getDate("created"));
				bookStores.add(bookStore);
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
		return bookStores; 
	}
	
	public Long sum1(int year) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select sum(quantity * price) from BookStore where year(created) =? ");
			preparedStatement.setInt(1, year);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			resultSet.next();
			return resultSet.getLong(1);
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
	}
	
	public boolean saveFile(List<BookStore> books) {
		/* Luu danh sach cac san pham vao file co ten theo dinh dang
		 * ddMMyyy.txt
		 */
		
		try {
			String content =" ";
			for(BookStore book : books) {
				  content += "id" + book.getId() + "\n";

				 content += "name: " + book.getName() + "\n";
				 content += "price: "  + book.getPrice()+ "\n";
				 content += "quantity: "  + book.getQuantity()+ "\n";
				 content += "status: "  + book.isStatus()+ "\n";
				 content += "created: "  + book.getCreated()+ "\n";
				 content += "=========================================== \n";
			}
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
			String fileName = simpleDateFormat.format(new Date(0)) + "txt";
			FileOutputStream fileOutputStream = new FileOutputStream("src\\data\\" + fileName);
			fileOutputStream.write(content.getBytes());
	        	fileOutputStream.flush();
	        	fileOutputStream.close();
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
}
