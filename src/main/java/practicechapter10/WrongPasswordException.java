package practicechapter10;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {

	}

	public WrongPasswordException(String message) {
		System.out.println(message);

	}

}
