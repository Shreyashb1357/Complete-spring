package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import example.spring.mvc.model.BmiCalculator;
import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;


@Controller //Marks this class as a controller implementation class
public class SpringMvcController {
	@GetMapping("/home")
	public String getHomePage() { 
		System.out.println("Request Received.");
		return "home";//View Name
	}
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	/*@RequestMapping(value="/validate", method = RequestMethod.POST)
	public String getResultPage(HttpServletRequest request) {
		String resultPage = "failure";
		String userId = request.getParameter("uid");
		String password = request.getParameter("pwd");
		//Invoke Model to check the validity
		User currentUser = new User(userId, password);
		boolean valid = UserValidator.isValid(currentUser);
		if(valid)
			resultPage = "success";
		return resultPage;
	}*/
	
	@PostMapping("/validate")
	public String getResultPage(String uid,	String pwd) {
		String resultPage = "failure";
		User currentUser = new User(uid, pwd);
		boolean valid = UserValidator.isValid(currentUser);
		if(valid)
			resultPage = "success";
		return resultPage;
	}
	
	@GetMapping("/person")
	public String getPersonEntryPage() {
		return "personEntry";
	}
	
	@PostMapping("/bmi")
	public String findBmi(String name, float height, float weight, Model dataModel) {
		float bmi = BmiCalculator.getBmi(height, weight);
		//Storing name and bmi of a  person into model
		dataModel.addAttribute("personName", name);
		dataModel.addAttribute("personBmi", bmi);
		return "bmiResult";
	}
	
}






