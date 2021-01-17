package com.xworkz.sessionfoctory;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;



public class SingleSessionFactory {
	private static SessionFactory sessionFactory=null;
	static {
	    sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("SessionFactory Per DB");
		
	}
	public static SessionFactory getSessionFactory() {
		if(sessionFactory!=null) {
			return sessionFactory;
			
			
		}
		else {
			
			System.out.println("SessionFactory is not created");
	
	
	}
	          return sessionFactory;

	
	}
	
	
}
