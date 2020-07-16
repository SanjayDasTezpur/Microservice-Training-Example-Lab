package ex01_bean.ex04_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Bean2 implements InitializingBean, DisposableBean
{
	

public Bean2(String val)
   {
      m_strVal = val;
   }

   public void setInt(int val)
   {
	   System.out.println("el value : "+m_intVal);
      m_intVal = val;
   }
   
   /**
    * Implement InitializingBean callback method
    * 
    */
   

 
   
   public void afterPropertiesSet() throws Exception
   {
      System.out.println("Init callback called on " + this.toString() + " - String Property value: " + m_strVal);
   }

   /**
    * Implement DisposableBean callback method
    */
   public void destroy() throws Exception
   {
      System.out.println("Destroy callback called on " + this.toString());
   }


   public String m_strVal;
   private int m_intVal;
   
}
