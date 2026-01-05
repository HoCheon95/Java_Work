/*
 * 자바의 OOP에서 메서드 오버로딩이란?
 *  동일한 같은 클래스내에서 같은 이름의 메서드를 여러 번 중복해서 정의하는 것을 말한다.
 *  
 *  오버로딩 된 메서드 구분 요건)
 *   1. 매개변수 타입을 다르게 한다.
 *   2. 매개변수 개수를 다르게 한다.
 */

class Mt01 { // class
	int abs(int data) { // 메서드 | 매개변수 int data
		if (data < 0) {
			data = -data;
		}
		return data;
	}

	double abs(double data) { // 메서드 | 매개변수 double data
		if (data < 0) {
			data = -data;
		}
		return data;
	}// 매개변수 타입을 다르게 한 메서드 오버로딩

	void pr(int a, int b) { // 메서드 | 매개변수 int a, int b
		System.out.println(a + "," + b);
	}

	void pr(int a) { // 메서드 | 매개변수 int a
		System.out.println(a);
	} // 매개변수 개수를 다르게 한 메서드 오버로딩
}// Mt01 class

public class ObjEx01 {

	public static void main(String[] args) {

		Mt01 m01 = new Mt01(); // 객체 생성, 생성자 생성
		int result = m01.abs(-100); // int result 변수
		System.out.println("-100의 절대값 = " + result);
		System.out.println("-100.99의 절대값 = " + m01.abs(-100.99));

		m01.pr(10);
		m01.pr(10, 20);
	}
}
