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
     
     ApplicationContext factory = new ClassPathXmlApplicationContext("ex01_bean/ex02_setter/ApplicationContext.xml");
     
   
     
     Sample sample = (Sample) factory.getBean("sample");
     System.out.println("message is:  "+sample.getMsg());
     
     System.out.println("--------------------");
     
     Sample2 sample2 = (Sample2) factory.getBean("sample2");
     System.out.println("message is:  "+sample2.getMsg());
     
   }
}
