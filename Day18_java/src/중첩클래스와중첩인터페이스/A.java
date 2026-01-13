package 중첩클래스와중첩인터페이스;

/*
 * 클래스 소속의 변수 선언위치를 참조하면 중첩 내부클래스를 유추할 수 있다.
 *  1. 멤버변수 선언위치 : 인스턴스 변수 선언위치이면 인스턴스 멤버 내부클래스가 되고, 정적변수 선언위치이면 정적 멤버 내부클래스가 된다.
 *  2. 메서드내에 선언된 변수를 지역변수라고 한다. 이 지역변수 선언위치에 선언된 내부 클래스를 로컬 내부클래스라고 한다.
 */

public class A {// 외부 클래스
	
	A(){
		System.out.println("A객체가 생성됨.");
	}// 기본생성자
	
	/*
	 * 1. 인스턴스 멤버 내부클래스 : 자바 21버전에서는 인스턴스 변수와 정적변수, 인스턴스 메서드, 정적 메서드
	 * 모두 올 수 있다. 하지만 자바 구버전(자바 20버전 이하)에서는 정적변수와 정적메서드는 올 수 없고, 인스턴스 변수와 인스턴스
	 * 메서드만 올 수 있다.(단, static final 정적상수는 예외적으로 적용)
	 */
	
	class B{
		B(){
			System.out.println("B객체가 생성됨.");
		}
		
		int field01;//인스턴스 변수가 올 수 있다.
		static int field02;//정적변수가 올 수 있다.
		void method01() {}//인스턴스 메서드가 올 수 있다.
		static void method02() {}//정적메서드가 올 수 있다.
		
	}// 외부클래스명$내부클래스명.class(A$B.class)
	
	/*
	 * 1. 정적멤버 내부클래스 : 자바 21버전뿐만 아니라 그 이전 버전에서도 인스턴스 변수, 정적변수, 인스턴스 메서드, 정적메서드
	 * 모두 올 수 있다.
	 */
	
	static class C{
		C(){ System.out.println ("C객체가 생성됨."); }
		
		int field01;
		static int field02;
		void method01() {}
		static void method02() {}
	}//A$C.class
	
	void method() {
		/*
		 * 로컬 내부클래스 -> 외부클래스명$번호로컬내부클래스명.class
		 */
		class D {
			D() { System.out.println("D객체가 생성됨"); }
			/*
			 * 자바 21부터는 로컬 내부클래스에도 인스턴스 변수, 인스턴스 메서드, 정적변수, 정적메서드가 올 수 있다.
			 * 하지만 구버전(자바 20이하)에서는 인스턴스 변수, 인스턴스 메서드만 올 수 있고, 정적변수와
			 * 정적메서드는 올 수 없다.(단, static final 정적상수는 예외적으로 올 수 있다.
			 */
			
			int field01; //인스턴스 변수
			static int field02; //정적변수
			void method01() {}//인스턴스 메서드
			static void method02() {}//정적메서드
		}//A$1D.class
		
		D d = new D();
		d.field01=10;
		d.field02=20;
		d.method01();
		d.method02();
		
	}//method()
}
