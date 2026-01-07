/*
 * 자바 5버전에서 추가된 오토박싱과 오토언박싱 문법)
 *  1. 오토박싱 이란?
 *   - 기본타입을 참조 래퍼클래스 타입으로 자동형 변환을 하는 것을 말한다.
 *  2. 오토언박싱 이란?
 *   - 반대로 래퍼클래스 타입이 기본타입으로 형변환을 하는 것을 말한다.
 */
public class AutoEx01 {

	public static void main(String[] args) {
		
		int n01 = 10;
		int n02;
		
		Integer num01;
		Integer num02 = new Integer(20);
		
		num01 = n01;//오토박싱
		System.out.println("오토박싱 된 값 = " + num01);
		
		n02 = num02;//오토언박싱
		System.out.printf("오토언박싱 된 값 = %d \n", n02);
		

	}

}
