package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Entities.Account;

public class AccountModel {

	public boolean create(Account account) {
		try {
			PreparedStatement preparedStatement = ConnectDBAccount.getConnection().
					prepareStatement("insert into Account(username,password,fullname,photo,securityCode,status,email) values(?,?,?,?,?,?,?)");
			preparedStatement.setString(1, account.getUsername());
			preparedStatement.setString(2, account.getPassword());
			preparedStatement.setString(3, account.getFullName());
			preparedStatement.setBytes(4, account.getPhoto());
			preparedStatement.setString(5, account.getSecurityCode());
			preparedStatement.setBoolean(6, account.isStatus());
			preparedStatement.setString(7, account.getEmail());
			return preparedStatement.executeUpdate() >0; 
		} catch(Exception e) {
			System.err.print(e.getMessage());
			return false; 
		}
	}
	
	public boolean active(String username, String securityCode) {
		try {
			PreparedStatement preparedStatement = ConnectDBAccount.getConnection().prepareStatement("select * from Account where username = ? "
					+ "and securityCode =?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, securityCode);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				PreparedStatement preparedStatement2 = ConnectDBAccount.getConnection().
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

}
