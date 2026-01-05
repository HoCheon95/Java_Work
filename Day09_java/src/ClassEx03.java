/*  생성자의 특징)
 *   1. 생성자 이름은 클래스 이름과 같게 정의한다. new 클래스명();에 의해서 생성자를 호출한다.
 *   2. 생성자의 주된 기능은 클래스 소속의 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수 초기화 기능이다.
 *   3. 생성자 명 앞에 리턴타입을 기술하지 않는다.
 */

class MyDate03{
	private int year; // 년도값 -> int 타입 멤버변수(속성) 명시적인 초기화를 하지 않으면 기본값 0으로 초기화 된다.
	private int month; //월값
	private int date; //일값, 3개의 멤버변수 정의(멤버변수 중 인스턴스 변수 -> 속성)
	
	public MyDate03() {// 매개변수가 없는 기본 생성자
		year = 2025; // 생성자의 주된 기능인 인스턴스 변수 초기화
		month = 12;
		date = 31;
		System.out.println("기본 생성자 호출");		
	}
	
	public void print() {
		System.out.println(year + "년 " + month + "월 " + date + "일");
	}// 사용자 정의 메서드p()
}
public class ClassEx03 {

	public static void main(String[] args) {
		
		MyDate03 md = new MyDate03(); // new MyDate03()에 의해서 기본생성자 호출
		md.print();
		new MyDate03(); //기본(디폴트:default) 생성자 호출

	}

}
