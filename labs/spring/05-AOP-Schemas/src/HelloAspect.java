


public class HelloAspect {

	
	  public void beforesayHello()
	{
		System.out.println("Hello from Spring AOP before!");
	}

	  public void aftersayHello() {
		    System.out.println("Hello from Spring AOP after!");
		  }
	  
	  public void afterreturnsayHello() {
	    System.out.println("Hello from Spring AOP after return!");
	  }
}
