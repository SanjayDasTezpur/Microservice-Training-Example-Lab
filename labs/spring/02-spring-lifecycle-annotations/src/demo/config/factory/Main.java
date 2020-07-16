package demo.config.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class Main 
		{
		public static void main(String[] args) throws InterruptedException{
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
			Account acc = (Account) ctx.getBean("account");
			 System.out.print(acc.getBal());
		}
	}
	
