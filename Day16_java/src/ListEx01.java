/*
 * java.util 패키지의 Set 컬렉션 인터페이스 구현 상속한 자손 HashSet 컬렉션 클래스 자료구조)
 *  1. 저장되는 순서를 보장하지 않는다.
 *  2. 중복 원소값을 허용하지 않는다.
 */

import java.util.HashSet;
import java.util.Set;

public class ListEx01 {

	public static void main(String[] args) {
		
		Set set = new HashSet();//부모 인터페이스 타입으로 업캐스팅
		set.add("홍길동");//String 이 부모클래스타입인 Object 으로 업캐스팅 하면서 저장됨
		set.add(7);// int -> 참조 래퍼타입인 Integer 로 오토박싱됨(자바 5버전에서 추가), 
		           // 그리고 Integer 가 부모타입 Object 타입으로 업캐스팅
		set.add("홍길동");//중복원소값을 허용안함.
		set.add(10.3);// double -> Double 오토박싱 + Object 타입으로 업캐스팅
		set.add(true);
		/* 컬렉션 자료구조는 복수개의 타입을 동시 저장 가능하다. */
		
		System.out.println("set컬렉션 원소개수(크기) : " + set.size());// 5가 아니고 4반환 
														// -> 홍길동 중복원소값을 혀용하지 않아서 크기가 4로 출력
		System.out.println(set);//컬렉션 원소값 출력

	}

}
