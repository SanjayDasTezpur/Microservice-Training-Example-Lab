package demo.config.factory;

import javax.annotation.PostConstruct;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Repository;

@Repository("AccountDao")
public class AccountDaoInMemory implements IAccountDao {
	String type ;

	public String getData() {
		return type;
	}

	@PostConstruct
	public void init() {
		type = "Saving Account";
	}

}
