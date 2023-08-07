package com.hiberr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update 
{

	public static void main(String[] args) 
	{
		Configuration confi = new Configuration();
		confi.configure("hibernate.cfg.xml");
		SessionFactory SessionFactory = confi.buildSessionFactory();
		Session Session = SessionFactory.openSession();
		Transaction Transaction = Session.beginTransaction();
		
		Employee1 e1 = Session.get(Employee1.class, 18);
		
		e1.setfName("niks");
		
		Session.update(e1);
		Transaction.commit();
		Session.close();
		
		System.out.println("done");
		
		
		
	}
}
