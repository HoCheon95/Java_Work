/**
 * 기본 타입 매개변수는 값만 전달된다. 객체주소를 공유하지 않아서 값도 공유 못한다.
 */

class Data11{
	int x; // 클래스 소속의 멤버변수가 int 타입이면 명시적인 초기화를 하지 않아도 기본값 0으로 초기화가 된다.
}
public class ObjEx11 {
	static void change(int a) { // int a는 기본타입 매개변수이다. 값만 전달된다. | 정적메서드
		a = 1000;
		System.out.println("change() a = " + a);
	}// change()
	
	public static void main(String[] args) {
		
		Data11 d = new Data11();
		d.x = 100;
		System.out.println("main() x = " + d.x); // 100
		
		ObjEx11.change(d.x); // 클래스명.정적메서드()로 접근한다. 해당 클래스명 ObjEx11은 생략 가능하다.
		// change() 메서드 호출하면서 값 100만 전달
		System.out.println("change() 메서드 호출 후 main() x = " + d.x); // 100
		

	}

}
