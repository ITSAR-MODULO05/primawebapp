package it.iftsrizzoli.webapps.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.iftsrizzoli.webapps.domain.User;
import it.iftsrizzoli.webapps.domain.UserServiceResponse;

public class UserServicesImpl implements UserServices {

	private static Logger logger = LoggerFactory.getLogger(UserServicesImpl.class);

	private static List<User> listaUtenti = new ArrayList<>();
	static int id = 0;

	@Override
	public UserServiceResponse addUser(User user) {
		user.setId(incrementId());
		listaUtenti.add(user);
		return new UserServiceResponse(user, true);
	}

	@Override
	public List<User> getAllusers() {
		return listaUtenti;
	}

	@Override
	public UserServiceResponse updateUser(User user) {
		UserServiceResponse usr = null;

		for (int i = 0; i < listaUtenti.size(); i++) {
			User u = listaUtenti.get(i);
			if (u.getId() == user.getId()) {
				usr = new UserServiceResponse(u, true);
				listaUtenti.set(i,user);
			}
		}

		return usr;
	}

	@Override
	public UserServiceResponse deleteUserById(int id) {

		UserServiceResponse usr = null;

		for (int i = 0; i < listaUtenti.size(); i++) {
			User u = listaUtenti.get(i);
			if (u.getId() == id) {
				usr = new UserServiceResponse(u, true);
				listaUtenti.remove(i);
			}
		}

		return usr;
	}

	@Override
	public User getUserById(int id) {

		UserServiceResponse usr = null;

		for (int i = 0; i < listaUtenti.size(); i++) {
			User u = listaUtenti.get(i);
			if (u.getId() == id) {
				usr = new UserServiceResponse(u, true);

			}
		}

		return usr.getUser();
	}

	private static int incrementId() {
		id++;
		return id;
	}
}