package interface1;

public abstract class Television implements RemoteControl4 {

	// 필드
	private int volume;

	// turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	// turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl4.MAX_VOLUME) {
			this.volume = RemoteControl4.MAX_VOLUME;
		} else if (volume < RemoteControl4.MIN_VOLUME) { // 인터페이스 상수를 이용해서 volume 필드의 값을 제한
			this.volume = RemoteControl4.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨:" + volume);
	}

}
