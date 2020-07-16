package hello;

import java.sql.SQLException;


import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;



public class HibernateSimple_update {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	SessionFactory factory = (SessionFactory) new Configuration().configure().buildSessionFactory();

	Session session1 = factory.openSession();
	
	Session session2 = factory.openSession();
	
	
	//session1.beginTransaction();
	
	Message message1 = (Message) session1.get(Message.class, 1L);
	
	
	Message message2 = (Message) session2.get(Message.class, 1L);
	
	
	
	if(message1 == message2)
		System.out.println("Both are same");
	else
		System.out.println("Both are different");
	
	
	//message1.setText("Desktop");
	
	//session1.getTransaction().commit();
	
	//session1.flush();
	
	session1.close();
	session2.close();
	
	
	
	
}
}
