package demo.mvc.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;


public interface EmployeeService {
	String hire(String name);

	String fire(String name);
}
