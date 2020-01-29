<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fun"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>		
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/testimage" user="root" password="9436030916@anuj"/>
<sql:query var="rs" dataSource="${db}">select * from users</sql:query>
<c:forEach items="${rs.rows}" var="users">
<br><c:out value="${users.first_name}"></c:out> : <c:out value="${users.last_name}"></c:out> : <c:out value="${users.mob_no}"></c:out>
</c:forEach>

<br>
<br>

<c:set value="Anuj Singh is a JAVA Trainer" var="str"> </c:set>
length of the String : <c:out value="${fun:length(str)}"></c:out><br>
String Ends with JAVA : <c:out value="${fun:endsWith(str, 'JAVA')}"></c:out><br>
String contains JAVA : <c:out value="${fun:contains(str, 'JAVA')}"></c:out><br>
String in Upper Case : <c:out value="${fun:toUpperCase(str)}"></c:out><br>
</body>
</html>