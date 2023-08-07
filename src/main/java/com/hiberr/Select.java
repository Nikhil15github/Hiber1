package com.hiberr;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Select 
{

	public static void main(String[] args) 
	{
			Configuration confi = new Configuration();
			
			confi.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory = confi.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Query query = session.createQuery("From Employee1");
			
			List<Employee1> list = query.list();
			System.out.println(list);
			
			for(Employee1 l:list)
			{
				System.out.println("id "+l.getId());
				System.out.println("fname "+l.getfName());
				//System.out.println("lname "+l.getlName());
				
				System.out.println("salary "+l.getSalary());
				System.out.println("address "+l.getAddress());
			}
			transaction.commit();
			session.close();
			sessionFactory.close();
			
			System.out.println("get done");
			
	}
}
