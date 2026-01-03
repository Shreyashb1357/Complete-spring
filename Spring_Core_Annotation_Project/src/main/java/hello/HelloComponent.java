package hello;
import org.springframework.stereotype.Component;
@Component
public class HelloComponent {
	public void doWork() {
		System.out.println("Hello component works...");
	}
}
