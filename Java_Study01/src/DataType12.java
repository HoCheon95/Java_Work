/*
 * 메서드 오버로딩이란?
 *  같은 클래스내에서 동일 이름의 메서드명을 여러번 중복해서 정의하는 것을 말한다.
 *  
 *  오버로딩 된 메서드 명 구분요건)
 *   1. 메서드의 매개변수 개수를 다르게 한다.
 *   2. 메서드의 매개변수 타입을 다르게 한다.
 *   3. 메서드의 매개변수 순서를 다르게 한다.
 */

class Mt12 {

	void pr(int a) {
		System.out.println(a);
	}

	void pr(int a, int b) {
		System.out.println(a + "\t" + b);
	}// 매개변수 개수를 다르게 한 메서드 오버로딩
	
	void print(String cityName) {
		System.out.println("도시이름 : " + cityName);
	}
	
	void print(double data) {
		System.out.println("실수 숫자값 = " + data);
	}//매개변수 자료형을 다르게 한 메서드 오버로딩
}

public class DataType12 {

	public static void main(String[] args) {
		
		Mt12 mt = new Mt12();
		mt.pr(10);
		mt.pr(10, 20);
		mt.print("대전시");
		mt.print(100.3);

	}

}
