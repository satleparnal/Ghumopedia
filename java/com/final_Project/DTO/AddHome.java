package com.final_Project.DTO;

public class AddHome {

	private int homeId;
	private String homeName;
	private String homeDescription;
	private String homeHost;
	private String homeFood;
	private String homeFacility;
	private String homeAttraction;
	private String homeExcursion;
	private String homeNoOfRooms;
	private String homePrice;
	private String homePhoto1;
	
	
	
	
	
	public AddHome() {
		
	}
	
	public AddHome(String homeName, String homeDescription, String homeHost, String homeFood, String homeFacility,
			String homeAttraction, String homeExcursion, String homeNoOfRooms, String homePrice, String homePhoto1) {
		
		this.homeName = homeName;
		this.homeDescription = homeDescription;
		this.homeHost = homeHost;
		this.homeFood = homeFood;
		this.homeFacility = homeFacility;
		this.homeAttraction = homeAttraction;
		this.homeExcursion = homeExcursion;
		this.homeNoOfRooms = homeNoOfRooms;
		this.homePrice = homePrice;
		this.homePhoto1 = homePhoto1;
	}
	
	public AddHome(int homeId, String homeName, String homeDescription, String homeHost, String homeFood,
			String homeFacility, String homeAttraction, String homeExcursion, String homeNoOfRooms, String homePrice,
			String homePhoto1) {
		
		this.homeId = homeId;
		this.homeName = homeName;
		this.homeDescription = homeDescription;
		this.homeHost = homeHost;
		this.homeFood = homeFood;
		this.homeFacility = homeFacility;
		this.homeAttraction = homeAttraction;
		this.homeExcursion = homeExcursion;
		this.homeNoOfRooms = homeNoOfRooms;
		this.homePrice = homePrice;
		this.homePhoto1 = homePhoto1;
	}

	public int getHomeId() {
		return homeId;
	}

	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}

	public String getHomeName() {
		return homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public String getHomeDescription() {
		return homeDescription;
	}

	public void setHomeDescription(String homeDescription) {
		this.homeDescription = homeDescription;
	}

	public String getHomeHost() {
		return homeHost;
	}

	public void setHomeHost(String homeHost) {
		this.homeHost = homeHost;
	}

	public String getHomeFood() {
		return homeFood;
	}

	public void setHomeFood(String homeFood) {
		this.homeFood = homeFood;
	}

	public String getHomeFacility() {
		return homeFacility;
	}

	public void setHomeFacility(String homeFacility) {
		this.homeFacility = homeFacility;
	}

	public String getHomeAttraction() {
		return homeAttraction;
	}

	public void setHomeAttraction(String homeAttraction) {
		this.homeAttraction = homeAttraction;
	}

	public String getHomeExcursion() {
		return homeExcursion;
	}

	public void setHomeExcursion(String homeExcursion) {
		this.homeExcursion = homeExcursion;
	}

	public String getHomeNoOfRooms() {
		return homeNoOfRooms;
	}

	public void setHomeNoOfRooms(String homeNoOfRooms) {
		this.homeNoOfRooms = homeNoOfRooms;
	}

	public String getHomePrice() {
		return homePrice;
	}

	public void setHomePrice(String homePrice) {
		this.homePrice = homePrice;
	}

	public String getHomePhoto1() {
		return homePhoto1;
	}

	public void setHomePhoto1(String homePhoto1) {
		this.homePhoto1 = homePhoto1;
	}
	
	
}
