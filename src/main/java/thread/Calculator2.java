package thread;

public class Calculator2 {
	private int memory;

	public int getMemonry() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
// 동기화 블록
//	public void setMemory(int memory) { 
//		synchronized (this) {
//			this.memory = memory;
//			try {
//				Thread.sleep(2000);
//
//			} catch (InterruptedException e) {
//			}
//			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
//		}
//	}
}
