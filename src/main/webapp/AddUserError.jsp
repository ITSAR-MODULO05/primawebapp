<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="it.iftsrizzoli.webapps.domain.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VISUALIZZAZIONE DATI UTENTE</title>
<link rel="stylesheet" href="css/layout.css">
</head>
<body>
	<%
		User user = (User) request.getAttribute("user");
	%>
	<div>
		<p>Errore nell'inserimento dei dati relativi a:</p>
	</div>
	<div>
		<p>
			Nome:
			<%
			String nome = user.getNome();
			out.println(nome);
		%><br> Cognome:
			<%
			String cognome = user.getCognome();
			out.println(cognome);
		%><br> nazione:
			<%
			String nazione = user.getNazione();
			out.println(nazione);
		%><br>
		</p>
	</div>
	<div>
		<a href="./creaUtente.html">Torna alla pagina di inserimento</a>
	</div>
</body>
</html>