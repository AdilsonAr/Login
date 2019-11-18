<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.modelos.*" %>
<%@page import="com.dao.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String nombre=request.getParameter("nombre");
String apellido=request.getParameter("apellido");
String usuario=request.getParameter("usuario");
String pass=request.getParameter("pass");
String pais=request.getParameter("pais");
String tecnologias=request.getParameter("tecnologias");

Usuario user=new Usuario();
user.setNombre(nombre);
user.setApellido(apellido);
user.setUsuario(usuario);
user.setContrasena(pass);
user.setPais(pais);
user.setTecnologia(tecnologias);

DaoUsuario dao=new DaoUsuario();
out.println(dao.insertar(user));
%>
</body>
</html>