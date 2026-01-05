/*
 * 부모 추상클래스를 상속받은 자손클래스에서 부모의 추상메서드를 오버라이딩을 하지 않으면 자손도 추상클래스 이어야 한다.
 * 결국 언제가는 자손에서 부모의 모든 추상메서드를 오버라이딩을 해야 자손클래스로 객체생성이 가능하다.
 */

abstract class Abs05{
	abstract void method05();//추상메서드 정의
	
	void method06() {
		System.out.println("일반메서드 method06()");
	}
}

abstract class Abs06 extends Abs05{
	void method07() {
		System.out.println("일반메서드 method07()");
	}
}

class SubClass04 extends Abs06{

	@Override
	void method05() {
		System.out.println("부모 Abs05 추상클래스의 추상메서드가 오버라이딩 됨.");
	}
	
}
public class AbsEx04 {

	public static void main(String[] args) {
		SubClass04 sub04 = new SubClass04();
		sub04.method05();// 자손에서 오버라이딩 한 메서드 호출
		sub04.method06();// 상속받아서 호출
		sub04.method07();// 상속받아소 호출
		

	}

}
