package Entities;

public class Location {

	private String locationNumber;
	private String locationName;
	private String address;
	private String managerNumber;
	public String getLocationNumber() {
		return locationNumber;
	}
	public void setLocationNumber(String locationNumber) {
		this.locationNumber = locationNumber;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getManagerNumber() {
		return managerNumber;
	}
	public void setManagerNumber(String managerNumber) {
		this.managerNumber = managerNumber;
	}
	public Location(String locationNumber, String locationName, String address, String managerNumber) {
		super();
		this.locationNumber = locationNumber;
		this.locationName = locationName;
		this.address = address;
		this.managerNumber = managerNumber;
	}
	public Location() {
		super();
	} 
	
	
	
}
