package demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;



public class CustomPostProcessor implements BeanPostProcessor {


	
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("lifecycle step 9... AfterInitialization: "+arg1);
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("lifecycle step 5... BeforeInitialization: "+arg1);
		return arg0;
	}

}
