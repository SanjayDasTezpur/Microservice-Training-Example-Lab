package demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("Simple-Service")
public interface SimpleService {
	@RequestMapping("/")
	 public String disp();
}
