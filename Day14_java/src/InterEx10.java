/*
 * 두 부모 인터페이스의 디폴트 메서드명이 동일한 경우 다중 상속한 자손클래스에서 이 디폴트 메서드를 오버라이딩을 해야 한다.
 */

interface InterA {
	default void display() {// 디폴트 메서드
		System.out.println("InterA 디폴트 메서드");
	}

	static void staticMethod() {// 자바 8버전에서 인터페이스에도 정적메서드가 올 수 있게 되었다.
		System.out.println("InterA 정적메서드");
	}
}

interface InterB{
	default void display() {
		System.out.println("InterB 디폴트 메서드");
	}
}

class ChildClass10 implements InterA, InterB{

	@Override
	public void display() {
		InterA.super.display();
		InterB.super.display();
	}
	
}

public class InterEx10 {

	public static void main(String[] args) {
		
		ChildClass10 child10 = new ChildClass10();
		
		child10.display();// 오버라이딩 한 메서드 호출
		InterA.staticMethod();//인터페이스명.정적메서드() 호출

	}

}
