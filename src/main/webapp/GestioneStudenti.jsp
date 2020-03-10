<%@page import="it.iftsrizzoli.webapps.domain.Studente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAGINA DI GESTIONE STUDENTI</title>
<link rel="stylesheet" href="css/studenti.css">
</head>
<body>
	<%
	
	Studente s = (Studente)session.getAttribute("studente");
	%>
	<h3>I dati dello studente sono: <%=s.toString() %> 
	<br>
	Session ID=<%=session.getId() %></h3><br>
<p>Nome=<%=s.getNome() %></p>
<p>cognome=<%=s.getCognome() %></p>
<p>matricola=<%=s.getMatricola() %></p>
<br>
</body>
</html>