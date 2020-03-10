<%@page import="it.iftsrizzoli.webapps.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAGINA DI GESTIONE UTENTI</title>
<link rel="stylesheet" href="css/utenti.css">
</head>
<body>
	<%
	User u = (User)session.getAttribute("utente");
	%>
	<h3>I dati dell'utente sono: <%=u.toString() %> 
	<br>
	Session ID=<%=session.getId() %></h3>
<br>
<p>Nome=<%=u.getNome() %></p>
<p>cognome=<%=u.getCognome() %></p>
<br>
</body>
</html>