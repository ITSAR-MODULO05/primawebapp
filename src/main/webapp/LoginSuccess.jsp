<%@ page language="java" contentType="text/html; charset=US-ASCII"    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Success Page</title>
</head>
<body>
<%
//permette l'accesso solo se esiste la sessione
String user = null;
if(session.getAttribute("user") == null){
	response.sendRedirect("login.html");
}else {
	user = (String) session.getAttribute("user");
}
String userName = null;
String sessionID = null;
Cookie[] cookies = request.getCookies();

if(cookies !=null){
	//FOR EACH
for(Cookie cookie : cookies){
	if(cookie.getName().equals("user")) userName = cookie.getValue();
	if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
}
}
%>
<h3>Ciao <%=userName %>, Login effettuata con successo. Session ID=<%=sessionID %></h3>
<br>
User=<%=user %>
<br>
<div>
<a href="creaUtente.html">Inserisci un nuovo utente</a>
</div>
<div>
<a href="CheckoutPage.jsp">Checkout</a>
</div>
<form action="LogoutServlet" method="post">
<input type="submit" value="Logout" >
</form>
</body>
</html>