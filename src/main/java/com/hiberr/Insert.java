package com.hiberr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Insert 
{

	public static void main(String[] args) 
	{
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory SessionFactory = con.buildSessionFactory();
		Session Session = SessionFactory.openSession();
		Transaction Transaction = Session.beginTransaction();
		
		Employee1 e1= new Employee1();
		Employee1 e2= new Employee1();
		Employee1 e3= new Employee1();
		
		e1.setfName("nikhil");
		e1.setlName("pawar");
		e1.setAddress("hadapsar");
		e1.setSalary(62772);
		
		e2.setfName("komal");
		e2.setlName("pawar");
		e2.setAddress("hadapsar");
		e2.setSalary(78583);
		
		e3.setfName("kajal");
		e3.setlName("pawar");
		e3.setAddress("hadapsar");
		e3.setSalary(67583);
		
		Session.save(e1);
		Session.save(e2);
		Session.save(e3);
		
		Transaction.commit();
		Session.close();
		
		System.out.println("done");
		
		
	}
	
	
	
	
	

}
	

