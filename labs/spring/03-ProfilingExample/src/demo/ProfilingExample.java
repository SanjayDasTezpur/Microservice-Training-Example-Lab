package demo;

import org.springframework.aop.framework.ProxyFactory;


public class ProfilingExample {

    public static void main(String[] args) {
    	
    	//non-proxy object
    	 WorkerBean bean = new WorkerBean();
    	 bean.doSomeWork(5);
    	 
    	 System.out.println("----------");
    	 
    	 //proxy object
    	 ProfilingInterceptor advice = new ProfilingInterceptor();
    	 ProxyFactory factory = new ProxyFactory();
         factory.setTarget(bean);
         factory.addAdvice(advice);
         factory.setInterfaces(IProxy.class);
         IProxy proxy = (IProxy)factory.getProxy();
    	proxy.doSomeWork(5);
    }
}
