package Model;

import java.util.ArrayList;
import java.util.List;

import Entities.City;
import Entities.Continent;
import Entities.Country;

public class ContinentModel {
	public List<Continent> createContinent() {
		List<Continent> continents = new ArrayList<Continent>();
		CountryModel countryModel = new CountryModel();
		Continent asia = new Continent();
		asia.setId("ASI");
		asia.setName("Asia");
		asia.setCountries(findByContinent("asia"));
		continents.add(asia);
		
		Continent europe = new Continent();
		europe.setId("EUR");
		europe.setName("Europe");
		europe.setCountries(findByContinent("europe"));
		continents.add(europe); 
		
		Continent america = new Continent();
		america.setId("AME");
		america.setName("America");
		america.setCountries(findByContinent("america"));
		continents.add(america); 
		
		Continent oceana = new Continent();
		oceana.setId("OCE");
		oceana.setName("Oceana");
		oceana.setCountries(findByContinent("oceana"));
		continents.add(oceana); 
		
		return continents;
		
	}
	
	public List<Country> findByContinent(String continent) {
		List<Country> countries = new ArrayList<Country>();
		CountryModel countryModel = new CountryModel();
		for(Country country:countryModel.countryData()) {
			if(country.getContinent().equalsIgnoreCase(continent)) {
				countries.add(country);
			}
		}
		return countries; 
	}
	
	
	
}
