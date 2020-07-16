package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

	@Autowired
	SimpleService simple;
	
	@RequestMapping("/")
	public String disp()
	{
		return simple.disp() + "Using Feign Client";
	}
}
