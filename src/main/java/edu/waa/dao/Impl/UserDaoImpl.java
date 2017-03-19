package edu.waa.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import edu.waa.dao.UserDao;
import edu.waa.domain.User;
@Repository
public class UserDaoImpl implements UserDao {
	
	private List<User> listOfUser = new ArrayList<User>();
	
	
   public	UserDaoImpl(){
	   
	   User user1=new User("Amanuel","amanuel","ROLE_ADMIN");
	   User user2=new User("Samuel","samuel","ROLE_USER");
	   User user3=new User("Frew","frew","ROLE_USER");
	   User user4=new User("Netsanet","netsanet","ROLE_ADMIN");
	   User user5=new User("Admin","admin","ROLE_ADMIN");
	   
	   listOfUser.add(user1);
	   listOfUser.add(user2);
	   listOfUser.add(user3);
	   listOfUser.add(user4);
	   listOfUser.add(user5);
   }
	
   
	

	public List<User> findAllUsers() {
		return listOfUser;
	}

	/*public List<User> findUserByRole(String role) {
		List<User> role_user=new ArrayList<User>();
		for(User u:listOfUser){
			if(u.getRole().equalsIgnoreCase(role))
			{
				role_user.add(u);
			}
		}
		return role_user;
	}
*/
	public void AddUser(User user) {
		listOfUser.add(user);

	}




	@Override
	public List<User> findUserByRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}

}
