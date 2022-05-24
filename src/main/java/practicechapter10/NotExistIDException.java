package practicechapter10;

public class NotExistIDException extends Exception {
	public NotExistIDException() {

	}

	public NotExistIDException(String message) {
		System.out.println(message);
	}

}
