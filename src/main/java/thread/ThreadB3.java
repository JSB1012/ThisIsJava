package thread;

public class ThreadB3 extends Thread {
	private WorkObject workObject;

	public ThreadB3(WorkObject workObject) {
		this.workObject = workObject; // 공유 객체를 매개값으로 받아 필드에 저장
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB3();
		}
	}

}
