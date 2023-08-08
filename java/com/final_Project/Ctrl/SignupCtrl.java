package com.final_Project.Ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.final_Project.DAO.AdminModel;
import com.final_Project.DTO.SignUp;


@WebServlet("/signup")
public class SignupCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		
		
		
		AdminModel model = new AdminModel();
		SignUp sg = new SignUp(username,name,phone,email,pwd);
		int i = model.createSignup(sg);
		
		
		while(i!=0) {
			RequestDispatcher rd = request.getRequestDispatcher("userLogin.jsp");
			request.setAttribute("msg", "account created");
			rd.forward(request, response);
		}
		
		
	}

}
