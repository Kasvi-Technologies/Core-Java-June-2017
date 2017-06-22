package com.samples.helloworld;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.session.factory.HibernateSessionFactory;

public class HelloWorldTest {

	/**
	 * @param args
	 */
	public void test() {
		// TODO Auto-generated method stub
		
		  try {

	            Session session = HibernateSessionFactory.getSession();
	            Transaction tx = session.beginTransaction();
	          //  tx.begin();

	            HelloWorld e = new HelloWorld();
	            e.setHelloworld_id(800);
	            e.setHelloworld_message("Hello World Message");
	            session.save(e);
	            
	            tx.commit();
	            System.out.println("Saved in HelloWorld database");
	            session.close();
	        } catch (Exception e ) {
	            e.printStackTrace();
	            
	        }
	        
	}

}
