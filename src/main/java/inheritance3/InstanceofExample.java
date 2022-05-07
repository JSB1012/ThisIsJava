package inheritance3;

public class InstanceofExample {
	public static void method1(Parent1 parent1) {
		if (parent1 instanceof Child1) {
			Child1 child = (Child1) parent1;
			System.out.println("method1 = Child로 변환 성공");
		} else {
			System.out.println("method1 = Child로 변환되지 않음");
		}
	}

	public static void method2(Parent1 parent1) {
		Child1 child = (Child1) parent1; // ClassCastExceptopn 발생할 가능성 있음
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent1 parentA = new Child1();

		method1(parentA);
		method2(parentA); // Chid 객체를 매개값으로 전달

		Parent1 parentB = new Parent1();

		method1(parentB); // Parent 객체를 매개값으로 전달
		method2(parentB); // 예외발생
	}

}
