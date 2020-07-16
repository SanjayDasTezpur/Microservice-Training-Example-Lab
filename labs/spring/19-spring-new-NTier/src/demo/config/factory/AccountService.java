package demo.config.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AccountService")
public class AccountService implements IAccount{

	@Autowired
	IAccountDao accountDao;
	public String getAccountInfo() {
		
		return accountDao.getData();
	}

}
