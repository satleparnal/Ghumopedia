package com.final_Project.DTO;

public class AddPlace {

	private int placeId;
	private String placeName;
	private String placeLocation;
	private String placeDescription;
	private String placeTimings;
	private String placeFamous1;
	private String placeFamous2;
	private String placeFamous3;
	private String placeFamous4;
	private String placeFamous5;
	private String image1;
	private String image2;
	private String image3;
	
	
	
	
	
	public AddPlace() {
		
	}
	public AddPlace(int placeId, String placeName, String placeLocation, String placeDescription, String placeTimings,
			String placeFamous1, String placeFamous2, String placeFamous3, String placeFamous4, String placeFamous5,
			String image1, String image2, String image3) {
		
		this.placeId = placeId;
		this.placeName = placeName;
		this.placeLocation = placeLocation;
		this.placeDescription = placeDescription;
		this.placeTimings = placeTimings;
		this.placeFamous1 = placeFamous1;
		this.placeFamous2 = placeFamous2;
		this.placeFamous3 = placeFamous3;
		this.placeFamous4 = placeFamous4;
		this.placeFamous5 = placeFamous5;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}
	
	public AddPlace( String placeName, String placeLocation, String placeDescription, String placeTimings,
			String placeFamous1, String placeFamous2, String placeFamous3, String placeFamous4, String placeFamous5,
			String image1, String image2, String image3) {
		
		
		this.placeName = placeName;
		this.placeLocation = placeLocation;
		this.placeDescription = placeDescription;
		this.placeTimings = placeTimings;
		this.placeFamous1 = placeFamous1;
		this.placeFamous2 = placeFamous2;
		this.placeFamous3 = placeFamous3;
		this.placeFamous4 = placeFamous4;
		this.placeFamous5 = placeFamous5;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
	}
	
	public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getPlaceLocation() {
		return placeLocation;
	}
	public void setPlaceLocation(String placeLocation) {
		this.placeLocation = placeLocation;
	}
	public String getPlaceDescription() {
		return placeDescription;
	}
	public void setPlaceDescription(String placeDescription) {
		this.placeDescription = placeDescription;
	}
	public String getPlaceTimings() {
		return placeTimings;
	}
	public void setPlaceTimings(String placeTimings) {
		this.placeTimings = placeTimings;
	}
	public String getPlaceFamous1() {
		return placeFamous1;
	}
	public void setPlaceFamous1(String placeFamous1) {
		this.placeFamous1 = placeFamous1;
	}
	public String getPlaceFamous2() {
		return placeFamous2;
	}
	public void setPlaceFamous2(String placeFamous2) {
		this.placeFamous2 = placeFamous2;
	}
	public String getPlaceFamous3() {
		return placeFamous3;
	}
	public void setPlaceFamous3(String placeFamous3) {
		this.placeFamous3 = placeFamous3;
	}
	public String getPlaceFamous4() {
		return placeFamous4;
	}
	public void setPlaceFamous4(String placeFamous4) {
		this.placeFamous4 = placeFamous4;
	}
	public String getPlaceFamous5() {
		return placeFamous5;
	}
	public void setPlaceFamous5(String placeFamous5) {
		this.placeFamous5 = placeFamous5;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	
	
	
}
