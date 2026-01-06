/*
 * 18장. 추상 클래스와 final.pdf No.19 1번 문제)
 *  부모 추상클래스의 추상메서드는 상속받은 자손클래스에서 모두 오버라이딩을 해야 한다라는 강제성이 부여된다.
 */

abstract class Abs10 {// extends Object 이 생략됨
	// abstract class 키워드로 추상클래스 정의

	int a = 10;

	public abstract int getA();// 추상메서드 정의 -> 추상메서드는 {}가 없고, 실행문장이 없고, 호출불가능

}

abstract class Abs11 extends Abs10 {
	int b = 20;

	public abstract int getB();
}

class AbsMain extends Abs11 {

	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getB() {
		return b;
	}

}

//문제풀이

public class Ex18_01 {

	public static void main(String[] args) {

		AbsMain am = new AbsMain();
		System.out.println("a = " + am.getA());// 10이 출력되게 한다.
		System.out.println("b = " + am.getB());// 20이 출력되게 한다.

	}

}
