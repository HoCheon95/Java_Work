/**
 * 참조타입 매개변수는 객체 주소값이 전달되어져서 주소값을 공유한다. 그러므로 변경된 값도 공유할 수 있다.
 */

class Data13 {
	int x;
}

public class ObjEx13 {
	static void change(Data13 d2) { // 참조타입 매개변수 d2 -> 객체주소가 전달되어져서 공유된다.
		d2.x = 1000;
		System.out.println("change() 메서드 내에서 d2.x = " + d2.x); // 1000
	}// change()

	public static void main(String[] args) {
		
		Data13 d = new Data13();
		d.x = 100;
		System.out.println("main() d.x = " + d.x); // 100
		
		change(d); // d객체주소가 전달
		System.out.println("change() 메서드 호출 후 main() d.x = " + d.x);
		// 객체주소값이 공유되어서 메서드 호출 후 변경된 값 1000도 공유된다.

	}

}
