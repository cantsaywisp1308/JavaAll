package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import Entities.Account;

public class AccountModel {

	public Account find(String username) {
		try {
			Account account = null; 
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from account where username = ?");
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery(); 
			if(resultSet.next()) {
				account = new Account();
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setRole(resultSet.getString("role"));
				account.setFullName(resultSet.getString("fullName"));
				account.setStatus(resultSet.getBoolean("status"));
				account.setBirthday(resultSet.getDate("birthday"));
				account.setEmail(resultSet.getString("email"));
				account.setPhone(resultSet.getString("phone"));
				account.setPhoto(resultSet.getBytes("photo"));
				account.setLocation(resultSet.getString("location"));
				account.setDepartment(resultSet.getString("department"));
				account.setProject(resultSet.getString("project"));
			}
			return account; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean add(Account account) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("insert into account(username,password,securityCode,fullname,birthday,phone,email,status,role,photo,location,department,project) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, account.getUsername());
			preparedStatement.setString(2, account.getPassword());
			preparedStatement.setString(3, account.getSecurityNumber());
			preparedStatement.setString(4, account.getFullName());
			preparedStatement.setDate(5, new java.sql.Date(account.getBirthday().getTime()));
			preparedStatement.setString(6, account.getPhone());
			preparedStatement.setString(7, account.getEmail());
			preparedStatement.setBoolean(8, account.isStatus());
			preparedStatement.setString(9, account.getRole());
			preparedStatement.setBytes(10, account.getPhoto());
			preparedStatement.setString(11, account.getLocation());
			preparedStatement.setString(12, account.getDepartment());
			preparedStatement.setString(13, account.getProject());
			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public boolean active(String username, String securityCode) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from account where username = ? "
					+ "and securityCode =?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, securityCode);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				PreparedStatement preparedStatement2 = ConnectDB.getConnection().
						prepareStatement("update account set status = ? where username = ?");
				preparedStatement2.setBoolean(1, true);
				preparedStatement2.setString(2, username);
				return preparedStatement2.executeUpdate() > 0;
			}
			return false; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
		
	}
	
	public Account login(String username, String password) {
		Account account = find(username);
		if(account != null) {
			if(BCrypt.checkpw(password, account.getPassword()) && account.isStatus()==true) {
				return account; 
			}
		} 
		return null; 
		
	}
	
	public boolean update(Account account) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("update account set fullname =?, birthday=?, phone=?, email=?, photo=? where username = ? ");
			preparedStatement.setString(1, account.getFullName());
			preparedStatement.setDate(2, new java.sql.Date(account.getBirthday().getTime()));
			preparedStatement.setString(3, account.getPhone());
			preparedStatement.setString(4, account.getEmail());
			preparedStatement.setBytes(5, account.getPhoto());
			preparedStatement.setString(6,account.getUsername());
			return preparedStatement.executeUpdate() >0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public boolean updatePosition(String location, String department, String project, String username) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("update account set location =?, department=?, project=? where username = ? ");
			preparedStatement.setString(1, location);
			preparedStatement.setString(2, department);
			preparedStatement.setString(3, project);
			preparedStatement.setString(4, username);
			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public List<Account> findByRole(String role) {
		List<Account> accounts = new ArrayList<Account>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from account where role = ? ");
			preparedStatement.setString(1, role);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Account account = new Account();
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setRole(resultSet.getString("role"));
				account.setFullName(resultSet.getString("fullName"));
				account.setStatus(resultSet.getBoolean("status"));
				account.setBirthday(resultSet.getDate("birthday"));
				account.setEmail(resultSet.getString("email"));
				account.setPhone(resultSet.getString("phone"));
				account.setPhoto(resultSet.getBytes("photo"));
				account.setLocation(resultSet.getString("location"));
				account.setDepartment(resultSet.getString("department"));
				account.setProject(resultSet.getString("project"));
				accounts.add(account);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
		return accounts; 
	}
}
