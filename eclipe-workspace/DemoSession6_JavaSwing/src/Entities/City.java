package Entities;

public class City {
	private String id;
	private String name;
	private double area;
	private int population;
	
	
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
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public City(String id, String name, double area, int population) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.population = population;
	}
	public City() {
		super();
	} 
	
}
