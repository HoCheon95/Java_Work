package 중첩클래스와중첩인터페이스;

/*
 * 인스턴스 멤버 내부클래스와 정적멤버 내부클래스 객체 생성과정 
 */

public class Main {

	public static void main(String[] args) {
		
		A a = new A();//외부 클래스 객체 a 생성
		
		A.B b = a.new B();//인스턴스 멤버 내부클래스 객체 생성과정
		b.field01=3;
		b.field02=7;
		b.method01();
		b.method02();
		
	}

}
