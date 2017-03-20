package edu.mum.cs.waa.service;

import java.util.List;

import edu.mum.cs.waa.domain.UserDetail;

public interface UserDetailService {
	
	public List<UserDetail> findAllUserDetails();
	public void saveUserDetail(UserDetail userDetail);
	public void deleteUserDetails(Long id);

}
