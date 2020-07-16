package hello;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.FlushMode;

import com.mysql.jdbc.Connection;

public class HelloWorldTest {

	private static SessionFactory sessionFactory;
	
	public static void main(String args[])
	{
		Session session = null;

	try{
		
		
		// This step will read hibernate.cfg.xml and prepare hibernate for use
		  Configuration configuration = new Configuration().configure();
          ServiceRegistry serviceRegistry
              = new StandardServiceRegistryBuilder()
                  .applySettings(configuration.getProperties()).build();
           
          // builds a session factory from the service registry
		
          sessionFactory = configuration.buildSessionFactory(serviceRegistry);            
		
		
		/* for hibernate.properties file use the below 
		SessionFactory sessions2 = new Configuration()
		                          .addClass(Message.class)
		                          .setProperties(System.getProperties())
		                          .buildSessionFactory(); 
		
		*/
		
	//Session session2 =(Session) sessions.openStatelessSession();
		
	//	SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		session =sessionFactory.openSession();
		 
		 
	
		
		 
		
		//Transaction tx = session.beginTransaction();
			//Create new instance of Contact and set values in it by reading them from form object
			System.out.println("Inserting Record");
		Message message = new Message();
		message.setText("abc");
		message.setsize(10);
			
	session.save(message);

	//session.connection().setAutoCommit(true);
			// session.setFlushMode(FlushMode.AUTO/ FlushMode.COMMIT/FlushMode.NEVER/FlushMode.ALWAYS);
		
	session.doWork(
			new Work()
		{
		public void execute(java.sql.Connection connection) throws SQLException {
			connection.setAutoCommit(true); 	
		} } );
	
			session.flush();
			
			// java8 syntax....   session.doWork(connection -> setAutoCommit(true));
			
	//	session.setFlushMode(FlushMode.AUTO);
		
	//	 Message m1 = (Message) session.get(Message.class,1L);
		
		 
	// m1.setText("ok2");
	    
//Message m2 = (Message) session.get(Message.class,1L);
	
	// List messages = session.createQuery("from Message2 where id=2L").list();
	 
		// if(m1==m2) System.out.println("Both are same");
		
		
	 //session.evict(m1);
	 
	//	session.flush();
		// tx.commit();
			
			session.close();
			
			
			}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	
		
	}
}
