package Model;

import java.util.ArrayList;
import java.util.List;

import Entities.City;
import Entities.Country;
import Entities.District;

public class CountryModel {
	
	public List<Country> findAll() {
		List<Country> countries = new ArrayList<Country>();
		Country country1  = new Country();
		country1.setId("co1");
		country1.setName("Country 1");
		
		City city1 = new City();
		city1.setId("ci1");
		city1.setName("City 1");
		city1.getDistricts().add(new District("di1","District 1"));
		city1.getDistricts().add(new District("di2","District 2"));
		city1.getDistricts().add(new District("di3","District 3"));
		country1.getCities().add(city1);
		
		City city2 = new City();
		city2.setId("ci2");
		city2.setName("City 2");
		city2.getDistricts().add(new District("di4","District 4"));
		city2.getDistricts().add(new District("di5","District 5"));
		city2.getDistricts().add(new District("di6","District 6"));
		country1.getCities().add(city2);
		
		City city3 = new City();
		city3.setId("ci3");
		city3.setName("City 3");
		city3.getDistricts().add(new District("di4","District 7"));
		city3.getDistricts().add(new District("di5","District 8"));
		city3.getDistricts().add(new District("di6","District 9"));
		country1.getCities().add(city3);
		countries.add(country1);
		
		Country country2 = new Country();
		country2.setId("co2");
		country2.setName("Country 2");
		
		City city4 = new City();
		city4.setId("ci4");
		city4.setName("City 4");
		city4.getDistricts().add(new District("dis10","District 10"));
		city4.getDistricts().add(new District("dis11","District 11"));
		city4.getDistricts().add(new District("dis12","District 12"));
		country2.getCities().add(city4);
		
		City city5 = new City();
		city5.setId("ci5");
		city5.setName("City 5");
		city5.getDistricts().add(new District("dis13","District 13"));
		city5.getDistricts().add(new District("dis14","District 14"));
		city5.getDistricts().add(new District("dis15","District 15"));
		country2.getCities().add(city5);
		countries.add(country2);
		
		
		Country country3 = new Country();
		country3.setId("co3");
		country3.setName("Country 3");
		
		City city6 = new City();
		city6.setId("ci6");
		city6.setName("City 6");
		city6.getDistricts().add(new District("dis16","District 16"));
		city6.getDistricts().add(new District("dis17","District 17"));
		city6.getDistricts().add(new District("dis18","District 18"));
		country3.getCities().add(city6);
		
		City city7 = new City();
		city7.setId("ci7");
		city7.setName("City 7");
		city7.getDistricts().add(new District("dis19","District 19"));
		city7.getDistricts().add(new District("dis20","District 20"));
		city7.getDistricts().add(new District("dis21","District 21"));
		country3.getCities().add(city7);
		countries.add(country3);
		
		return countries; 
	}
	
}
