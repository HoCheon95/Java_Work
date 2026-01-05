/*
 * 상속에서 생성자 호출문제)
 * 부모클래스 생성자가 오버로딩이 되면 부모의 기본생성자 묵시적 제공을 하지 않는다.
 * 이런 경우 자손에서 부모의 기본 생성자를 호출하려다가 컴파일 에러가 발생하는 소스 예이다.
 */
class Parent06 { // extends Object 이 생략됨
	protected int a = 10;
	protected int b = 20;

	// 부모클래스 생성자가 오버로딩이 되면 매개변수가 없는 기본생성자 묵시적 제공 안함.

	public Parent06(int a, int b) {
		super(); // 생략가능, 최고 조상 부모클래스 Object의 기본생성자를 먼저 호출한다.
		this.a=a;
		this.b=b;
	}// 매개변수 개수가 다른 생성자 오버로딩
}// 부모클래스 Parent06

class Child06 extends Parent06 {
	protected int c = 30;

	public Child06() {
		// super(); 가 생략됨. 부모클래스 Parent06기본생성자를 먼저 호출할려다가 컴파일 에러가 발생
	}

	public void pr() {
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
	}
}

public class ExtendEx06 {

	public static void main(String[] args) {
		Child06 ch06 = new Child06();
		ch06.pr();

	}

}
