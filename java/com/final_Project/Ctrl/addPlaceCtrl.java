package com.final_Project.Ctrl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.final_Project.DAO.AdminModel;
import com.final_Project.DTO.AddPlace;


@MultipartConfig
@WebServlet("/addPlaceCtrl")
public class addPlaceCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String place_name = request.getParameter("placeName");
		String place_location = request.getParameter("placeLocation");
		String place_description = request.getParameter("placeDescription");
		String place_timing = request.getParameter("placeTimings");
		String place_famous1 = request.getParameter("placeFamous1");
		String place_famous2 = request.getParameter("placeFamous2");
		String place_famous3 = request.getParameter("placeFamous3");
		String place_famous4 = request.getParameter("placeFamous4");
		String place_famous5 = request.getParameter("placeFamous5");
		Part file1 = request.getPart("image1");
		Part file2 = request.getPart("image2");
		Part file3 = request.getPart("image3");

		String imageFileName1 = file1.getSubmittedFileName(); // get selected file name
		String imageFileName2 = file2.getSubmittedFileName();
		String imageFileName3 = file3.getSubmittedFileName();

		System.out.println("Selected image file name 1 : " + imageFileName1);
		System.out.println("Selected image file name 2 : " + imageFileName2);
		System.out.println("Selected image file name 3 : " + imageFileName3);
		
		
		//C:\Users\Smart\eclipse-workspace2\Final\src\main\webapp\imagesFinal
		String uploadPath1 = "C:/Users/Smart/eclipse-workspace2/Final/src/main/webapp/imagesFinal/"+imageFileName1;
		String uploadPath2 = "C:/Users/Smart/eclipse-workspace2/Final/src/main/webapp/imagesFinal/"+imageFileName2;
		String uploadPath3 = "C:/Users/Smart/eclipse-workspace2/Final/src/main/webapp/imagesFinal/"+imageFileName3;
		
		try {
			FileOutputStream fos1 = new FileOutputStream(uploadPath1);
			InputStream is1 = file1.getInputStream();
			
			byte[] data1 = new byte[is1.available()];
			is1.read(data1);
			fos1.write(data1);
			fos1.close();
			}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fos2 = new FileOutputStream(uploadPath2);
			InputStream is2 = file2.getInputStream();
			
			byte[] data2 = new byte[is2.available()];
			is2.read(data2);
			fos2.write(data2);
			fos2.close();
			}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileOutputStream fos3 = new FileOutputStream(uploadPath3);
			InputStream is3 = file3.getInputStream();
			
			byte[] data3 = new byte[is3.available()];
			is3.read(data3);
			fos3.write(data3);
			fos3.close();
			}catch(Exception e) {
			e.printStackTrace();
		}
		
		AddPlace add = new AddPlace(place_name,place_location,place_description,place_timing,place_famous1,place_famous2,place_famous3,place_famous4,place_famous5,imageFileName1,imageFileName2,imageFileName3);
		AdminModel model = new AdminModel();
		int i = model.createAddPlace(add);
		while(i!=0) {
			RequestDispatcher rd = request.getRequestDispatcher("addPlace.jsp");
			request.setAttribute("msg", "place added successfully");
			rd.forward(request, response);
		}
		
	}

}
