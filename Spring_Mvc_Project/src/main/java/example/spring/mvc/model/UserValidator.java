package example.spring.mvc.model;

public class UserValidator {
	public static boolean isValid(User userObject) {
		boolean valid = false;
		String uid = userObject.getUserName();
		String pwd = userObject.getPassword();
		if(uid.equals("Admin") && pwd.equals("asAdmin"))
			valid = true;
		return valid;
	}
}
