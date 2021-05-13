package Entities;

import java.util.Date;

public class Transfer {

	private int id;
	private String username;
	private String fullname;
	private String currentLocation;
	private String transferLocation;
	private String currentDepartment;
	private String transferDepartment;
	private String currentProject;
	private String transferProject;
	private Date relievingDate;
	private Date joiningDate;
	private int allowance;
	private String reportManager;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getTransferLocation() {
		return transferLocation;
	}
	public void setTransferLocation(String transferLocation) {
		this.transferLocation = transferLocation;
	}
	public String getCurrentDepartment() {
		return currentDepartment;
	}
	public void setCurrentDepartment(String currentDepartment) {
		this.currentDepartment = currentDepartment;
	}
	public String getTransferDepartment() {
		return transferDepartment;
	}
	public void setTransferDepartment(String transferDepartment) {
		this.transferDepartment = transferDepartment;
	}
	public String getCurrentProject() {
		return currentProject;
	}
	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}
	public String getTransferProject() {
		return transferProject;
	}
	public void setTransferProject(String transferProject) {
		this.transferProject = transferProject;
	}
	public Date getRelievingDate() {
		return relievingDate;
	}
	public void setRelievingDate(Date relievingDate) {
		this.relievingDate = relievingDate;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public int getAllowance() {
		return allowance;
	}
	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	public String getReportManager() {
		return reportManager;
	}
	public void setReportManager(String reportManager) {
		this.reportManager = reportManager;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Transfer(int id, String username, String fullname, String currentLocation, String transferLocation,
			String currentDepartment, String transferDepartment, String currentProject, String transferProject,
			Date relievingDate, Date joiningDate, int allowance, String reportManager, String status) {
		super();
		this.id = id;
		this.username = username;
		this.fullname = fullname;
		this.currentLocation = currentLocation;
		this.transferLocation = transferLocation;
		this.currentDepartment = currentDepartment;
		this.transferDepartment = transferDepartment;
		this.currentProject = currentProject;
		this.transferProject = transferProject;
		this.relievingDate = relievingDate;
		this.joiningDate = joiningDate;
		this.allowance = allowance;
		this.reportManager = reportManager;
		this.status = status;
	}
	public Transfer() {
		super();
	} 
	
}
