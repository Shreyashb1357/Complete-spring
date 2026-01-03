package welcome.child;

import org.springframework.stereotype.Component;

@Component("child_id")//Assigning an ID to this component
public class WelcomeChildComponent {
	public void doWork() {
		System.out.println("Welcome child component works...");
	}
}
