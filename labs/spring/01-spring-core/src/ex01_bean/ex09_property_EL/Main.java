package ex01_bean.ex09_property_EL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main
{

   public static void main(String[] args)
      throws Exception
   {
      // Create the Application Context
      ApplicationContext factory = new ClassPathXmlApplicationContext("ex01_bean/ex09_property_EL/ApplicationContext.xml");
      
      // Retrieve the Bean
   
    //  bean1a.setNo(500);
      Bean2 bean1b = (Bean2) factory.getBean("bean2");
      System.out.println("Retrieved Bean2: " + bean1b.toString());
      
     
      
      
      
      System.out.println("Done");
   }
   
}
