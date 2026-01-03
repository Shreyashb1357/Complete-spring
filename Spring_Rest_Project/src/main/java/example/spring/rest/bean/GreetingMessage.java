package example.spring.rest.bean;

import java.time.LocalDate;

public class GreetingMessage {
	private String message;
	private LocalDate sendOn;
	public GreetingMessage() {
		// TODO Auto-generated constructor stub
	}
	public GreetingMessage(String message, LocalDate sendOn) {
		super();
		this.message = message;
		this.sendOn = sendOn;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDate getSendOn() {
		return sendOn;
	}
	public void setSendOn(LocalDate sendOn) {
		this.sendOn = sendOn;
	}

}
