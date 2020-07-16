
package ex02_aop.ex01_simpleadvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;


public class SimpleAfterReturnAdvice implements AfterReturningAdvice
{
   
   public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
      throws Throwable
   {
      System.out.println("AfterReturnAdvice: Method " + method + " returned " + returnValue);
   }
   
}
