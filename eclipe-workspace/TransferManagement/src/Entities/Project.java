package Entities;

public class Project {

	private String projectNumber;
	private String projectName;
	private String description;
	private boolean status;
	private String managerNumber;
	public String getProjectNumber() {
		return projectNumber;
	}
	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getManagerNumber() {
		return managerNumber;
	}
	public void setManagerNumber(String managerNumber) {
		this.managerNumber = managerNumber;
	}
	public Project(String projectNumber, String projectName, String description, boolean status, String managerNumber) {
		super();
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.description = description;
		this.status = status;
		this.managerNumber = managerNumber;
	}
	public Project() {
		super();
	}
	
	
}
