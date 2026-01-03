package example.spring.rest.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityRestController {
	@GetMapping("/home")
	public String getGreeting() {
		return "Welcome to Spring Security";
	}
	
	@GetMapping("/regular")
	public String getRegular() {
		return "All users are doing regular work";
	}
	@GetMapping("/admin")
	public String getAdmin() {
		return "All admins are doing admin work";
	}
	
}
