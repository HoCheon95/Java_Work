/* 16장.상속.pdf No.20쪽 1번문제)
 *  강의 교안 소스 중에서 접근 권한이 잘못된 번호를 기술하고, 보다 더 좋은 OOP(객체지향 프로그래밍) 자바 코드로
 *  변경해 본다.(불필요한 코드 제거)
 * 
 */
// 잘못된 부분 정답 번호는 [1]번 과 [5]번 과 [9]
class Parent02 { // extends Object이 생략됨
	private int a;
	int b;
	protected int c;
	public int d;
}// 부모클래스 Parent02

class Child02 extends Parent02 {
	public Child02(int a, int b, int c, int d) {
		this.a = a; // [1]	정답 -> 부모 Parents02에서 private 으로 정의된 멤버변수 a는 같은 패키지의 자손클래스에서 접근 못함
		this.b = b; // [2]
		this.c = c; // [3]
		this.d = d; // [4]
	}// 매개변수가 다른 생성자 오버로딩

	void func() {
		System.out.println(a); // [5] 정답
		System.out.println(b); // [6]
		System.out.println(c); // [7]
		System.out.println(d); // [8]
	}// 사용자 정의 메서드 func()
}// 자손클래스 Child02

public class Ex16_2 {

	public static void main(String[] args) {
		Child02 child = new Child02(10, 20, 30, 40);
		child.func();
		
		/*
		 * 객체로 클래스 소속의 멤버변수에 직접 접근하는 것은 보안상 좋지 않다. 그래서 이 부분을 제거
		 */

	}

}