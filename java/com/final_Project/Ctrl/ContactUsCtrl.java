package com.final_Project.Ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.final_Project.DAO.AdminModel;
import com.final_Project.DTO.ContactUs;


@WebServlet("/ContactUsCtrl")
public class ContactUsCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("email");
		String subject1 = request.getParameter("subject1");
		String message = request.getParameter("message");
				
		AdminModel model = new AdminModel();
		ContactUs cu = new ContactUs(name,phoneNumber,email,subject1,message);
		int i = model.createContactUs(cu);
		

		while(i!=0) {
			
			RequestDispatcher rd = request.getRequestDispatcher("IndexCtrl");
			request.setAttribute("msg", "Message Sent Successfully");
			rd.forward(request, response);
		}
		
		
		
	}

}
