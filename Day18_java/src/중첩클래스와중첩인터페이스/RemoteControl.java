package 중첩클래스와중첩인터페이스;

/*
 * 익명객체(익명클래스) 구현을 위한 인터페이스
 */
public interface RemoteControl {
	
	public void turnOn(); //abstract 가 생략된 추상메서드
	void turnOff();//public abstract 가 생략된 추상메서드. 추상메서드는 {}가 없고, 실행문장이 없고, 호출이 불가능
	
	
}
