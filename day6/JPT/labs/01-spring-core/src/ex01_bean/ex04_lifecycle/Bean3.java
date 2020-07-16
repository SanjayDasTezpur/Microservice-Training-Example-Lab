package ex01_bean.ex04_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean3
{
	
	

public Bean3(String val)
   {
      m_strVal = val;
   }

   // Note: Init is called after property setters

  
   public void start()
   {
	   System.out.println("start method --- @PostConstruct");
   }
   
 
   public void end()
   {
	   System.out.println("end method --- @PreDestroy");
   }
   
   public void setInt(int val)
   {
      m_intVal = val;
   }

   public String m_strVal;
   private int m_intVal;
}
