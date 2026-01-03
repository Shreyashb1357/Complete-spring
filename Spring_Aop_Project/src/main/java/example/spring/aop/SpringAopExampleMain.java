package example.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopExampleMain {

	public static void main(String[] args) {
		ApplicationContext context =
		new AnnotationConfigApplicationContext(SpringConfig.class);
		Musician ms = context.getBean(Musician.class);
		ms.perform();
		System.out.println("==============");
		Singer sn = context.getBean(Singer.class);
		sn.perform();
		System.out.println("==================");
		System.out.println(ms.getClass().getName());
		System.out.println(sn.getClass().getName());

	}

}
