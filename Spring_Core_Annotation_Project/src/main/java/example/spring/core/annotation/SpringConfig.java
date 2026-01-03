package example.spring.core.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration //Marks this class as a Configuration specific class
@ComponentScan(basePackages = {"hello", "welcome", "example"})
public class SpringConfig {
	//This is the configuration unit of Spring
	
	//Declaring a Bean of type: HelloService
	@Bean //Marks this method as a Bean declaration method.
	//The default ID of this bean is the method name i.e. getHelloService
	public HelloService getHelloService() {
		HelloService hs = new HelloService();
		return hs;
	}
	
	@Bean("welcome")//Overriding the default ID to welcome
	public WelcomeService getWelcomeService() {
		WelcomeService ws = new WelcomeService();
		return ws;
	}
	
	@Bean("course")
	public CourseService getCourse() {
		CourseService cs = new CourseService("EAGER");
		return cs;
	}
	
	@Bean("course2")
	@Lazy //Marks thie bean as Lazy so that Spring instantiates it only when requested
	public CourseService getCourse2() {
		CourseService cs = new CourseService("LAZY");
		return cs;
	}
	
	@Bean("course3")
	@Scope("prototype")
	public CourseService getCourse3() {
		CourseService cs3  = new CourseService();
		return cs3;
	}
	
	@Bean("address")
	//@Primary
	public Address getAddress() {
		Address addr = new Address("Mumbai", 422001);
		return addr;
	}
	
	@Bean("address2")
	public Address getAddress2() {
		Address addr = new Address("Nashik", 422001);
		return addr;
	}
	
	@Bean("customer")
	public Customer getCustomer() {
		Customer cst = new Customer();
		cst.setCustomerId(101);
		cst.setName("MET CDAC");
		//cst.setPermanentAddress(getAddress());//Explicit Wiring
		return cst;
		//Not setting permanentAddress explicitly as it is to be wired implicitly.
	}
	
	/*
	 * @Bean public DefaultComponent getDefaultComponent() { return new
	 * DefaultComponent(); }
	 */
	
}







