<%@page import="java.util.Scanner"%>
<%@page import="java.sql.*"%>
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
	String name=(request.getParameter("name"));
	Long id=Long.parseLong(request.getParameter("id"));
	Double salary=Double.parseDouble(request.getParameter("salary"));
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Venky@256");
	PreparedStatement ps=con.prepareStatement("insert into employe values(?,?,?)");
	ps.setString(1,name);
	ps.setLong(2, id);
	ps.setDouble(3,salary);
	ps.executeUpdate();
	out.println("data insert");
%>
</body>
</html>