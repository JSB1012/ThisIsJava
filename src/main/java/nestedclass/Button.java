package nestedclass;

public class Button {
	OnClickListener listener;
	
	void setOnCliclListenner(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}

}
