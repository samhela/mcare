package edu.waa.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.waa.dao.UserDao;
import edu.waa.domain.User;
import edu.waa.service.UserService;

@Service
public class userServiceImpl implements UserService {
	
	@Autowired
   UserDao userDao;
	public List<User> findAllUsers() {
		
		return userDao.findAllUsers();
	}
	public List<User> findUserByRole(String role) {
		
		return userDao.findUserByRole(role);
	}
	public void AddUser(User user) {
		
		userDao.AddUser(user);
	}

}
