package demo;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main
{

   public static void main(String[] args)
      throws Exception
   {
      // Manually create the Spring Bean Factory

	  // Bean1 test = new Bean1();
     ApplicationContext factory = new ClassPathXmlApplicationContext("demo/ApplicationContext.xml");
     
     AccountBean acc= (AccountBean) factory.getBean("account");
    
     acc.disp();
   }
   
}
