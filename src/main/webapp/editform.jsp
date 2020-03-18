<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"	import="it.iftsrizzoli.webapps.domain.User,it.iftsrizzoli.webapps.service.UserServicesImpl,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MODIFICA UTENTE</title>
<link rel="stylesheet" href="css/layout.css">
</head>
<%String id=request.getParameter("id");
UserServicesImpl usi = new UserServicesImpl();
User u = usi.getUserById(Integer.parseInt(id));
%> 
<body>
	<div id="main">
		<form method="POST" action="/esempiowebapp/editUser"	enctype="application/x-www-form-urlencoded" autocomplete="on">
		<div>
		<input type="hidden" name="id" value="<%=u.getId() %>"/> 
		</div>
			<div class="row">
				<div class="col-25">
					<label for="fname">Nome</label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" size="40" maxlength="40" name="nome" value=<%=u.getNome() %>
						placeholder="Nome.." required>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="lname">Cognome</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" size="40" maxlength="40"
						name="cognome" value=<%=u.getCognome() %> placeholder="Cognome.." required>
				</div>
			</div>
			<div class="row">
				<input type="radio" id="male" name="sesso"  value=<%=u.getSesso() %>  required> 
				<label for="male">Maschio</label><br> 
				<input type="radio" id="female"	name="sesso" value="femmina"> 
				<label for="female">Femmina</label><br>
				<input type="radio" id="other" name="sesso" value="altro">
				<label for="other">Altro</label>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="anno">Anno di nascita</label>
				</div>
				<div class="col-75">
					<input type="date" id="anno" size="40" maxlength="40"
						name="anno"   value=<%=u.getAnnoDiNascita() %>   placeholder="Anno di nascita.." required/>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="eMail">e-mail</label>
				</div>
				<div class="col-75">
					<input type="email" id="eMail" size="40" maxlength="40"
						name="eMail" value=<%=u.geteMail() %> placeholder="e-Mail.." required/>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="nazione">Nazione</label>
				</div>
				<div class="col-75">
				<label for="nazione">Inserisci la nazione:</label>
					<input type="text" id="nazione" size="40" maxlength="40"
						name="nazione" value=<%=u.getNazione() %> placeholder="Nazione.." required/>
				</div>
			</div>
			<input type="SUBMIT" value="modifica">
		</form>
	</div>
	<div>
		<a class="navigate" href="./index.html">Torna alla pagina principale</a>
	</div>
</body>
</html>