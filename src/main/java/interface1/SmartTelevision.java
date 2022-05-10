package interface1;

public class SmartTelevision implements RemoteControl4, Searchable {

	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

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
