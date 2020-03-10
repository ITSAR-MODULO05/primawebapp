package it.iftsrizzoli.webapps.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.webapps.domain.Studente;
import it.iftsrizzoli.webapps.domain.User;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/test")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(FirstServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.debug("Nel metodo service");
		Studente s = null;
		User u = null;
		boolean a = false;
		String tipo = request.getParameter("tipo");

		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		if (tipo != null && !tipo.equalsIgnoreCase("") && tipo.equalsIgnoreCase("s")) {

			String matricola = request.getParameter("matricola");
			a = true;
			s = new Studente();
			s.setNome(nome);
			s.setCognome(cognome);
			s.setMatricola(matricola);

		} else {
			u = new User();

			u.setNome(nome);
			u.setCognome(cognome);
		}

		Cookie firstName = new Cookie("first_name", nome);

		firstName.setHttpOnly(true);

		Cookie lastName = new Cookie("last_name", cognome);

		lastName.setHttpOnly(true);

		firstName.setMaxAge(60 * 60 * 24);
		lastName.setMaxAge(60 * 60 * 24);

		response.addCookie(firstName);
		response.addCookie(lastName);

		logger.debug("Nel metodo service i parametri passati sono: {} {} ", nome, cognome);

		try {
			HttpSession session = request.getSession();
			if (a) {
				session.setAttribute("studente", s);
				response.sendRedirect(request.getContextPath() + "/GestioneStudenti.jsp");
			} else {
				session.setAttribute("utente", u);
				response.sendRedirect(request.getContextPath() + "/GestioneUtenti.jsp");
			}

		} catch (Exception e) {
			logger.error("Errore {}", e);
		}

	}

}
