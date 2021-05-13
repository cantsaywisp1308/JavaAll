package entities;

import java.util.Scanner;

public class Countries {
	private String countriesName;
	private int numberOfCities;
	private Cities[] cities;
	
	
	public String getCountriesName() {
		return countriesName;
	}
	public void setCountriesName(String countriesName) {
		this.countriesName = countriesName;
	}
	public int getNumberOfCities() {
		return numberOfCities;
	}
	public void setNumberOfCities(int numberOfCities) {
		this.numberOfCities = numberOfCities;
	}
	public Cities[] getCities() {
		return cities;
	}
	public void setCities(Cities[] cities) {
		this.cities = cities;
	}
	public Countries(String countriesName, int numberOfCities, Cities[] cities) {
		super();
		this.countriesName = countriesName;
		this.numberOfCities = numberOfCities;
		this.cities = cities;
	}
	
	public Countries() {
		super();
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Country name: ");
		this.setCountriesName(scanner.next());
		System.out.println("How many cities: ");
		this.setNumberOfCities(scanner.nextInt());
		this.cities = new Cities[this.getNumberOfCities()]; 
		for(int i=0; i < cities.length; i++) {
			this.cities[i] = new Cities();
			this.cities[i].input();
		}
	}
	
	public void output() {
		System.out.println("Country name: "+this.countriesName);
		System.out.println("Number of cities: "+this.numberOfCities);
		for(Cities city : this.cities) {
			city.output();
		}
	}
}
