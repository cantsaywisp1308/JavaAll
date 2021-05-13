package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import Entities.Account;

public class ProductModelAccount {
	
	
	public boolean create(Account account) {
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("insert into account(username,password,fullname,birthday,status) values(?,?,?,?,?)");
			preparedStatementAccount.setString(1, account.getUsername());
			preparedStatementAccount.setString(2, account.getPassword());
			preparedStatementAccount.setString(3, account.getFullname());
			preparedStatementAccount.setDate(4, new java.sql.Date(account.getBirthday().getTime()));
			preparedStatementAccount.setBoolean(5, account.isStatus());
			return preparedStatementAccount.executeUpdate() >0; 
		} catch(Exception e) {
			e.getMessage();
			return false; 
		}
		
	}
	
	public boolean update(Account account) {
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("update product set id =?, username = ?, password = ?, fullname = ?, birthday =?, status = ? where id = ? ");
			preparedStatementAccount.setInt(1, account.getId());
			preparedStatementAccount.setString(2, account.getUsername());
			preparedStatementAccount.setString(3, account.getPassword());
			preparedStatementAccount.setString(4, account.getFullname());
			preparedStatementAccount.setDate(5, new java.sql.Date(account.getBirthday().getTime()));
			preparedStatementAccount.setBoolean(6, account.isStatus());
			preparedStatementAccount.setInt(7, account.getId());
			return preparedStatementAccount.executeUpdate() >0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
		
	}
	
	public boolean delete(int id) {
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("delete from product where id =? ");
			preparedStatementAccount.setInt(1, id);
			return preparedStatementAccount.executeUpdate() >0; 
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return false; 
		}
	}
	
	public List<Account> search() {
		List<Account> accounts = new ArrayList<Account>();
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("select * from account ");
			ResultSet resultSet = preparedStatementAccount.executeQuery();
			while (resultSet.next()) {
				Account account = new Account();
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
				account.setBirthday(resultSet.getDate("birthday"));
				account.setStatus(resultSet.getBoolean("status"));
				accounts.add(account);

			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
			return null; 
		}
		return accounts;
	}
	
	public List<Account> search(int id) {
		List<Account> accounts = new ArrayList<Account>();
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("select * from account where id = ? ");
			preparedStatementAccount.setInt(1, id);
			ResultSet resultSet = preparedStatementAccount.executeQuery(); 
			while(resultSet.next()) {
				Account account = new Account();
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
				account.setBirthday(resultSet.getDate("birthday"));
				account.setStatus(resultSet.getBoolean("status"));
				accounts.add(account);
			}
		} catch(Exception e ) {
			System.err.println(e.getMessage());
			return null; 
		}
		return accounts;
	}
	

	
	public List<Account> search(String username) {
		List<Account> accounts = new ArrayList<Account>();
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("select * from account where username =? ");
			preparedStatementAccount.setString(1, username);
			ResultSet resultSet = preparedStatementAccount.executeQuery();
			while(resultSet.next()) {
				Account account = new Account();
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
				account.setBirthday(resultSet.getDate("birthday"));
				account.setStatus(resultSet.getBoolean("status"));
				accounts.add(account);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			return null;
		}
		return accounts; 
	}
	
	public Account search2(String username) {
		Account account = new Account();
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("select * from account where username =? ");
			preparedStatementAccount.setString(1, username);
			ResultSet resultSet = preparedStatementAccount.executeQuery();
			while(resultSet.next()) {
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
				account.setBirthday(resultSet.getDate("birthday"));
				account.setStatus(resultSet.getBoolean("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			return null;
		}
		return account;
	}
	
	
	public List<Account> search(Date birthday) {
		List<Account> accounts = new ArrayList<Account>();
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("select * from account where birthday = ?");
			preparedStatementAccount.setDate(1, new java.sql.Date(birthday.getTime()));
			ResultSet resultSet = preparedStatementAccount.executeQuery();
			while(resultSet.next()) {
				Account account = new Account();
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
				account.setBirthday(resultSet.getDate("birthday"));
				account.setStatus(resultSet.getBoolean("status"));
				accounts.add(account);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			return null;
		}
		return accounts;
	}
	
	public List<Account> search(Date start, Date end) {
		List<Account> accounts = new ArrayList<Account>();
		try {
			PreparedStatement preparedStatementAccount = ConnectDBAccount.getConnection().
					prepareStatement("select * from account where birthday >= ? and birthday <= ?");
			preparedStatementAccount.setDate(1, new java.sql.Date(start.getTime()));
			preparedStatementAccount.setDate(2, new java.sql.Date(end.getTime()));
			ResultSet resultSet = preparedStatementAccount.executeQuery();
			while(resultSet.next()) {
				Account account = new Account();
				account.setId(resultSet.getInt("id"));
				account.setUsername(resultSet.getString("username"));
				account.setPassword(resultSet.getString("password"));
				account.setFullname(resultSet.getString("fullname"));
				account.setBirthday(resultSet.getDate("birthday"));
				account.setStatus(resultSet.getBoolean("status"));
				accounts.add(account);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			return null;
		}
		return accounts;
	}
	
	public Account login(String username, String password) {
		Account account = search2(username);
		if(username != null) {
			if(BCrypt.checkpw(password, account.getPassword())) {
				return account;
			}
		}
		return null; 
	}


}

