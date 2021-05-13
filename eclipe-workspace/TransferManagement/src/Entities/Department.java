package Entities;

public class Department {

	private String departmentNumber;
	private String deparmentName;
	private String managerNumber;
	public String getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(String departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public String getDeparmentName() {
		return deparmentName;
	}
	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName;
	}
	public String getManagerNumber() {
		return managerNumber;
	}
	public void setManagerNumber(String managerNumber) {
		this.managerNumber = managerNumber;
	}
	public Department(String departmentNumber, String deparmentName, String managerNumber) {
		super();
		this.departmentNumber = departmentNumber;
		this.deparmentName = deparmentName;
		this.managerNumber = managerNumber;
	}
	public Department() {
		super();
	}

	
}
