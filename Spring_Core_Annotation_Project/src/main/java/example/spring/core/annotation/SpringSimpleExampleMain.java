package example.spring.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		ApplicationContext context;
		//  FileSystemXmlApplicationContext (filePath)
		//AnnotationConfigApplicationContext (Class type)
		context = 
		new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//context.getBean("course2");
		/*Object obj = context.getBean("getHelloService");
		HelloService hs = (HelloService)obj;
		hs.sayHello();
		
		obj = context.getBean("welcome");
		WelcomeService ws = (WelcomeService)obj;
		ws.sayWelcome();*/
		
		//Demonstration for Bean Scope
		Object obj =context.getBean("course3");
		Object obj2 = context.getBean("course3");
		Object obj3 = context.getBean("course3");
		System.out.println(obj == obj2);
		System.out.println(obj == obj3);
		
		
		

	}

}



