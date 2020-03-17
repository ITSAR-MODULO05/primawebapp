package it.iftsrizzoli.webapps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.webapps.domain.User;
import it.iftsrizzoli.webapps.service.UserServices;
import it.iftsrizzoli.webapps.service.UserServicesImpl;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(AddUserServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddUserServlet() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = null;

		UserServices service = new UserServicesImpl();
		User user = new User(
				request.getParameter("nome"),
				request.getParameter("cognome"),
				request.getParameter("sesso"), 
				request.getParameter("anno"), 
				request.getParameter("eMail"),
				request.getParameter("nazione"));

		log.debug("Creato l'oggetto: {} ", user);
		
		
		if (service.addUser(user).isResult()) {
			dispatcher = request.getRequestDispatcher("AddUser.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("AddUserError.jsp");
		}
		request.setAttribute("user", user);
		dispatcher.forward(request, response);

	}

}
