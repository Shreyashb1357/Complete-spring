package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class Audience {
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointcut() {}
	
	@Before("myPointcut()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	@Before("myPointcut()")
	public void turnOffMobile() {
		System.out.println("Turning off mobile");
	}
	@AfterReturning("myPointcut()")
	public void clap() {
		System.out.println("Clap Clap Clap");
	}
	@AfterThrowing("myPointcut()")
	public void demandForRefund() {
		System.out.println("Demanding for refund");
	}
	@After("myPointcut()")
	public void leave() {
		System.out.println("Leaving now");
	}
	
}



