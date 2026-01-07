/*
 * 부모 인터페이스의 디폴트 메서드명과 부모 클래스의 일반 메서드명이 동일한 경우 부모 인터페이스의 디폴트 메서드는
 * 자손에서 상속되지 않고 부모 클래스의 일반 동일 메서드가 상속되어 진다.
 */

class ParentClass11{
	public void display() {
		System.out.println("부모클래스 일반 메서드");
	}
}

interface ParentInter11{
	default void display() {
		System.out.println("부모 인터페이스 디폴트 메서드");
	}
}

class ChildClass11 extends ParentClass11 implements ParentInter11{
	
}
public class InterEx11 {

	public static void main(String[] args) {
		
		ChildClass11 child11 = new ChildClass11();
		child11.display();//부모클래스의 동일 일반메서드만 상속된다.

	}

}
