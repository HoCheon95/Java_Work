/*
 * 클래스와 객체 관계인 객체지향 프로그래밍(OOP: Object-Oriented Programming의 약자)에 관한 소스 예)
 */

class Tv07{
	String color; // tv 색상							| 멤버변수
	boolean power; // 전원 상태(on/off)				| 멤버변수
	int channel; // 3개의 클래스 소속 멤버변수(속성) 각각 정의	| 멤버변수
	
	/*
	 * 클래스 소속 멤버변수(속성) 기본값)
	 *  멤버변수 만 선언하고 명시적인 코드로 초기화를 하지 않으면 기본값으로 초기화가 된다. 이 초기값에 대해서 알아 본다.
	 *  int 타입 속성은 0으로 초기화
	 *  boolean 타입 멤버변수는 false 기본값으로 초기화
	 *  double 타입 속성은 0.0 기본값으로 초기화
	 *  String 참조타입 멤버변수는 null 기본값으로 초기화
	 */
	
	// 3개의 메서드 정의
	void power() {
		int name;
		power = !power; // !false -> true
	}// power
	
	void channelUp() {
		++channel; // 채널번호 증가
	}// channelUp
	
	void channelDown() {
		--channel; // 채널번호 감소
	}// channelDown
	
}// Tv07 class

public class ArrEx07 {
	public static void main(String[] args) {
		
		Tv07 tv; // 객체주소가 저장안된 참조변수 tv
		tv = new Tv07(); // 객체주소가 저장된 참조변수 tv(객체명) | 객체
		
		tv.channel = 10; // 채널번호는 10 저장
		tv.channelUp(); // 채널번호 1증가
		System.out.println("1증가된 채널번호 : " + tv.channel); //11
		
		tv.channelDown(); tv.channelDown(); // 채널번호 2감소
		System.out.println("2감소된 채널번호 : " + tv.channel); //9
		
		tv.power(); // !false -> true
		System.out.println("tv on/off : " + tv.power); // true

	}// main
}
