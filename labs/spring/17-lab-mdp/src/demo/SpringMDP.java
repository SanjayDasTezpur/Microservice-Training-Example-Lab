package demo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class SpringMDP implements MessageListener 
{
	public void onMessage(Message message) 
{ try
{   
	System.out.println(((TextMessage) message).getText());
} 
catch (JMSException ex)
{   throw new RuntimeException(ex); 

}
}
}
