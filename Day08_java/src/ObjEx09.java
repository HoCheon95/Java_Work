/*
 * 메서드 매개변수 타입이 참조타입이면 객체주소값 전달된다. 그러므로 메서드 호출 후 같은 객체주소를 공유하기 때문에  변경된
 * 값도 공유한다. 이것을 레퍼런스(Referenc, 참조변수)에 의한 전달방식이다.
 */

class MyDate09 {
	int year = 2025; // 년도값
	int month = 12; // 월값
	int date = 22; // 일값
}// MyDate09 class

class ReMethod {
	void change(MyDate09 t) { // 매개변수 타입이 참조타입이다. MyDate09 t = d; t 매개변수에 d객체주소가 대입된다.
								// 그러므로 같은 주소를 공유한다.
		t.year = 2026;
		t.month = 1;
		t.date = 1;
	}
}

public class ObjEx09 {

	public static void main(String[] args) {

		ReMethod rm = new ReMethod(); // rm 참조변수 | 객체 생성
		MyDate09 d = new MyDate09(); // d 참조변수 | 객체 생성

		System.out.println("change() 메서드 호출전 : " + d.year + "년 " + d.month + "월 " + d.date + "일");
		// 2025년 12월 22일
		rm.change(d);
		System.out.println("change() 메서드 호출후 : " + d.year + "년 " + d.month + "월 " + d.date + "일");
		// 2026년 1월 1일 -> t와 d는 같은 객체주소를 공유한다. 그러므로 변경된 년월일 값도 함께 공유된다.

	}

}
