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
import com.final_Project.DTO.AddHome;

@MultipartConfig
@WebServlet("/AddHomeCtrl")
public class AddHomeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String homeName = request.getParameter("homestayName");
		String homeDescription = request.getParameter("homestayDescription");
		String homeHost = request.getParameter("homestayHost");
		String homeFood = request.getParameter("homestayFood");
		String homeFacility = request.getParameter("homestayFacility");
		String homeAttraction = request.getParameter("homestayAttraction");
		String homeExcursion = request.getParameter("homestayExcursion");
		String homeNoOfRooms = request.getParameter("homestayNoOfRooms");
		String homePrice = request.getParameter("homestayPrice");
		
		Part file  =request.getPart("homestayPhoto1");
		String imageFileName = file.getSubmittedFileName();  //get selected file name
		System.out.println("Selected image file name : "+imageFileName);
		String uploadPath = "C:/Users/Smart/eclipse-workspace2/Final/src/main/webapp/imagesFinal/"+imageFileName;
		System.out.println("Upload path : "+uploadPath);
		
		
		//file handeling code
				// uploading our selected file into folder
				try {
				FileOutputStream fos = new FileOutputStream(uploadPath);
				InputStream is = file.getInputStream();
				
				byte[] data = new byte[is.available()];
				is.read(data);
				fos.write(data);
				fos.close();
				}catch(Exception e) {
				e.printStackTrace();
			}
				
				AddHome add = new AddHome(homeName,homeDescription,homeHost,homeFood,homeFacility,homeAttraction,homeExcursion,homeNoOfRooms,homePrice,imageFileName);
				AdminModel model = new AdminModel();
				int i = model.addHome(add);
				
				while(i!=0) {
					RequestDispatcher rd = request.getRequestDispatcher("addHome.jsp");
					request.setAttribute("msg", "homestay add successfully");
					rd.forward(request, response);
				}
		
	}
	}

