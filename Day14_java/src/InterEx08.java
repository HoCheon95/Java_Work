/*
 * 클래스 대 클래스 간 직접연결 보다는 중간에 인터페이스를 끼어 넣어서 간접 연결하는 방식 
 * -> 스프링 자바 프로젝트 등 개발에서 권장하는 방식
 */

interface I08 {
	public abstract void play();// 추상메서드 정의
}

//첫번쨰 자손클래스
class B08 implements I08 {

	@Override
	public void play() {
		System.out.println("B08 class play() 메서드");
	}

}

//두번째 자손클래스
class C08 implements I08 {

	@Override
	public void play() {
		System.out.println("C08 class play() 메서드");
	}

}

class A08 {
	void autoplay(I08 i) {// 매개변수 타입이 부모 인터페이스 타입으로 선언 
						  // -> 매개변수 다형성(상속 + 업캐스팅: 모든자손타입을 받을 수 있다.)
		i.play();// 업캐스팅 이후 오버라이딩 한 메서드 호출 -> i가 실제 가리키는 객체타입에 의해서 호출되는 메서드 결정된다.
		
	}
}

public class InterEx08 {

	public static void main(String[] args) {
		
		A08 a08 = new A08();
		a08.autoplay(new B08());//매개변수 인자값이 업캐스팅 됨
		a08.autoplay(new C08());

	}

}
