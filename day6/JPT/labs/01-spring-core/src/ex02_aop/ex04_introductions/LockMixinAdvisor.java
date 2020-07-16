
package ex02_aop.ex04_introductions;

import org.springframework.aop.support.DefaultIntroductionAdvisor;


public class LockMixinAdvisor extends DefaultIntroductionAdvisor
{

   public LockMixinAdvisor()
   {
      super(new LockMixin(), Lockable.class);
   }
   
}
