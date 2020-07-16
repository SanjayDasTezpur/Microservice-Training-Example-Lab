import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBoot {

	  public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext(
	      "applicationcontext.xml");
	    HelloService service = (HelloService) context.getBean("helloService");
	    service.test();
	  }

	}