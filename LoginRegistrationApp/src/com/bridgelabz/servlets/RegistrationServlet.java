package com.bridgelabz.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import dbutil.UpdateToDataBase;



public class RegistrationServlet extends HttpServlet {
	//public void dopost(HttpServletRequest request,HttpServletResponse response) {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("registration.html");
		UserDetails userinfo=new UserDetails ();
		String username = request.getParameter("username");
		userinfo.setUsername(username);
		String lastname=request.getParameter("lname");
		userinfo.setLastname(lastname);
		String email=request.getParameter("email");
		userinfo.setEmail(email);
		String mobileno= request.getParameter("mob");
		userinfo.setMobileno(mobileno);

		String password= request.getParameter("pwd");
		userinfo.setPassword(password);


		PrintWriter pw = response.getWriter();
		RequestDispatcher rd2 ;
		try {
			UpdateToDataBase.registration(userinfo);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		rd2=request.getRequestDispatcher("login.html"); 
		rd2.forward(request, response);
		//		rd2=request.getRequestDispatcher("registration.html");
		//		rd2.include(request, response);



	}
}



