<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.PreparedStatement"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.estore.model.*" %>
        <%@page import="com.estore.db.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
User user = new User();
user.email = request.getParameter("txtEmail");
user.password = request.getParameter("txtPassword");

String sql = "select * from user where email=? and password=?";
DB db = new DB();

PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
preparedStatement.setString(1,user.getEmail());
preparedStatement.setString(2,user.getPassword());
ResultSet set = preparedStatement.executeQuery();
if(set!=null && set.next())
{
	user.name = set.getString("name");


%>
<h3>Thank you for Login <%= user.name %></h3>
<% } %>
</body>
</html>