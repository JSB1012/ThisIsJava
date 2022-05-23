package nestedclass;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnCliclListenner(new CallListener());
		btn.touch();
		
		btn.setOnCliclListenner(new MessageListener());
		btn.touch();

	}

}
