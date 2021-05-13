package Windows;

import Model.ConnectDB;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(ConnectDB.getConnection() != null) {
			System.out.println("Success ! ");
		} else {
			System.out.println("Failed !"); 
		}
	}

}
