package 중첩클래스와중첩인터페이스;

/*
 * RemoteControl 인터페이스를 활용한 익명객체 구현 클래스
 */
public class Anonymous2 {
	
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};//첫번째 익명클래스(외부클래스명$번호.class -> Anonymous2$1.class
	
	void method() {
		//지역변수값으로 익명객체 대입
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};//두번째 익명클래스(Anonymous2$2.class)
		
		localVar.turnOn();
	}//method()
	
	//익명객체를 매개변수 인자값으로 대입
	void method02(RemoteControl rc) {
		rc.turnOn();//오버라이딩 한 메서드 호출
	}

}
