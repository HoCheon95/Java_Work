package 중첩클래스와중첩인터페이스;

import 중첩클래스와중첩인터페이스.Button.OnClickListener;

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
