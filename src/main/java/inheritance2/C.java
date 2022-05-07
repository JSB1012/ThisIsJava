package inheritance2;

import inheritance.A;

public class C {
	public void method() {
		A a = new A(); // 다른패키지 X
		a.field = "value"; // 다른패키지 X
		a.method(); // 다른패키지 X
	}

}
