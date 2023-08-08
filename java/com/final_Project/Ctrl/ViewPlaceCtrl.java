package com.final_Project.Ctrl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.final_Project.DAO.AdminModel;
import com.final_Project.DTO.AddPlace;



@WebServlet("/viewPlace")
public class ViewPlaceCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminModel model = new AdminModel();
		ArrayList<AddPlace> list = model.getAllPlaceDetails();
		RequestDispatcher rd = request.getRequestDispatcher("viewPlace.jsp");
		request.setAttribute("LIST",list);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
