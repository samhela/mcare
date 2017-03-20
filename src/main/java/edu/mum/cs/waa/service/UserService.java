package edu.mum.cs.waa.service;

import java.util.List;

import edu.mum.cs.waa.domain.User;

public interface UserService {
	List<User>findAllUsers();	
	public void AddUser(User user);
	public void delete(String userName);
}
