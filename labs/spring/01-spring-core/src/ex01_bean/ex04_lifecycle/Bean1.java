package ex01_bean.ex04_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean1 implements BeanNameAware, ApplicationContextAware
{
	
	
	public String beanName;
	
	public ApplicationContext context;
	
   public Bean1(String val)
   {
      m_strVal = val;
      System.out.println("lifecyle 1 ... constructor");
   }

   // Note: Init is called after property setters

   @PostConstruct
   public void start()
   {
	   System.out.println("lifecyle 6 --- @PostConstruct");
   }
   
   @PreDestroy
   public void end()
   {
	   System.out.println("end method --- @PreDestroy");
   }
   
   public void setInt(int val)
   {
      m_intVal = val;
      System.out.println("lifecyle 2... Setter injection");
   }

   public String m_strVal;
   public int m_intVal;
   
public void setBeanName(String arg0) {
	beanName = arg0;
	
	// TODO Auto-generated method stub
	
}

public void setApplicationContext(ApplicationContext arg0)
		throws BeansException {
	context=arg0;
	// TODO Auto-generated method stub
	
}
}
