package example.spring.rest.controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.bean.GreetingMessage;
@RestController
public class SpringRestController {
	@GetMapping("/doGreet")
	public String getGreeting() {
		return "Wishing you all a Merry Christmas";
	}	
	
	@GetMapping("/doMessage")
	public GreetingMessage getMessage() {
		GreetingMessage gm = 
			new GreetingMessage(
					"Merry Christmas",LocalDate.now());
		return gm;
	}
	
	@GetMapping("/doMessages")
	public List<GreetingMessage> getMessages(){
		GreetingMessage gm = new GreetingMessage(
						"Merry Christmas",LocalDate.now());
		GreetingMessage gm2 = 
		new GreetingMessage(
		"Happy Year End",LocalDate.of(2025,12,31));
		List<GreetingMessage> messages =
				List.of(gm, gm2);
		return messages;
	}
}









