package demo.config.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		if(arg0 instanceof AccountDaoInMemory) {
		System.out.println("Min Balance is 1000");
		((AccountDaoInMemory) arg0).type = "Min is 1000";
		}
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		return arg0;
	}

}
