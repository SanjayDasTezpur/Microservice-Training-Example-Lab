package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Account implements BeanNameAware,ApplicationContextAware,InitializingBean {

	String BeanName;
	ApplicationContext ctx;
	
	public Account()
	{
		System.out.println("lifecycle step 1.. instantiate");
	}
	
	float bal=1000;

	@PostConstruct
	public void init()
	{
		System.out.println("lifecycle step 6... @PostConstruct");
	}
	
	public void begin()
	{
		System.out.println("lifecycle step 8 ... custom init method");
	}
	
	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		System.out.println("lifecycle step 2.. DI");
		this.bal = bal;
	}

	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("lifecycle step 3.. BeanNameAware");
		BeanName=arg0;
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("lifecycle step 4.. ApplicationContextAware");
		ctx = arg0;
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("lifecycle step 7... InitialzingBean");
	}
	
	
}
