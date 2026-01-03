package example.spring.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AudienceAround {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointcut() {}
	
	private void takeSeats() {
		System.out.println("Taking seats using around");
	}
	
	private void turnOffMobile() {
		System.out.println("Turning off mobile using around");
	}
	
	private void clap() {
		System.out.println("Clap Clap Clap using around");
	}
	
	private void demandForRefund() {
		System.out.println("Demanding for refund using around");
	}
	
	private void leave() {
		System.out.println("Leaving now using around");
	}
	
	@Around("myPointcut()")
	public void monitorPerformance(ProceedingJoinPoint joinPoint) {
		try {
			takeSeats();
			turnOffMobile();
				joinPoint.proceed();
			clap();
		} catch (Throwable e) {
			demandForRefund();
		}		
		leave();
	}
}







