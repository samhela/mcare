package edu.mum.cs.waa.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.dao.UserDao;
import edu.mum.cs.waa.domain.User;
@Repository
public class UserDaoImpl{
	@Autowired
	EntityManager entityManager;
	
	
  
	

	public List<User> findAllUsers() {
		return null;
	}

	
	

	public void AddUser(User user) {
		

	}




	

}
