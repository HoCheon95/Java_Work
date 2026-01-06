/*
 * 자바의 인터페이스 특징)
 *  1. 인터페이스는 interface 예약어로 정의하고 implements 키워드로 자손클래스에서 구현 상속한다.
 *  2. 자손클래스에서 하나 이상 부모 인터페이스로 부터 다중 상속을 받을 수 있다.
 *  3. 인터페이스에 오는 추상메서드는 public abstract 키워드로 정의한다. 이 키워드는 생략가능하다.
 *  4. 부모 인터페이스를 구현 상속한 자손클래스에서 부모의 모든 추상메서드를 반드시 오버라이딩을 해야 한다는 강제성이 부여된다.
 *  그래야만 자손클래스 객체 생성이 가능하다.
 */

interface IHello01{//최초 작성한 인터페이스에서 명시적인 다른 부모 인터페이스로 부터 상속받지 않으면 부모는 없다.
	
	public abstract void sayHello(String name);// public abstract 는 생략가능함. 추상메서드 정의
	// -> 추상메서드는 {}가 없고 실행문장이 없고 호출이 불가능하다.
	
}

class Hello01 implements IHello01{// implements 키워드로 자손클래스에서 구현상속한다.

	@Override
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕!");
	}
	
}

public class InterEx01 {

	public static void main(String[] args) {
		
		
		IHello01 ih;// 부모 인터페이스 타입으로 참조변수 ih 선언
		ih = new Hello01();//업캐스팅
		ih.sayHello("홍길동");// 업캐스팅 이후 오버라이딩 한 메서드 호출
		

	}

}
