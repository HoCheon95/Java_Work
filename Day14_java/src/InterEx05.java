/*
 * 인터페이스에서 인터페이스 간 상속은 extends 예약어를 사용한다. 그리고 인터페이스 간 상속도 다중상속이 가능하다.
 */

interface IHello05{
	void hello(String name);// public abstract 키워드가 생략된 추상메서드
}

interface GoodBye05{
	void bye(String name);
}

interface ITotal extends IHello05, GoodBye05{
	public abstract void greeting(String name);
}

class SubClass05 implements ITotal{

	@Override
	public void bye(String name) {
		System.out.println(name + "씨 잘가!");
	}

	@Override
	public void hello(String name) {
		System.out.println(name + "씨 안녕!");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name + "씨 방가!");
	}
	
}
public class InterEx05 {

	public static void main(String[] args) {
		
		ITotal it = new SubClass05();//업캐스팅
		it.hello("홍길동");//업캐스팅 이후 오버라이딩 한 메서드 호출
		it.bye("이순신");
		it.greeting("신사임당");

	}

}
