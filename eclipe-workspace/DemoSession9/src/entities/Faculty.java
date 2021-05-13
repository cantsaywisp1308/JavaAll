package entities;

public class Faculty {

	private String id;
	private String name;

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
	
	public void print() {
		System.out.println("faculty id: " + this.id);
		System.out.println("faculty name: " + this.name);
	}

}
