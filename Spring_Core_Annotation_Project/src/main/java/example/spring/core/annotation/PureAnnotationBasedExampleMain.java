package example.spring.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import hello.HelloComponent;
import welcome.WelcomeComponent;
import welcome.child.WelcomeChildComponent;

public class PureAnnotationBasedExampleMain {

	public static void main(String[] args) {
		ApplicationContext context = 
		new AnnotationConfigApplicationContext(
				SpringConfig.class
		);
		//Obtaining a bean of type: DefaultComponent based upon its Class type
		
		DefaultComponent defaultComp = 
		context.getBean(DefaultComponent.class);
		defaultComp.doWork();
		
		
		HelloComponent helloComp = 
				context.getBean(HelloComponent.class);
		helloComp.doWork();
		
		WelcomeComponent welcomeComp = 
				context.getBean(WelcomeComponent.class);
		welcomeComp.doWork();
		
		WelcomeChildComponent welcomeChildComp = 
				context.getBean(WelcomeChildComponent.class);
		welcomeChildComp.doWork();
		
		Object childCompObj = 
				context.getBean("child_id");
		WelcomeChildComponent chComp = 
				(WelcomeChildComponent)childCompObj;
		chComp.doWork();
	}

}









