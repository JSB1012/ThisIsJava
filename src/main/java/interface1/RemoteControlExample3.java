package interface1;

public class RemoteControlExample3 {

	public static void main(String[] args) {

		RemoteControl4 rc = null; // 인터페이스 변수 선언

		rc = new Television(); // Television 객체를 인터페이스 타입에 대입
		rc.turnOn(); // 인터페이스의 turnOn(),turnOff() 호출
		rc.turnOff();

		rc = new Audio(); // Audio 객체를 인터페이스 타입에 대입
		rc.turnOn(); // 인터페이스의 turnOn(),turnOff() 호출
		rc.turnOff();

	}

}
