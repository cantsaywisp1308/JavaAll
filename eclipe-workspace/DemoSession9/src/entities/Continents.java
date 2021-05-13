package entities;

import java.util.Scanner;

public class Continents {
	private String continentName;
	private int numberOfCountries;
	private Countries[] countries;
	
	
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public int getNumberOfCountries() {
		return numberOfCountries;
	}
	public void setNumberOfCountries(int numberOfCountries) {
		this.numberOfCountries = numberOfCountries;
	}
	public Countries[] getCountries() {
		return countries;
	}
	public void setCountries(Countries[] countries) {
		this.countries = countries;
	}
	public Continents(String continentName, int numberOfCountries, Countries[] countries) {
		super();
		this.continentName = continentName;
		this.numberOfCountries = numberOfCountries;
		this.countries = countries;
	}
	
	public Continents() {
		super();
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Continent name: ");
		this.setContinentName(scanner.next());
		System.out.println("How many countries: ");
		this.setNumberOfCountries(scanner.nextInt());
		this.countries = new Countries[this.getNumberOfCountries()];
		for(int i = 0; i< this.getNumberOfCountries();i++ ) {
			this.countries[i] = new Countries();
			this.countries[i].input();
		}
	}
	
	public void output() {
		System.out.println("Continent name: "+this.getContinentName());
		System.out.println("Number of countries: "+this.getNumberOfCountries());
		for(Countries country:this.getCountries()) {
			country.output();
		}
	}
}
