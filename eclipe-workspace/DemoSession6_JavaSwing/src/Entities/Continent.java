package Entities;

import java.util.ArrayList;
import java.util.List;

public class Continent {
	private String id;
	private String name;
	private List<Country> countries = new ArrayList<Country>();
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
	public List<Country> getCountries() {
		return countries;
	}
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	public Continent(String id, String name, List<Country> countries) {
		super();
		this.id = id;
		this.name = name;
		this.countries = countries;
	}
	public Continent() {
		super();
	}
	
	
}
