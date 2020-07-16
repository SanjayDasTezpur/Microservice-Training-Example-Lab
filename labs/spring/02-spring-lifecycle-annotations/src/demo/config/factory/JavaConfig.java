package demo.config.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class JavaConfig {

	
	@Bean(name="account",initMethod="start",destroyMethod="stop")
	public Account createBean() {
		
		return new Account();
	}
	
}

