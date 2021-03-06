package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entities.Transfer;

public class TransferModel {

	public boolean add(Transfer transfer) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().
					prepareStatement("insert into transferRecord(employeeNumber,employeeName,currentLocation,transferLocation,currentDepartment,transferDepartment,currentProject,"
							+ "transferProject,relievingDate,joiningDate,reportManager,status,allowance) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			preparedStatement.setString(1, transfer.getUsername());
			preparedStatement.setString(2, transfer.getFullname());
			preparedStatement.setString(3, transfer.getCurrentLocation());
			preparedStatement.setString(4, transfer.getTransferLocation());
			preparedStatement.setString(5, transfer.getCurrentDepartment());
			preparedStatement.setString(6, transfer.getTransferDepartment());
			preparedStatement.setString(7, transfer.getCurrentProject());
			preparedStatement.setString(8, transfer.getTransferProject());
			preparedStatement.setDate(9, new java.sql.Date(transfer.getRelievingDate().getTime()));
			preparedStatement.setDate(10, new java.sql.Date(transfer.getJoiningDate().getTime()));
			preparedStatement.setString(11, transfer.getReportManager());
			preparedStatement.setString(12, "Not decided");
			preparedStatement.setInt(13, transfer.getAllowance());
			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public List<Transfer> findAll() {
		List<Transfer> transfers = new ArrayList<Transfer>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from transferRecord");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Transfer transfer = new Transfer();
				transfer.setId(resultSet.getInt("transferNumber"));
				transfer.setUsername(resultSet.getString("employeeNumber"));
				transfer.setFullname(resultSet.getString("employeeName"));
				transfer.setCurrentLocation(resultSet.getString("currentLocation"));
				transfer.setTransferLocation(resultSet.getString("transferLocation"));
				transfer.setCurrentDepartment(resultSet.getString("currentDepartment"));
				transfer.setTransferDepartment(resultSet.getString("transferDepartment"));
				transfer.setCurrentProject(resultSet.getString("currentProject"));
				transfer.setTransferProject(resultSet.getString("transferProject"));
				transfer.setAllowance(resultSet.getInt("allowance"));
				transfer.setRelievingDate(resultSet.getDate("relievingDate"));
				transfer.setJoiningDate(resultSet.getDate("joiningDate"));
				transfer.setReportManager(resultSet.getString("reportManager"));
				transfer.setStatus(resultSet.getString("status"));
				transfers.add(transfer); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
		return transfers; 
	}
	
	public Transfer find(int id) {
		Transfer transfer = new Transfer();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from transferRecord where transferNumber = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				transfer.setId(resultSet.getInt("transferNumber"));
				transfer.setUsername(resultSet.getString("employeeNumber"));
				transfer.setFullname(resultSet.getString("employeeName"));
				transfer.setCurrentLocation(resultSet.getString("currentLocation"));
				transfer.setTransferLocation(resultSet.getString("transferLocation"));
				transfer.setCurrentDepartment(resultSet.getString("currentDepartment"));
				transfer.setTransferDepartment(resultSet.getString("transferDepartment"));
				transfer.setCurrentProject(resultSet.getString("currentProject"));
				transfer.setTransferProject(resultSet.getString("transferProject"));
				transfer.setAllowance(resultSet.getInt("allowance"));
				transfer.setRelievingDate(resultSet.getDate("relievingDate"));
				transfer.setJoiningDate(resultSet.getDate("joiningDate"));
				transfer.setReportManager(resultSet.getString("reportManager"));
				transfer.setStatus(resultSet.getString("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return transfer;
	}
	
	public boolean update(int id,int allowance) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("update transferRecord set allowance = ? where transferNumer = ?");
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, allowance);
			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public boolean delete(int id) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("delete from transferRecord where transferNumber = ?");
			preparedStatement.setInt(1, id);
			return preparedStatement.executeUpdate() >0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	
	public boolean approve(int id) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("update transferRecord set status = ? where transferNumer = ?");
			preparedStatement.setString(1, "Approved");
			preparedStatement.setInt(2, id);
			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public boolean declined(int id) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("update transferRecord set status = ? where transferNumer = ?");
			preparedStatement.setString(1, "Declined");
			preparedStatement.setInt(2, id);
			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false; 
		}
	}
	
	public List<Transfer> find(String username) {
		List<Transfer> transfers = new ArrayList<Transfer>();
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement("select * from transferRecord where employeeNumber = ?");
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Transfer transfer = new Transfer();
				transfer.setId(resultSet.getInt("transferNumber"));
				transfer.setUsername(resultSet.getString("employeeNumber"));
				transfer.setFullname(resultSet.getString("employeeName"));
				transfer.setCurrentLocation(resultSet.getString("currentLocation"));
				transfer.setTransferLocation(resultSet.getString("transferLocation"));
				transfer.setCurrentDepartment(resultSet.getString("currentDepartment"));
				transfer.setTransferDepartment(resultSet.getString("transferDepartment"));
				transfer.setCurrentProject(resultSet.getString("currentProject"));
				transfer.setTransferProject(resultSet.getString("transferProject"));
				transfer.setAllowance(resultSet.getInt("allowance"));
				transfer.setRelievingDate(resultSet.getDate("relievingDate"));
				transfer.setJoiningDate(resultSet.getDate("joiningDate"));
				transfer.setReportManager(resultSet.getString("reportManager"));
				transfer.setStatus(resultSet.getString("status"));
				transfers.add(transfer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return transfers;
	}
}
