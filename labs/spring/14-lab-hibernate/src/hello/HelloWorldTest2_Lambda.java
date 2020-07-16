package hello;

import org.hibernate.Transaction;
import org.hibernate.cfg.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.*;
import java.util.function.Consumer;

import org.hibernate.collection.*;
import org.hibernate.*;





public class HelloWorldTest2_Lambda {

	public static void main(String args[])
	{
		Session session = null;

	try{
		// This step will read hibernate.cfg.xml and prepare hibernate for use
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		 session =sessions.openSession();
		 Transaction tx = session.beginTransaction();
			//Create new instance of Contact and set values in it by reading them from form object
		 	System.out.println("Retriving Record");
		 	List<Message> messages = session.createQuery("from Message as m order by m.text asc").list();
		 //	List q = session.createSQLQuery("select * from Messages").addEntity(Message.class).list();


		 
		 	
		 /*	
		 List<String> messages = session.createQuery("select m.text from Message as m order by m.text asc").list();
		 messages.forEach((m)->System.out.println("message "+m));
		 
		 	List<Objects[]> messages = session.createQuery("select m.text,m.size from Message as m order by m.text asc").list();
		 	
		 	for(Object[] m : messages)
		 	{
		 		System.out.println(m[0] + " " + m[1]);
		 	}
		 	
		 	messages.forEach((Object m[])->System.out.println(m[0]));
	
		 
		 	*/
		 	
		 	/*	
		 	
		 for(int i=0; i<messages.size(); i++)
				 System.out.println("text:"+messages.get(i).getText());
		
		 	 	
		 for(Message m: messages)
			 System.out.println("text:"+m.getText());
		
		
		 	messages.forEach(new Consumer<Message>()
			{
				public void accept(Message m)
				{
			     System.out.println("text:"+m.getText());
				}
			});
				
										 
		 	messages.forEach((Message m) -> System.out.println("text:"+m.getText()));
			
			messages.forEach(m->System.out.println("text:"+m.getText()));
			
		 
			 */
			
			
		 	
 	/*Query q2 = session.createQuery("from Message as m order by m.text asc");
		 	
		 	for(Iterator it=q2.iterate();it.hasNext();){
		 		Message message2=(Message)it.next();
		 		System.out.println("ID: " + message2.getId());
		 		System.out.println("Text: " + message2.getText());
		 	}*/
			tx.commit();
		
	}catch(Exception e){
		System.out.println(e.getMessage());
	}finally{
		// Actual contact insertion will happen at this step
		
		session.close();

		}

		
	}
}
