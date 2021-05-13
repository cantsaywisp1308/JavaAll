package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDBAccount {
	public static Connection getConnection() {
		 Connection connection = null;
		 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaSwing", "root", "");
		 } catch (Exception e) {
		 System.err.println(e.getMessage());
		 connection = null;
		 }
		 return connection;
		 }
}
