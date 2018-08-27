package com.in28minutes.dao.Impl;

import com.in28minutes.Users.User;
import com.in28minutes.dao.UserDao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
		
	}

	@Override
	public User findByUserId(String userCode) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",userCode
          );
	return (User)list.get(0);
	}

	

}
