<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cuentas de usuario</title>
</head>
<body>
<%
DaoUsuario dao=new DaoUsuario();
String usuario=request.getParameter("usuario");
String contrasena=request.getParameter("pass");
out.print(dao.comprobar(usuario, contrasena));
%>
</body>
</html>