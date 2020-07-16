package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
public class OtherController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	@HystrixCommand(fallbackMethod = "reliable") 
	public String display()
	{
		String msg = restTemplate.getForObject("http://Simple-Service", String.class);
		return msg + " Call from other service";
	}
	public String reliable() {
	    return "Simple service is down";
	  }

}
