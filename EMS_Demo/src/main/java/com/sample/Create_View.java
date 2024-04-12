package com.sample;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Create_View {
	public static void main(String[] args) {
		//session factory
		SessionFactory sf=HibernateUtil.buildSession();
		//open session
	
		Session session=sf.openSession();
		@SuppressWarnings("unchecked")
		List<Employee> emp=session.createQuery("from Employee").list();
		if(emp!=null && emp.size()>0) {
			for(Employee e:emp) {
				
					
					System.out.println("ID: "+e.getId()+" Name: "+e.getName()+" Salary: "+e.getSalary()*2);
				
			}
		}else {
		System.out.println("table is created");
		}
	}
}
