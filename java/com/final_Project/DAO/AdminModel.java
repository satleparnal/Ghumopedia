package com.final_Project.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.final_Project.DTO.AddHome;
import com.final_Project.DTO.AddPlace;
import com.final_Project.DTO.ContactUs;
import com.final_Project.DTO.SignUp;



public class AdminModel {

	public static Connection createConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourist", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	public int createSignup(SignUp sg) {
		int i = 0;
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("insert into registration values(?,?,?,?,?)");
			ps.setString(1, sg.getUsername());
			ps.setString(2, sg.getName());
			ps.setString(3, sg.getPhone());
			ps.setString(4, sg.getEmail());
			ps.setString(5, sg.getPassword());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int createLogin(SignUp sg) {
		int i = 0;
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from registration where username = ? and password = ?");
			ps.setString(1, sg.getUsername());
			ps.setString(2, sg.getPassword());

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				i = 1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int createAddPlace(AddPlace add) {
		int i = 0;
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into addPlace(placeName,placeLocation,placeDescription,placeTimings,placeFamous1,placeFamous2,placeFamous3,placeFamous4,placeFamous5,image1,image2,image3) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, add.getPlaceName());
			ps.setString(2, add.getPlaceLocation());
			ps.setString(3, add.getPlaceDescription());
			ps.setString(4, add.getPlaceTimings());
			ps.setString(5, add.getPlaceFamous1());
			ps.setString(6, add.getPlaceFamous2());
			ps.setString(7, add.getPlaceFamous3());
			ps.setString(8, add.getPlaceFamous4());
			ps.setString(9, add.getPlaceFamous5());
			ps.setString(10, add.getImage1());
			ps.setString(11, add.getImage2());
			ps.setString(12, add.getImage3());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<AddPlace> getAllPlaceDetails() {
		ArrayList<AddPlace> list = new ArrayList<>();
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from addPlace");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				
				AddPlace a = new AddPlace();
				a.setPlaceId(rs.getInt("placeId"));
				a.setPlaceName(rs.getString("placeName"));
				a.setPlaceLocation(rs.getString("placeLocation"));
				a.setPlaceDescription(rs.getString("placeDescription"));
				a.setPlaceTimings(rs.getString("placeTimings"));
				a.setPlaceFamous1(rs.getString("placeFamous1"));
				a.setPlaceFamous2(rs.getString("placeFamous2"));
				a.setPlaceFamous3(rs.getString("placeFamous3"));
				a.setPlaceFamous4(rs.getString("placeFamous4"));
				a.setPlaceFamous5(rs.getString("placeFamous5"));
				a.setImage1(rs.getString("image1"));
				a.setImage2(rs.getString("image2"));
				a.setImage3(rs.getString("image3"));
//				AddPlace a = new AddPlace(rs.getString("placeName"), rs.getString("placeLocation"),
//						rs.getString("placeDescription"), rs.getString("placeTimings"), rs.getString("placeFamous"),
//						rs.getString("placeImage1"));
//				
				list.add(a);
			
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int addHome(AddHome add) {
		Connection con = null;
		int i = 0;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement(
					"insert into addHome(homeName,homeDescription,homeHost,homeFood,homeFacility,homeAttraction,homeExcursion,homeNoOfRooms,homePrice,homePhoto1) values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, add.getHomeName());
			ps.setString(2, add.getHomeDescription());
			ps.setString(3, add.getHomeHost());
			ps.setString(4, add.getHomeFood());
			ps.setString(5, add.getHomeFacility());
			ps.setString(6, add.getHomeAttraction());
			ps.setString(7, add.getHomeExcursion());
			ps.setString(8, add.getHomeNoOfRooms());
			ps.setString(9, add.getHomePrice());
			ps.setString(10, add.getHomePhoto1());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public AddPlace getPlaceDetails(int id) {
		
		Connection con = null;
		AddPlace ad = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from addPlace where placeId = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
			 ad = new AddPlace(rs.getInt("placeId"),rs.getString("placeName"),rs.getString("placeLocation"),rs.getString("placeDescription")
						,rs.getString("placeTimings"),rs.getString("placeFamous1"),rs.getString("placeFamous2"),rs.getString("placeFamous3"),
						rs.getString("placeFamous4"),rs.getString("placeFamous5"),rs.getString("image1"),rs.getString("image2"),rs.getString("image3"));
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ad;
	}

	public AddPlace getSearchDetails(String name) {
		Connection con = null;
		AddPlace ad = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from addPlace where placeName = ?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				 ad = new AddPlace(rs.getInt("placeId"),rs.getString("placeName"),rs.getString("placeLocation"),rs.getString("placeDescription")
							,rs.getString("placeTimings"),rs.getString("placeFamous1"),rs.getString("placeFamous2"),rs.getString("placeFamous3"),
							rs.getString("placeFamous4"),rs.getString("placeFamous5"),rs.getString("image1"),rs.getString("image2"),rs.getString("image3"));
			}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return ad;
	}

	public int createContactUs(ContactUs cu) {
		int i = 0;
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("insert into contactUs(name,email,phoneNumber,subject1,message) values(?,?,?,?,?)");
			ps.setString(1, cu.getName());
			ps.setString(2, cu.getEmail());
			ps.setString(3, cu.getPhoneNumber());
			ps.setString(4, cu.getSubject1());
			ps.setString(5, cu.getMessage());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public ArrayList<ContactUs> getAllContactDetails() {
		ArrayList<ContactUs> list = new ArrayList<>();
		Connection con = null;
		try {
			con = createConnection();
			PreparedStatement ps = con.prepareStatement("select * from contactUs");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				ContactUs c = new ContactUs();
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("email"));
				c.setPhoneNumber(rs.getString("phoneNumber"));
				c.setSubject1(rs.getString("subject1"));
				c.setMessage(rs.getString("message"));
				
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	
		
		
	}
	
}
