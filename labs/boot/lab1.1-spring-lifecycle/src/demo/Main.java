package demo;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main
{

   public static void main(String[] args)
      throws Exception
   {
	   
	 
   
     ApplicationContext factory = new ClassPathXmlApplicationContext("demo/ApplicationContext.xml");
     
    Account acc= (Account) factory.getBean("account");
    
     System.out.println("Balance is "+acc.getBal());
     
     Customer cust = (Customer) factory.getBean("customer");
   }
   
}
