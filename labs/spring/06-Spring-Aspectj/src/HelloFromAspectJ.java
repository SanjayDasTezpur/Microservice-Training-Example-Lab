import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class HelloFromAspectJ {

  @Pointcut("execution(* test(..))")
  public void mainMethod() {}
  
  @Before("mainMethod()")
  public void beforesayHello(JoinPoint pt) {
    System.out.println("Before : Hello from AspectJ!" + pt.getTarget());
  }

  @After("mainMethod()")
  public void aftersayHello() {
    System.out.println("After : Hello from AspectJ!");
  }
  
  
  @AfterReturning("mainMethod()")
  public void afterreturnsayHello(JoinPoint pt) {
    System.out.println("AfterReturn : Hello from AspectJ!" + pt.getTarget());
  }

}