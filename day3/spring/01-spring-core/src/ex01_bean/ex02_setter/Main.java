package ex01_bean.ex02_setter;

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
     ApplicationContext factory = new ClassPathXmlApplicationContext("ex01_bean/ex02_setter/ApplicationContext.xml");
     
      // Now, retrieve the property values set via the setXXX methods on
      // instantiation of the JavaBean by the Spring Bean Factory
      Bean1 bean1a = (Bean1) factory.getBean("bean1");
      
      Bean1 bean1b = (Bean1) factory.getBean("bean2");
      
      
      System.out.println("Retrieved Bean1: " + bean1a.toString());
      System.out.println("String property: " + bean1a.getName());
      System.out.println("Int property: " + bean1a.getNo());
      System.out.println("List property: " + bean1a.getHobbies());
      
    
      
   }
   
}
