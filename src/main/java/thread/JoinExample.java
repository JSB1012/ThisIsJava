package thread;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); // sumThread가 종료할떄까지 메인 스레드를 일시 정지 시킴
		} catch (InterruptedException e) {
		}
		System.out.println("1~100합: " + sumThread.getSum());

	}

}
