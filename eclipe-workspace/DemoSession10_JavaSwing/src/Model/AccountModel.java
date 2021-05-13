package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import Entities.Account;

public class AccountModel {
	
	public boolean create(Account account) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("insert into Account(username,password,fullname) values(?,?,?)");
			preparedStatement.setString(1, account.getUsername());
			preparedStatement.setString(2, account.getPassword());
			preparedStatement.setString(3, account.getFullname());
			return preparedStatement.executeUpdate() >0; 
		} catch(Exception e) {
			System.err.print(e.getMessage());
			return false; 
		}
	}
	
	public List<Account> findAll() {
		List<Account> accounts = new ArrayList<Account>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from Account");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Account account = new Account();
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
				accounts.add(account);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
		return accounts; 
	}
	
	public Account find(String username) {
		Account account = null; 
		List<Account> accounts = new ArrayList<Account>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("select * from Account where username = ?");
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				account = new Account();
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			account =  null; 
		}
		return account; 
	}
	
	public Account login(String username, String password) {
		Account account = find(username);
		if(account != null) {
			if(BCrypt.checkpw(password, account.getPassword())) {
				return account; 
			}
		} 
		return null; 
		
	}
}
