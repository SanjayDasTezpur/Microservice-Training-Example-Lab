package demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		if(arg1.equals("account"))
		System.out.println("9. postProcessAfterInitialization Instantiated..");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		if(arg1.equals("account"))
		System.out.println("5. postProcessBeforeInitialization Instantiated..");
		return arg0;
	}

}
