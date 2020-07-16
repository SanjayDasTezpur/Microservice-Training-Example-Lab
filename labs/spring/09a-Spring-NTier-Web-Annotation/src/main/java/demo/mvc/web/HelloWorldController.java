package demo.mvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.mvc.service.EmployeeService;



@Controller
@RequestMapping("/")
public class HelloWorldController {

	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		
		//HelloService service = new HelloServiceImpl();
		
		String name = "Tom";
	
		String message = employeeService.hire(name);

		model.addAttribute("greeting", message);
		return "welcome";
	}




}
