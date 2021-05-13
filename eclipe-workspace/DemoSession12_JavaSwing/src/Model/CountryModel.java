package Model;

import java.util.ArrayList;
import java.util.List;

import Entities.Country;

public class CountryModel {

	public List<Country> findAll() {
		List<Country> countries = new ArrayList<Country>();
		countries.add(new Country("vn","VN","Vietnam"));
		countries.add(new Country("en","US","USA"));
		countries.add(new Country("fr","FR","France"));
		countries.add(new Country("ja","JP","Japan"));
		countries.add(new Country("en","GB","Great Britain"));
		return countries; 
		}
	
	
}
