package 람다식;


public class UsingThisExample {

	public static void main(String[] args) {
		
		/*
		 * 문제) UsingThis 외부클래스 객체명을 usingThis로 생성한 다음, 인스턴스 멤버내부클래스명 객체명을
		 * inner 로 생성해서 멤버내부클래스에 정의된 method()를 호출하는 과정 자바코드를 만들어 본다.
		 * 결국 인스턴스 멤버내부클래스 객체 생성된는 과정코드를 해 보라는 의미이다.
		 */
		
		
		UsingThis usingThis = new UsingThis();
		
		UsingThis.Inner inner = usingThis.new Inner();
		
		inner.method();
		
		
		
	}

}
