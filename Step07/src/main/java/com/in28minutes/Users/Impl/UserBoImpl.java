package com.in28minutes.Users.Impl;

import com.in28minutes.Users.User;
import com.in28minutes.Users.bo.UserBo;
import com.in28minutes.dao.UserDao;

public class UserBoImpl implements UserBo{
		
	UserDao userDao;
		
		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}

		public void save(User user){
			userDao.save(user);
		}
		
		public void update(User user){
			userDao.update(user);
		}
		
		public void delete(User user){
			userDao.delete(user);
		}
		
		public User findByUserId(String userCode){
			return userDao.findByUserId(userCode);
		}
	

}
