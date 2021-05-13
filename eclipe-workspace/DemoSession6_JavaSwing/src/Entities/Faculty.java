package Entities;

public class Faculty {
	private String id;
	private String name;
	private String logo; 
	
	public Faculty(String id, String name, String logo) {
		super();
		this.id = id;
		this.name = name;
		this.logo = logo;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Faculty(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Faculty() {
		super();
	}
	
	
}
