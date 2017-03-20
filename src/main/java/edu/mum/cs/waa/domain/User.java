package edu.mum.cs.waa.domain;

import java.util.List;

public class User {
private String userName;
private String password;
//private String role;
private List<UserProfile> profiles;
private UserDetail userDetail;

public User(){
	
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public List<UserProfile> getProfiles() {
	return profiles;
}

public void setProfiles(List<UserProfile> profiles) {
	this.profiles = profiles;
}

public UserDetail getUserDetail() {
	return userDetail;
}

public void setUserDetail(UserDetail userDetail) {
	this.userDetail = userDetail;
}




}



