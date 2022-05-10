package interface1;

public interface RemoteControl3 {
	
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 추상 메소드
	public void turnOn();

	public void turnOff();				// 메소드 선언부만 작성(추상 메소드)

	public void setVolume(int volume);
	
	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");		// 실행 내용까지 작성
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

}
