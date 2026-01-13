package 중첩클래스와중첩인터페이스;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button btn = new Button();
		btn.setOnClickListener(new CallListener());//매개변수 다형성 -> 업캐스팅
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}

}
