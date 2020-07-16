package demo.mvc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:jdbc.properties")
@EnableMBeanExport
public class SpringJDBCConfiguration {

	 @Value("${jdbc.driver}")
	 private String driverClassName;
	 @Value("${jdbc.url}")
	 private String jdbcURL;
	 @Value("${jdbc.username}")
	 private String username;
	 @Value("${jdbc.password}")
	 private String password;	
	 
	 
	 @Bean
	 public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        
		    dataSource.setDriverClassName(driverClassName);
		    dataSource.setUrl(jdbcURL);
		    dataSource.setUsername(username);
		    dataSource.setPassword(password);
		    return dataSource;
	 }
	 
	
	 
	 
	 @Bean
	 public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	 }	
	 
	    @Bean
	    public JdbcTemplate jdbcTemplate() {
	        JdbcTemplate jdbcTemplate = new JdbcTemplate();
	        jdbcTemplate.setDataSource(dataSource());
	        return jdbcTemplate;
	    }
	    
}
