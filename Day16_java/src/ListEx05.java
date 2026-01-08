/*
 * java.util 패키지의 Enumeration 인터페이스 특징)
 *  1. 자바 1버전에서 추가된 인터페이스로 컬렉션에 저장된 복수개의 원소값을 순방향으로 쉽게 읽어오는 용도로 사용되고
 *     저장되는 컬렉션 자료구조로는 사용하지 않는다.
 *  2. Iterator 의 구버전으로 한 번 사용한 것은 다시 사용 못한다. 다시 사용할려면 재 생성해야 한다.
 *  3. 자바 1버전에서 추가된 컬렉션 클래스와 잘 맞는다.
 */

import java.util.Enumeration;
import java.util.Vector;

public class ListEx05 {

	public static void main(String[] args) {

		Vector vec = new Vector();

		for (int i = 1; i <= 7; i++) {
			vec.add(i*10);// 10부터 70까지 7개의 원소값 저장
		}
		
		Enumeration enum2 = vec.elements();
		while(enum2.hasMoreElements()) {// 벡터에 원소값이 있다면 참
			System.out.println(enum2.nextElement());//nextElement() 내장메서드로 다음원소값을 가져온다.
		}

	}

}
