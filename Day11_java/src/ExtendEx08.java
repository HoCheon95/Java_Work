/*
 * 부모클래스와 동일한 멤버변수명이 자손에서 정의된 경우 부모로 부터 상속받은 멤버변수명에 접근할 때는
 * super.변수명으로 하고, 자손에서 정의된 멤버변수명에 접근할 때는 this.변수명 또는 this.은 생략하고
 * 변수명으로 접근한다.
 */
class Parent08{// extends Object 이 생략됨
	int a = 10;
}// Parent08 부모클래스

class Child08 extends Parent08{
	int a = 20;
	
	void pr() {
		System.out.println("a = " + a); // this.이 생략됨. 20이 출력
		System.out.println("this.a = " + this.a); // 20 
		System.out.println("super,a = " + super.a); // 10
	}
}// Child08 자손클래스
public class ExtendEx08 {

	public static void main(String[] args) {
		Child08 child = new Child08();
		child.pr();

	}

}
