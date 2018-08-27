package com.in28minutes.dao;

import com.in28minutes.Users.User;

public interface UserDao {
	
	
		
		void save(User user);
		void update(User user);
		void delete(User user);
		User findByUserId(String userCode);

	

}
