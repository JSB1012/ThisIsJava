package interface2;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire(); // 인터페이스 타입 필드 선언과 초기 구현 객체 대입
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
