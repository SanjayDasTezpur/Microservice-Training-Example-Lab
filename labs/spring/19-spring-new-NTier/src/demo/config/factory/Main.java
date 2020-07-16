package demo.config.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class Main 
		{
		public static void main(String[] args) throws InterruptedException{
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
			IAccount acc = (IAccount) ctx.getBean("AccountService");
			 System.out.println(acc.getAccountInfo());
		}
	}
	
