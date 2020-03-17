package it.iftsrizzoli.webapps.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.webapps.domain.User;
import it.iftsrizzoli.webapps.service.UserServicesImpl;

/**
 * Servlet implementation class ListUsersServlet
 */
@WebServlet("/listUsers")
public class ListUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(ListUsersServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListUsersServlet() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("Nel metodo service");
		RequestDispatcher dispatcher = null;
		UserServicesImpl service = new UserServicesImpl();
		List<User> users = service.getAllusers();
		//request.setAttribute("users", users);
		HttpSession session = request.getSession();
		session.setAttribute("users", users);
		dispatcher = request.getRequestDispatcher("ListUsers.jsp");
		dispatcher.forward(request, response);
	}

}
