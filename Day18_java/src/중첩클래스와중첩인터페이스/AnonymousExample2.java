package 중첩클래스와중첩인터페이스;

/* Anonymous2 클래스를 활용한 예제 */
public class AnonymousExample2 {

	public static void main(String[] args) {
		
		Anonymous2 anony2 = new Anonymous2();
		anony2.field.turnOn();//익명객체 필드 사용
		anony2.method();//익명객체 로컬(지역) 변수 사용
		
		//익명객체를 메서드 매개변수 인자값으로 전달
		anony2.method02(new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("유튜브를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("유튜브를 끕니다.");
			}
			
		});//익명클래스(AnonymousExample2$1.class)

	}

}
