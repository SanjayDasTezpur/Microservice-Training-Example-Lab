package ex01_bean.ex03_constructor;

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

     ApplicationContext factory = new ClassPathXmlApplicationContext("ex01_bean/ex03_constructor/ApplicationContext.xml");
     
      // Now, retrieve the property values set via the setXXX methods on
      // instantiation of the JavaBean by the Spring Bean Factory
      Bean1 bean1 = (Bean1) factory.getBean("bean1");
      
       
      
      
      System.out.println("Retrieved Bean1: " + bean1.toString());
      System.out.println("String property: " + bean1.getName());
      System.out.println("Int property: " + bean1.getNo());
      System.out.println("List property: " + bean1.getHobbies());
      
   
      
   }
   
}
