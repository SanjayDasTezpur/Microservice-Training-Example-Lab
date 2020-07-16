package hello;

import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
import org.hibernate.collection.*;
import org.hibernate.*;



public class HelloWorldTest3 {

	public static void main(String args[])
	{
		Session session = null;

	try{
		// This step will read hibernate.cfg.xml and prepare hibernate for use
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		 session =sessions.openSession();
		session.getTransaction().begin();
		 Message m1 = (Message) session.load(Message.class, 1L);
		
		//Hibernate.initialize(m1);
		 session.close();
		 System.out.println(m1.getText());
		
		
		session.getTransaction().commit();
		//session.flush();
		
		//m1.setText("God");
		
	}catch(Exception e){
		System.out.println(e.getMessage());
	}finally{
		// Actual contact insertion will happen at this step
		
	//	session.close();

		}

		
	}
}
