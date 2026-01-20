/*
 * 자바 기본 자료형(타입) 종류 8가지)
 *  1. 정수 숫자형 : byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
 *  2. 실수 숫자형 : float(4바이트), double(8바이트)
 *  3. 단일 문자형 : char(2바이트)
 *  4. 논리형(true or false) : boolean(1바이트)
 *  
 *  기본타입 8개를 제외한 나머지 자료형을 레퍼런스 참조타입이라고 한다.
 *  참조타입 종류 : 클래스형, 인터페이스형, 배열형, 열거형
 *  
 *  기본타입으로 선언된 변수에는 값을 저장하고, 참조타입으로 선언된 변수에는 객체주소가 저장된다.
 *  
 *  자바에서 변수 선언법)
 *   자료형 변수명;
 *   	  변수명 = 값;
 *   =은 대입연산자이다. 즉 오른쪽 값을 왼쪽 변수에 대입한다.
 */
public class DataType01 {

	public static void main(String[] args) {
		
		int a = 100;//a 4바이트 정수타입 변수 선언하고 100을 대입 저장
		double b = 100.3;
		char c = 'a';
		boolean re = true;
		String cityName= "대전시";// String 은 문자열 클래스형 참조타입이다.
		
		System.out.println("a = " + a);// ln은 줄바꿈한다. +는 문자열 연결 연산기호이다.
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("re = " + re);
		System.out.println("도시이름 : " + cityName);

	}

}
