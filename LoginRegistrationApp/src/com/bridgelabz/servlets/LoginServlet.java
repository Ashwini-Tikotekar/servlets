package com.bridgelabz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("login.html");
		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd1 ;
		rd1=request.getRequestDispatcher("login.html");
		rd1.include(request, response);
		pw.println("<br><br><br>");
		if (!username.isEmpty() && pwd.length()>=8) 
		{
			rd1=request.getRequestDispatcher("home.html");
			rd1.forward(request, response);
		}
		else {
			pw.println("<h4>INVALID CREDENTIALS</h4>");
//			rd1=request.getRequestDispatcher("login.html");
//			rd1.include(request, response);
		}
//		rd1=request.getRequestDispatcher("registration.html");
//		rd1.forward(request, response);
//		
		
	}
	///
	// public void doPost(HttpServletRequest request, HttpServletResponse response){
	//  String name=request.getParameter("username");
	//  System.out.println(name);
	//  String password=request.getParameter("password");
	//  System.out.println(password);
	//}
}