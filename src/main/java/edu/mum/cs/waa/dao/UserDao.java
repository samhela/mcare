package edu.mum.cs.waa.dao;

import java.util.List;

import edu.mum.cs.waa.domain.User;

public interface UserDao {
	public List<User>findAllUsers();
	public List<User> findUserByRole(String role);
 public void AddUser(User user);
}
