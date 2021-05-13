package Model;

import java.util.ArrayList;
import java.util.List;

import Entities.City;
import Entities.Country;
import Entities.District;


public class CityModel {
	
	
	public List<City> findAll(Country country,String id) {
		List<City> cities = new ArrayList<City>();
		if(country.getId().equalsIgnoreCase(id)) {
			cities = country.getCities();
			return cities;
		}
		
		return null; 
		
		
	}
	
	public List<District> findDistrict(City city, String id) {
		List<District> districts = new ArrayList<District>();
		if(city.getId().equalsIgnoreCase(id)) {
			districts = city.getDistricts();
			return districts; 
		}
		return null; 
	}
	
}
