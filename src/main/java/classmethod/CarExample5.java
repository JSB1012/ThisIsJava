package classmethod;

public class CarExample5 {

	public static void main(String[] args) {
		Car5 myCar = new Car5();

		myCar.setGas(5); // Car5의 setGas() 메소드 호출

		boolean gasState = myCar.isLeftGas(); // Car5의 isLeftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // Car5의 run() 메소드 호출
		}

		if (myCar.isLeftGas()) { // Car5의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
