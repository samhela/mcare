package edu.mum.cs.waa.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.domain.User;

@Repository
public interface UserDao extends CrudRepository<User,Long> {
	
}
