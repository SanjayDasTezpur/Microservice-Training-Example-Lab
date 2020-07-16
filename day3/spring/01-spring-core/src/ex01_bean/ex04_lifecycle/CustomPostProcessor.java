package ex01_bean.ex04_lifecycle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		
		
		System.out.println("lifecycle 9 - Postprocess after is called");
		return arg0;	
	
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		
		/**		System.out.println("Post process before invoked");
		System.out.println("Post process after invoked");
		 ProxyFactory factory = new ProxyFactory();
		 SimpleAroundAdvice advice = new SimpleAroundAdvice();
	    	
		 factory.setTarget(arg0);
        factory.addAdvice(advice);
        Object proxy = (Object) factory.getProxy();
        
		return proxy;
			**/
		
		System.out.println("lifecycle 5 - Postprocess pre is called");
		return arg0;
		
		
	}

}
