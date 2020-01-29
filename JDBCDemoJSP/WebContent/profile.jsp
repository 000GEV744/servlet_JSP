<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username = "root";
String password = "9436030916@anuj";
String url = "jdbc:mysql://localhost:3306/testimage";
String sql = "select * from users where id = 3";
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection(url, username, password);
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(sql);
rs.next();
%>
<h2>Hello <%=rs.getString(5) %> 
</h2>
First Name : <%= rs.getString(2)%><br>
Last Name : <%= rs.getString(3)%><br>
Mobile Number : <%= rs.getString(4)%><br>
</body>
</html>