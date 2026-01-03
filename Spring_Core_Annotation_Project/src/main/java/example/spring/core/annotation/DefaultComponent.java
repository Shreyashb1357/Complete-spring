package example.spring.core.annotation;

import org.springframework.stereotype.Component;

@Component //Marks this class as a Managed Component so that Spring can manage it
public class DefaultComponent {
	public void doWork() {
		System.out.println("Default component works...");
	}
}
