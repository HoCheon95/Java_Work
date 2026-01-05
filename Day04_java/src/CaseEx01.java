/*
 * java 17 버전까지는 switch ~ case 문의 표현값이 null 인 경우 예외 오류가 발생했지만 자바 21 버전부터는 null을 지정해도
 * 예외 오류가 발생하지 않아서 정상적으로 처리할 수 있게 되었다.
 */
public class CaseEx01 {

	private static void method01(String s) {
		/*
		 * 1. private 접근지정자는 CaseEx01 클래스내에서만 접근 가능하게 한다.
		 * 2. static 키워드는 해당클래스명으로 직접 접근하는 정적메서드를 정의할 때 사용한다.
		 * 3. void는 반환값이 없는 타입을 지정할 때 사용한다. 즉 리턴타입이 없다.
		 * 4. method01()이 정적메서드 명이다. 메서드란 어떤 기능/동작을 가능하게 한다. String s 는 매개변수 즉 전달인자 라고 한다.
		 *    매개변수명에는 해당 메서드를 호출할 때 값을 전달해서 저장되게 할 수 있다. 저장되는 값이 인자값 즉 parameter value라고도 한다.
		 */
		
		switch(s) {
		  case null -> System.out.println("null");
		  case "a", "b" -> System.out.println("a or b");
		  case "c" -> System.out.println("c");
		  default -> System.out.println("해당 사항 없다.");
		}
	}//method01()
	
	private static void method02(String s) {
		switch(s) {
		  case "a", "b" -> System.out.println("a or b");
		  case "c" -> System.out.println("c");
		  case null, default -> System.out.println("null or 해당 사항 없다.");		 
		}
	}//method02()
	
	public static void main(String[] args) {
		
		CaseEx01.method01(null);//클래스명.정적메서드() -> CaseEx01.method01()로 호출한다.
		method02("d");//해당클래스명.은 생략가능하다.
		method02(null);
		
	}//main

}
