package Entities;

public class Country {
	
	private String languageId;
	private String countryId;
	private String countryName;
	public String getLanguageId() {
		return languageId;
	}
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Country(String languageId, String countryId, String countryName) {
		super();
		this.languageId = languageId;
		this.countryId = countryId;
		this.countryName = countryName;
	}
	public Country() {
		super();
	} 
	
	

}
