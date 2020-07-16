
package ex02_aop.ex01_simpleadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;




public class SimpleAroundAdvice implements MethodInterceptor 
{

   public Object invoke(MethodInvocation invocation) throws Throwable
   {
	   
      System.out.println("AroundAdvice: Before " + invocation);
      Object retVal = invocation.proceed();
      
      System.out.println("AroundAdvice: After " + invocation + " (return " + (retVal == null ? "void" : retVal.toString()) + ")");
      return retVal;
   }
   
}
