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

import it.iftsrizzoli.webapps.service.UserServicesImpl;



/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/deleteUser")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(DeleteUserServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		UserServicesImpl service = new UserServicesImpl();
		String id = request.getParameter("id");
		if (service.deleteUserById(Integer.parseInt(id)).isResult()) {
			dispatcher = request.getRequestDispatcher("/listUsers");

		} else {
			dispatcher = request.getRequestDispatcher("/listUsers");
		}
		dispatcher.forward(request, response);
	}

}
