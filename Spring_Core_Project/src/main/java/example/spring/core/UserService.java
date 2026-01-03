package example.spring.core;

public class UserService implements GreetingService{
	private String userName;
	private int userAge;
	
	public UserService() {
		System.out.println("Inside UserService()");
	}

	public UserService(String userName, int userAge) {
		System.out.println("Inside UserService(String, int)");
		this.userName = userName;
		this.userAge = userAge;
	}

	public UserService(int userAge, String userName) {
		System.out.println("Inside UserService(int, String)");
		this.userAge = userAge;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("Setting userName");
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		System.out.println("Setting userAge");
		this.userAge = userAge;
	}

	@Override
	public String sayGreeting() {
		String greeting = "Hi " + userName + ", your age is " + userAge;
		return greeting;
	}

}
