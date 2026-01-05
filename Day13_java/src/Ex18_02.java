/*
 * 18장. 추상 클래스와 final.pdf No.21 2번 문제)
 * 강의 교안 소스를 참조해서 좀더 나은 자바 OOP 코드(오버라이딩 애너테이션, 업캐스팅, 업캐스팅 이후 오버라이딩 된 메서드 호출)
 * 로 변경해 보자. 그리고 코드 결과는 컴파일 에러가 난다. 에러가 나는 이유에 대해서 주석문 처리 한다.
 */

class A{
	public final int method1() {
		return 0;
	}
}

class B extends A{
	
	@Override
	public int method1() {
		/*
		 * final method1()은 자손에서 오버라이딩이 안된다.
		 */
		return 1;
	}
	
}

public class Ex18_02 {

	public static void main(String[] args) {
		A a = new B();// 업캐스팅
		System.out.println("x = " + a.method1());
	}

}
 
