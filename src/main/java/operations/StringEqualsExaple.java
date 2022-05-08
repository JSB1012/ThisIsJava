package operations;

public class StringEqualsExaple {

	public static void main(String[] args) {
		String strVar1 = "주성빈";
		String strVar2 = "주성빈";
		String strVar3 = new String("주성빈");

		System.out.println((strVar1 == strVar2));
		System.out.println((strVar1 == strVar3));
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));

	}

}
