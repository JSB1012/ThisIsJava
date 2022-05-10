package interface1;

public class RemoteControlExample4 {

	public static void main(String[] args) {
		RemoteControl4 rc = null;

		rc = new Television();
		rc.turnOn();
		rc.setMute(true);

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);

	}

}
