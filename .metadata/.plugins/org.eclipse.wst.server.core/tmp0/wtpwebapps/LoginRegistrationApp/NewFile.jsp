<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5> Your response has been submitted successfully!</h5>
<h5>please login to continue.</h5>
<% session.invalidate();%>
<a href="login.html">logout</a>


</body>
</html>