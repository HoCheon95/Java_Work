/*
 * 레퍼런스(참조) 타입 변수가 같은 객체주소를 공유하여도 new 키워드로 새로운 객체를 만들면 새로운 객체주소가 대입된다.
 * 그러므로 주소값이 달라서 값도 공유 하지 못한다.
 */

class MyDate07 {
	int year = 2025;
	int month = 12;
	int date = 22;
}

public class ObjEx07 {

	public static void main(String[] args) {

		MyDate07 d = new MyDate07(); // d 객체 생성
		MyDate07 t = d; // t참조변수에 d객체주소를 대입, 결국 t와 d는 같은 객체주소를 가진다.

		System.out.println(d.year + "년 " + d.month + "월 " + d.date + "일"); // 2025년 12월 22일
		System.out.printf("%d년 %d월 %d일 \n", t.year, t.month, t.date); // 2025년 12월 22일

		t = new MyDate07(); // new 키워드에 의해서 새로운 객체 객체주소가 대입된다.
							// 그러므로 t와 d는 서로 다른 주소값을 가지게 되어서 값을 공유 못한다.
		t.year = 2026;
		t.month = 1;
		t.date = 1;
		System.out.printf("%d월 %d년 %d일 \n", d.year, d.month, d.date); // 2025년 12월 22일
		System.out.println(t.year + "년 " + t.month + "월 " + t.date + "일 "); // 2026년 1월 1일

	}

}
