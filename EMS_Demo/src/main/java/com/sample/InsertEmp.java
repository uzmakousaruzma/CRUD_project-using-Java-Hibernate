package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertEmp {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.buildSession();
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		Employee e=new Employee();
		e.setName("Mono");
		e.setSalary(14000);
		session.save(e);
		ts.commit();
		System.out.println("data inserted successfully!!");
	}
}
