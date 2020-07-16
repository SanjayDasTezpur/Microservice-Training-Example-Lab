
package ex02_aop.ex01_simpleadvice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


public class SimpleBeforeAdvice implements MethodBeforeAdvice
{
   
   public void before(Method method, Object[] args, Object target)
      throws Throwable
   {
      System.out.println("BeforeAdvice: Before " + method);
   }
   
}
