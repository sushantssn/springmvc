package com.in28minutes.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class loginDAO {
	
	SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory() ;
	
	Session session = sessionfactory.openSession();
	

}
