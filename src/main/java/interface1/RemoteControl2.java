package interface1;

public interface RemoteControl2 {
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 추상 메소드
	public void turnOn();

	public void turnOff();				// 메소드 선언부만 작성(추상 메소드)

	public void setVolume(int volume);

}
