package 중첩클래스와중첩인터페이스;


/*
 * Anonymous.java를 활용한 예제
 */
public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anoy = new Anonymous();
		anoy.field.wake();//익명객체 필드 사용
		
		anoy.method();//익명객체 지역변수 사용
		
		anoy.method02(new Person() {
			
			void study() {
				System.out.println("자바 공부를 합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
			
			
		});//익명클래스 -> 외부클래스$번호.class(AnonymousExample$1.class)

	}

}
