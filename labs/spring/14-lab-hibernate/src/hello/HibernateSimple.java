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



public class HibernateSimple {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	SessionFactory factory = (SessionFactory) new Configuration().configure().buildSessionFactory();

	Session session1 = factory.openSession();
	
	session1.beginTransaction();
	
	Message message = new Message();
	
	message.setText("laptop");;
	message.setsize(10);

	session1.save(message);
	
	session1.getTransaction().commit();
	
	//session1.flush();
	
	session1.close();
	
	
}
}
