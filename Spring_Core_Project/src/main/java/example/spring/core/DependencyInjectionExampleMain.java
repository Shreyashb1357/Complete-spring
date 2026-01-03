package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjectionExampleMain {

	public static void main(String[] args) {
		ApplicationContext context;
		String filePath = 
		"./src/main/resources/spring-config.xml";
		context = new FileSystemXmlApplicationContext(filePath);
		
		Object obj = context.getBean("myBean2"); //Managed Comp.
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		obj = context.getBean("myBean3"); //Managed Comp.
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		

	}

}
