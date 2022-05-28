package api2;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "921012-1234567";
		
		String firstNum = ssn.substring(0,6); //6은 제외 0~5
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);

	}

}
