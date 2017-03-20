package edu.mum.cs.waa.service.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.waa.dao.UserDetailDao;
import edu.mum.cs.waa.domain.UserDetail;
import edu.mum.cs.waa.service.UserDetailService;
@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailService {
       @Autowired
	  UserDetailDao userDetailDao;
       
	@Override
	public List<UserDetail> findAllUserDetails() {
		
		return (List<UserDetail>)userDetailDao.findAll();

	}

	@Override
	public void saveUserDetail(UserDetail userDetail) {
		userDetailDao.save(userDetail);

	}

	@Override
	public void deleteUserDetails(Long id) {
		userDetailDao.delete(id);

	}

}
