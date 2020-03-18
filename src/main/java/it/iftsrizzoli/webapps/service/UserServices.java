package it.iftsrizzoli.webapps.service;

import java.util.List;

import it.iftsrizzoli.webapps.domain.User;
import it.iftsrizzoli.webapps.domain.UserServiceResponse;
//Serve per implementare il pattern DAO (Data Access Object)
//dichiara le operazioni fondamentali sui dati: CRUD (Create Read Update Delete)
public interface UserServices {

	public UserServiceResponse addUser(User user);

	public List<User> getAllusers();

	public UserServiceResponse updateUser(User user);

	public UserServiceResponse deleteUserById(int id);

	public User getUserById(int id);

}
