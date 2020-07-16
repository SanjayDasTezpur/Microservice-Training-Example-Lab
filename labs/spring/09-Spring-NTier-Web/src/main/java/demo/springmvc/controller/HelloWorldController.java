package demo.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



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


	@RequestMapping(value="/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		return "welcome";
	}

}
