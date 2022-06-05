package thread;

public class YieldExample {

	public static void main(String[] args) {
		ThreadA2 threadA2 = new ThreadA2();
		ThreadB2 threadB2 = new ThreadB2();
		
		threadA2.start(); //ThreadA, ThreadB 모두 실행
		threadB2.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA2.work = false; //ThreadB만 실행
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA2.work = true; //ThreadA, ThreadB 모두 실행
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		threadA2.stop = true;
		threadB2.stop = true;

	}

}
