package edu.mum.cs.waa.repository;


<<<<<<< HEAD:src/main/java/edu/mum/cs/waa/dao/UserDao.java
=======

>>>>>>> origin/master:src/main/java/edu/mum/cs/waa/repository/UserDao.java
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.domain.User;

@Repository
public interface UserDao extends CrudRepository<User,Long> {
	
}


