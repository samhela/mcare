package edu.mum.cs.waa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.domain.UserDetail;

@Repository
public interface UserDetailDao extends CrudRepository<UserDetail,Long>{
	
	
}