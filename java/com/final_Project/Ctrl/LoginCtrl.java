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
import com.final_Project.DTO.SignUp;

@WebServlet("/login")
public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("username");
		String pwd = request.getParameter("password");

		AdminModel model = new AdminModel();
		ArrayList<AddPlace> list = model.getAllPlaceDetails();


		SignUp sg = new SignUp(user, pwd);
		int i = model.createLogin(sg);

		if (i != 0) {
			//response.sendRedirect("IndexCtrl");
			RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
			request.setAttribute("uu", user);
			request.setAttribute("LIST", list);
			rs.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("userLogin.jsp");
			request.setAttribute("invalid_msg", "invalid username or password");
			request.setAttribute("LIST", list);
			rd.forward(request, response);
		}
	}

}
