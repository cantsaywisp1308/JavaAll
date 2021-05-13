package Model;

import java.util.ArrayList;
import java.util.List;

import Entities.City;
import Entities.Country;

public class CountryModel {
	
	public List<Country> countryData() {
		
		List<Country> countries = new ArrayList<Country>();
		
		List<City> vietnamCities = new ArrayList<City>();
		vietnamCities.add(new City("HAN","Ha Noi",3358.9,8053663));
		vietnamCities.add(new City("HCM","Ho Chi Minh City",2061.04,8992688));
		vietnamCities.add(new City("HP","Hai Phong",1563.7,2028514));
		vietnamCities.add(new City("DN","Da nang",1284.90,1231000));
		Country vietnam = new Country("VIE","Vietnam","Asia",vietnamCities);
		countries.add(vietnam); 
		
		List<City> chinaCities = new ArrayList<City>();
		chinaCities.add(new City("BEI","Beijing",2341.4,19200000));
		chinaCities.add(new City("SHA","Shanghai",3027.98,28200000));
		chinaCities.add(new City("GUA","Guangzhou",3490.24,21000000));
		chinaCities.add(new City("WUH","Wuhan",11000.4,12600000));
		chinaCities.add(new City("CHE","Chungdu",2858.4,11300000));
		Country china = new Country("CHI","China","Asia",chinaCities);
		countries.add(china);
		
		List<City> japanCities = new ArrayList<City>();
		japanCities.add(new City("NAG","Nagoya",326.45,2283289));
		japanCities.add(new City("AKI","Akita",905.67,329287));
		japanCities.add(new City("CHI","Chiba",272.08,938695));
		japanCities.add(new City("FUK","Fukuoka",340.96,1581527));
		japanCities.add(new City("TOK","Tokyo",621.81,8637098));
		japanCities.add(new City("KYO","Kyoto",827.90,1474570 ));
		Country japan = new Country("JAP","Japan","Asia",japanCities);
		countries.add(japan);
		
		List<City> englishCities = new ArrayList<City>();
		englishCities.add(new City("LON","London",12000,8907918));
		englishCities.add(new City("LIV","Liverpool",5000,579256));
		englishCities.add(new City("BIR","Birmingham",3800,1153717));
		englishCities.add(new City("GLA","Glasgow",4350,612040));
		Country england = new Country("ENG","England","Europe",englishCities);
		countries.add(england);
		
		List<City> frenchCities = new ArrayList<City>();
		frenchCities.add(new City("PAR","Paris",2590,2229621));
		frenchCities.add(new City("MAR","Marseille",2100,855393));
		frenchCities.add(new City("LYO","Lyon",2000,500715));
		frenchCities.add(new City("TOU","Toulouse",1900,458298));
		frenchCities.add(new City("NAN","Nantes",1726.98,342295));
		Country france = new Country("FRA","France","Europe",frenchCities);
		countries.add(france);
		
		List<City> americanCities = new ArrayList<City>();
		americanCities.add(new City("NEW","New York",301.5,8336817));
		americanCities.add(new City("LA","Los Angeles",468.7,3979576));
		americanCities.add(new City("CHI","Chicago",227.3,2693976));
		americanCities.add(new City("HOU","Houston",637.5,2320268));
		americanCities.add(new City("PHO","Phoenix",517.6,1680992));
		Country america = new Country("USA","America","America",americanCities);
		countries.add(america);
		
		List<City> canadianCities = new ArrayList<City>();
		canadianCities.add(new City("TOR","Toronto",501.5,1936817));
		canadianCities.add(new City("OTT","Ottawa",228.7,1079576));
		canadianCities.add(new City("VAN","Vancouver",127.3,1693976));
		canadianCities.add(new City("QUE","Quebec",197.5,1320268));
		canadianCities.add(new City("WIN","Winnipeg",237.6,580992));
		Country canada = new Country("CAN","Canada","America",canadianCities);
		countries.add(canada);
		
		List<City> australiaCities = new ArrayList<City>();
		australiaCities.add(new City("SYD","Sydney",501.5,1936817));
		australiaCities.add(new City("CAN","Canbera",228.7,1079576));
		australiaCities.add(new City("MEL","Melbourne",127.3,1693976));
		Country australia = new Country("AUS","Australia","Oceana",australiaCities);
		countries.add(australia);
		
		return countries; 
		
	}
	

}
