<%@page import="it.iftsrizzoli.webapps.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina di benvenuto</title>
<link rel="stylesheet" href="css/layout.css">
</head>
<body>
	<%
		String userName = null;
	    String surname = null;	
	if (session.getAttribute("uname") != null) {
			userName = (String) session.getAttribute("uname");
		}else{
			userName="Sconosciuto";
		}
	if (session.getAttribute("surname") != null) {
		surname = (String) session.getAttribute("surname");
	}else{
		surname="Sconosciuto";
	}
	
	User u = (User)session.getAttribute("utente");
	%>
	<h3>Ciao <%=u.toString() %>, Login effettuata con successo. Session ID=<%=session.getId() %></h3>
<br>
<p>Nome=<%=u.getNome() %></p>
<p>cognome=<%=u.getCognome() %></p>
<br>
</body>
</html>