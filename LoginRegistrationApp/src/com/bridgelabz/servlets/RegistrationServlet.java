package com.bridgelabz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	//public void dopost(HttpServletRequest request,HttpServletResponse response) {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("registration.html");
		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		String lastname=request.getParameter("lname");
		String email=request.getParameter("email");

		long mobileno= Long.parseLong(request.getParameter("mob"));

		PrintWriter pw = response.getWriter();
		RequestDispatcher rd2 ;
//		if(!username.isEmpty() && !lastname.isEmpty() && mobileno==10)
//		{
//			rd2=request.getRequestDispatcher("logout.html");
//			rd2.forward(request, response);
//		}
//		else {			
//			pw.println("<h4>INVALID CREDENTIALS</h4>");
//		}


		rd2=request.getRequestDispatcher("registration.html");
		rd2.include(request, response);
   	rd2=request.getRequestDispatcher("login.html");
		rd2.forward(request, response);


	}
}
//}

//		String name=request.getParameter("username");
//		System.out.println(name);
//		String password=request.getParameter("pwd");
//		System.out.println(password);
//		String lastname=request.getParameter("lname");
//		System.out.println(lastname);
//		String email=request.getParameter("email");
//		System.out.println(email);
//		String address=request.getParameter("add");
//		System.out.println(address);
//		long mobileno= Long.parseLong(request.getParameter("mob"));
//		System.out.println(mobileno);
//		long postcode=Long.parseLong(request.getParameter("ptc"));
//		System.out.println(postcode);
//		

