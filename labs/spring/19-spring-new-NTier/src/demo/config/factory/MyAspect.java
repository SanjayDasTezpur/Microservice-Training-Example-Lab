package demo.config.factory;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
// @Component
public class MyAspect {
		    
	  @AfterReturning("execution(* *(..))")
	  public void afterreturnsayHello(JoinPoint pt) {
	    System.out.println("After Running" + pt.getTarget());
	  }
	  @Before("execution(* *(..))")
	  public void beforesayHello(JoinPoint pt) {
	    System.out.println("Before Running" + pt.getTarget());
	  }


}
