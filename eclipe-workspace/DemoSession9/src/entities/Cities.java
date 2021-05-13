package entities;

import java.util.Scanner;

public class Cities {
	private String cityId;
	private String cityName;
	private double area;
	private int population;
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
	public Cities(String cityId, String cityName, double area, int population) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.area = area;
		this.population = population;
	}
	
	public Cities() {
		super(); 
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ID of the city: ");
		this.setCityId(scanner.next());
		System.out.println("Enter the name of the city: ");
		this.setCityName(scanner.next());
		System.out.println("Enter the area: ");
		this.setArea(scanner.nextDouble());
		System.out.println("Enter the population: ");
		this.setPopulation(scanner.nextInt());
	}
	
	public void output() {
		System.out.println("City ID: "+this.cityId);
		System.out.println("City name: "+this.cityName);
		System.out.println("Area: "+this.area);
		System.out.println("Population: "+this.population);
		System.out.println("============================"); 
	}
}
