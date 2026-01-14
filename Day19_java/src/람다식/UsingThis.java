package 람다식;

/*
 * 중첩 클래스 중에서 인터페이스 멤버 내부클래스내의 메서드에서 람다식 사용해서 익명객체를 구현 부분에서 
 * 외부클래스의 private 으로 선언된 멤버변수나 내부 클래스 멤버변수에 접근하는 것에 대한 소스이다.
 */
public class UsingThis {//외부클래스
	
	private int outterField = 10;
	
	//인스턴스 멤버 내부클래스
	class Inner{
		int innerField = 20;
		
		void method() {
			//람다식 익명객체 구현
			MyFunInterface4 fi = () -> {
				System.out.println("outterFiedl = " + outterField);
				System.out.println("UsingThis.this.outterField = " + UsingThis.this.outterField);
				
				System.out.println("innerField = " + innerField);
				System.out.println("this.innerField = " + this.innerField);
			};
			
			fi.method();
		}//method()
	}//외부클래스명$내부클래스명.class(UsingThis$Inner.class)

}
