package Entities;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String id;
	private String name;
	private List<City> cities = new ArrayList<City>();
	
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
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public Country() {
		super();
	}
	public Country(String id, String name, List<City> cities) {
		super();
		this.id = id;
		this.name = name;
		this.cities = cities;
	}
	
	
}
