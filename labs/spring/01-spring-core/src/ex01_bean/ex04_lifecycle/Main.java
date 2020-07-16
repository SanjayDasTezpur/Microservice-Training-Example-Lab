package ex01_bean.ex04_lifecycle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main
{

   public static void main(String[] args)
      throws Exception
   {
	  
	  // ApplicationContext factory = new ClassPathXmlApplicationContext("ex01_bean/ex04_lifecycle/ApplicationContext.xml");
	   AbstractApplicationContext factory
	   = new ClassPathXmlApplicationContext("ex01_bean/ex04_lifecycle/ApplicationContext.xml");
	   

      // Retrieve the Beans 
      Bean1 bean1a = (Bean1) factory.getBean("bean1");
      System.out.println("Retrieved Bean1: " + bean1a.m_strVal);
     
      System.out.println("My name " + bean1a.beanName);
      
       Bean2 bean2a = (Bean2) factory.getBean("bean2");
      System.out.println("Retrieved Bean2: " + bean2a.m_strVal);
      /*
      Bean3 bean3a = (Bean3) factory.getBean("bean3");
      System.out.println("Retrieved Bean3: " + bean3a.m_strVal);*/
      
      System.out.println("################");
      
      Account acc=(Account) factory.getBean("account");
      acc.deposit(5000);
      
 factory.registerShutdownHook();
   //   factory.destroySingletons();
      
      System.out.println("Done");
   }
   
}
