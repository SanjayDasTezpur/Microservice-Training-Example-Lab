package demo.config.factory;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Account implements BeanNameAware , ApplicationContextAware, InitializingBean {
	float bal;
	String BeanName;
	ApplicationContext actx;
	
	public Account()
	{
		System.out.println("1. LifeCycle Instantiated..");
	}
	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
		System.out.println("2. DI Instantiated..");
	}
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		this.BeanName = arg0;
		System.out.println("3. BeanNameAware Instantiated.."+BeanName);
	}
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.actx = arg0;
		System.out.println("4. ApplicationContextAware Instantiated.."+ actx);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("6. @ PostConstruct");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("7. Initializing Bean");
	}
	
	public void start()
	{
		System.out.println("8. Initializing init Method");
	}
	public void stop()
	{
		System.out.println("stop");
	}
	
	
}
