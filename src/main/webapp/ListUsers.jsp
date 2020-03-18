<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"	import="it.iftsrizzoli.webapps.domain.User,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VISUALIZZAZIONE DATI UTENTE</title>
<link rel="stylesheet" href="css/layout.css">
</head>
<body>
	<%
		ArrayList<User> users = (ArrayList<User>) request.getSession().getAttribute("users");
	    for(User us: users){
	    	System.out.println(us.toString());
	    }
	%>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Sesso</th>
			<th>Anno di nascita</th>
			<th>E-Mail</th>
			<th>Nazione</th>
			
			
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%for(int i = 0; i < users.size();i++){
			User u = (User)users.get(i);%>
			<tr>
				<td><%=u.getId()%></td>
				<td><%=u.getNome()%></td>
				<td><%=u.getCognome()%></td>
				<td><%=u.getSesso()%></td>
				<td><%=u.getAnnoDiNascita()%></td>
				<td><%=u.geteMail()%></td>
				<td><%=u.getNazione()%></td>
				<td><a class="edit" href="editform.jsp?id=<%=u.getId()%>">Edit</a></td>
				<td><a class="delete" href="/gestioneutenti/deleteUser?id=<%=u.getId()%>">Delete</a></td>
			</tr>
			<%} %>
		
	</table>

	<div>
		<a class="navigate" href="./creaUtente.html">Torna alla pagina di inserimento</a>
	</div>
	<div>
		<a class="delete" href="./CheckoutPage.jsp">Logout</a>
	</div>
</body>
</html>