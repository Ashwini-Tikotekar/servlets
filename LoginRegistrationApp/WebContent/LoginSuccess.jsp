<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.bridgelabz.servlets.UserDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>You are on Home page</h1>
Hi  <br>
<%
String name=request.getParameter("name");
out.println("Welcome : ");
UserDetails isUserPresent=(UserDetails)session.getAttribute("user");
String userName = null;
Cookie[] cookies = request.getCookies();
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("user"))
            userName = cookie.getValue();
    }
%>
<br>Login Successful<br>
       <%out.println("User Name= "+isUserPresent.getUsername());%> <br>
        <%out.println("User Password= "+isUserPresent.getPassword());%> <br>
        <%out.println("User Email= "+isUserPresent.getEmail());%> <br>
       <%out.println("User PhoneNum= "+isUserPresent.getMobileno());%> <br>
       <%out.println("Session ID= "+session.getId());%> <br>
         <%out.println("last name= "+isUserPresent.getLastname());%> <br>
        <%   isUserPresent=null ; %> 
<a href=NewFile.jsp>Sign Out</a><br>

</body>
</html>



</body>
</html>