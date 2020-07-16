package demo.mvc.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Repository;

@Repository("dao1")
@ManagedResource(objectName = "EmployeeDao:type=JMX,name=cache")
public class EmployeeDaoImpl implements EmployeeDao {

	
	//@Resource
	//ApplicationContext ctx;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@PostConstruct
	public void initialize() {
		//System.out.println("##############");
		//System.out.println(ctx.getBeanDefinitionCount());
		
		System.out.println("************ EmployeeDaoImpl******");
		jdbcTemplate
				.update("create table if not exists messages (messagekey varchar(20), message varchar(100))");
		jdbcTemplate
				.update("insert into messages (messagekey, message) values ('Hire', 'Congrats! You are hired')");
		jdbcTemplate
				.update("insert into messages (messagekey, message) values ('Fire', 'Sorry! You are fired')");
	}

	@PreDestroy
	public void remove() {
		jdbcTemplate.update("drop table messages");
	}



	public String getMessage(String messageKey) {
		
			return jdbcTemplate.queryForObject(
				"select message from messages where messagekey = ?",
				String.class, messageKey);
	}

@ManagedOperation
	public void clearCache()
	{
		System.out.println("cache is cleared");
	}
}
