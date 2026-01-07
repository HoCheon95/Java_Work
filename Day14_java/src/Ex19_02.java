/*
 * 자바 인터페이스.pdf No.25쪽 2번 문제)
 *  소스는 강의교안을 참조하고 이 소스는 컴파일 에러가 난다. 에러가 나는 이유에 대해서 주석문 처리한다.
 *  그리고 에러 부분을 수정해서 에러가 안나게 한다.
 */

abstract class Test{
	public abstract void methodA();
	
	//public abstract void methodB();
	public void methodB() {
		System.out.println("methodB() 메서드");
	};
	
	/*
	 * 추상 클래스는 abstract class 키워드로 정의한다.
	 * 
	 * 추상 메서드는 {}가 없고, 실행문장이 없고, 호출이 불가능하다.
	 */
}

class ChildClass02 extends Test{

	@Override
	public void methodA() {
		System.out.println("오버라딩 한 methodA()");
	}
	
}

public class Ex19_02 {

	public static void main(String[] args) {
		
		Test t = new ChildClass02();
		t.methodA();//업캐스팅 이후 오버라이딩 한 메서드 호출
		t.methodB();

	}

}
