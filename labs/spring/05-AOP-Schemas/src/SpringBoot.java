import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBoot {

public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
      "applicationcontext.xml");
    HelloService service = (HelloService) context.getBean("helloService");
    
    HelloService1  service1 = (HelloService1) context.getBean("helloService1");
    
    service.test();
    
    service1.test2();
    
    
  }
}