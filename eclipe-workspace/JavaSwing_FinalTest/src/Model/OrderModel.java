package Model;

import java.sql.PreparedStatement;

import Entities.Order;

public class OrderModel {

	public boolean add(Order order) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("insert into Orders(name,datecreation,status,payments,customerid) values(?,?,?,?,?)");
			preparedStatement.setString(1, order.getName());
			preparedStatement.setDate(2, order.getDatecreation());
			preparedStatement.setBoolean(3, order.isStatus());
			preparedStatement.setString(4, order.getPayments());
			preparedStatement.setInt(5, order.getCustomerid());
			return preparedStatement.executeUpdate() >0; 
		} catch(Exception e) {
			System.err.print(e.getMessage());
			return false; 
		}
	}
}
