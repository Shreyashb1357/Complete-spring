package example.spring.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiringExampleMain {

	public static void main(String[] args) {
		ApplicationContext context =
		new AnnotationConfigApplicationContext
		(SpringConfig.class);
		
		Object customerObj = context.getBean("customer");
		System.out.println(customerObj);

	}

}
