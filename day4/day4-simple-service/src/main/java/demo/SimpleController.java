package demo;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {

	@RequestMapping("/")
	public String disp() {
		return "Simple service is invoked";
	}
}
