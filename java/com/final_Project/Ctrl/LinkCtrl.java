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


@WebServlet("/LinkCtrl")
public class LinkCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		AdminModel model = new AdminModel();
		AddPlace ad = model.getPlaceDetails(id);
		
		if (ad != null) {
			RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
			request.setAttribute("ADDPLACE", ad);
			rd.forward(request, response);
		}
		
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
