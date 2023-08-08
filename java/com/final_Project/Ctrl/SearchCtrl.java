package com.final_Project.Ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.final_Project.DAO.AdminModel;
import com.final_Project.DTO.AddPlace;


@WebServlet("/SearchCtrl")
public class SearchCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name = request.getParameter("placeName");
		
		AdminModel model = new AdminModel();
		
		AddPlace ad = model.getSearchDetails(name);
		if (ad != null) {
			RequestDispatcher rd = request.getRequestDispatcher("search2.jsp");
			request.setAttribute("ADDPLACE", ad);
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
