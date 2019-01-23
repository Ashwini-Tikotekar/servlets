package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("logout.html");
	
		PrintWriter pw = resp.getWriter();
		RequestDispatcher rd2 ;
		rd2=req.getRequestDispatcher("/login.html");
		rd2.forward(req, resp);
}
}
