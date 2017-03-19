package edu.waa.service;

import java.util.List;

import edu.waa.domain.User;

public interface UserService {
	List<User>findAllUsers();
	public List<User> findUserByRole(String role);
	public void AddUser(User user);
}
