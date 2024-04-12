package com.sample;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sessionFactory=null;
	public static SessionFactory buildSession() {
		if(sessionFactory!=null) {
			sessionFactory=null;
		}
		Configuration cfg=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class);
				
		sessionFactory=cfg.buildSessionFactory();
		return sessionFactory;
		
	}
	
	
}
