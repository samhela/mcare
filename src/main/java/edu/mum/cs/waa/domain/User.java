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
public User(String userName,String password,String role){
	this.userName=userName;
	this.password=password;
	// this.role
}




}



