package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbutil.GetUserData;
import dbutil.UpdateToDataBase;
import model.UserDetails;

public class RegistrationServlet extends HttpServlet {
	//public void dopost(HttpServletRequest request,HttpServletResponse response) {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("registration.html");
		UserDetails userInfo=new UserDetails();
		String username = request.getParameter("username");
		userInfo.setUsername(username);
		String pwd = request.getParameter("password");
		userInfo.setPassword(pwd);
		String lastname=request.getParameter("lname");
		userInfo.setLastname(lastname);
		String email=request.getParameter("email");
		userInfo.setEmail(email);
		//long mobileno= Long.parseLong(request.getParameter("mobileno"));
		userInfo.setMobileno(request.getParameter("mobileno"));
	//	PrintWriter pw = response.getWriter();
		RequestDispatcher rd2 ;
		
		try {
			UpdateToDataBase.registration(userInfo);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  rd2=request.getRequestDispatcher("login.html"); 
		  rd2.forward(request, response);
//		 


	}
}
	

