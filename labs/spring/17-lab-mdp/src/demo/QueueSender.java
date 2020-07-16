package demo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class QueueSender 

{

private JmsTemplate jmsTemplate;

public void setJmsTemplate(JmsTemplate jmsTemplate) 
{
this.jmsTemplate = jmsTemplate;
}
public void sendMesage()

{
jmsTemplate.send("jms/queue/test", new MessageCreator()
    {
	    public Message createMessage(Session session) throws JMSException
         {  
      return session.createTextMessage("Hello");   
        } 
   } );
}
}