package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		ApplicationContext context;
		String filePath = 
		"./src/main/resources/spring-config.xml";
		context = new FileSystemXmlApplicationContext(filePath);
		Object obj = context.getBean("myBean"); //Managed Comp.
		GreetingService gs = (GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		System.out.println("========================");
		
		GreetingService gs2 = new HelloService(); //Unmanaged Comp.
		reply = gs2.sayGreeting();
		System.out.println(reply);
		
	}

}




