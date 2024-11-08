<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String s1=request.getParameter("s1");
	String s2=request.getParameter("s2");
	out.print(s1+" "+s2);
%>
</body>
</html>