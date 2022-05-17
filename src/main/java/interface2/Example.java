package interface2;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl; // InterfaceA 변수는 methodA()만 호출가능
		ia.methodA();
		System.out.println();

		InterfaceB ib = impl;// InterfaceB 변수는 methodB()만 호출가능
		ib.methodB();

		InterfaceC ic = impl; // InterfaceC 변수는 methodA, methodB, methodC 모두 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
