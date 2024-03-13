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
user.name = request.getParameter("txtName");
user.email = request.getParameter("txtEmail");
user.password = request.getParameter("txtPassword");
DB db = new DB();
db.createConnection();
String sql = "insert into user values(null,?,?,?)";
PreparedStatement preparedStatement = db.connection.prepareStatement(sql);
preparedStatement.setString(1,user.getName());
preparedStatement.setString(2,user.getPassword());
preparedStatement.setString(3,user.getEmail());
int result = db.executeUpdate(preparedStatement);
if(result>0)
{

%>
<h3>Thank you for registration : <%= user.getName() %> </h3>
<%} %>
</body>
</html>