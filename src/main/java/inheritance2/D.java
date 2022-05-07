package inheritance2;

import inheritance.A;

public class D extends A {
	public D() {
		super(); // 자식클래스 O
		this.field = "value"; // 자식클래스 O
		this.method(); // 자식클래스 O
	}

}
