package com.bridgelabz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("logout.html");
		Cookie[] cookies = req.getCookies();
		if(cookies != null){
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("JSESSIONID")){
					System.out.println("JSESSIONID="+cookie.getValue());
					break;
				}
			}
		}
		//invalidate the session if exists
		HttpSession session = req.getSession(false);
		System.out.println("User="+session.getAttribute("user"));
		if(session != null){
			session.invalidate();
		}
		resp.sendRedirect("login.html");
	}


	//		PrintWriter pw = resp.getWriter();
	//		RequestDispatcher rd2 ;
	//		rd2=req.getRequestDispatcher("/login.html");
	//		rd2.forward(req, resp);
}

