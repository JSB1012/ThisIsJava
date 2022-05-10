package interface1;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl4 rc = new RemoteControl4() { // 인터페이스() {} 는 인터페이스를 구현해서 중괄호와 같이 클래스를 선언하라는 뜻이고 new 연산자는 이렇게 선언된 클래스를 객체로 생성
			public void turnOn() {
				/* 실행문 */
			}

			public void turnOff() {
				/* 실행문 */
			}

			public void setVolume(int voulume) {
				/* 실행문 */
			}
		}; // 하나의 실행문이므로 세미콜론 반드시 붙여야 한다.
	}

}
