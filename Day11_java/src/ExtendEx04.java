/*
 * 부모클래스의 멤버변수 중 인스턴스 변수(속성)명과 동일한 변수명이 자손에서 정의된 경우 부모로부터 상속받은
 * 해당 멤버변수명에 접근할 때는 super.변수명으로 하고, 자손에서 정의된
 * 동일 멤버변수명에 접근할 때는 this.명수명 으로 사용한다.
 */

class Parent04{
	protected int a = 100;
	protected int b = 200;
}

class Child04 extends Parent04{
	protected int a = 400;
	protected int b = 500;
	protected int c = 300;
	
	public void print() {
		System.out.println("super.a = " + super.a + ", super.b = " + super.b + ", super.c = " + this.c); //c변수명 앞의 this.는 생략가능
		System.out.println("this.a = " + this.a + ", this.b = " + this.b + ", this.c = " + this.c);
	}
}
public class ExtendEx04 {

	public static void main(String[] args) {
		Child04 child = new Child04();
		child.print();

	}

}
