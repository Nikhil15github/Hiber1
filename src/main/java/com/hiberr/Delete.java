package com.hiberr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete 
{

	public static void main(String[] args) 
	{
		Configuration confi = new Configuration();
		
		confi.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = confi.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee1 e1= session.get(Employee1.class, 17);
		
		session.delete(e1);
		
		transaction.commit();
		session.close();
		
		System.out.println("done");
		
		
	}
}
