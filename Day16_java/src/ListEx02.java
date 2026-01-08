/*
 * java.util 패키지의 List 컬렉션 인터페이스를 구현 상속한 자손 ArrayList 컬렉션 클래스 특징)
 *  1. 저장되는 순서를 보장한다.
 *  2. 중복 원소값을 허용한다.
 *  3. 자바 2버전에서 추가되었고, 실제 자바 프로젝트 개발에서 가장 사용빈도가 높다.
 *  4. 복수개의 원소값을 동시 저장 가능하고 가변적 크기이다.
 *  5. 배열주소 인덱스 번호처럼 0부터 시작한다. 복수개의 자료형을 동시 저장할 수 있다.
 */

import java.util.ArrayList;
import java.util.List;

public class ListEx02 {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(100);// 기본타입 int -> 참조 래퍼타입 Integer로 오토박싱됨(자바 5버전에서 추가) +
		// Integer가 부모타입 Object으로 업캐스팅
		list.add(100);// 오토박싱과 업캐스팅
		list.add("대전시");// 업캐스팅
		list.add(10.7);// 오토박싱과 업캐스팅
		list.add(false);// 오토박싱과 업캐스팅

		System.out.println("list컬렉션 원소개수 : " + list.size());// 5반환 -> 컬렉션 크기인 원소개수는 1부터 카운터한다.

		for (int i = 0; i < list.size(); i++) {// 배열주소 인덱스 번호처럼 0부터 시작
			System.out.println(list.get(i));//get(i)메서드는 i번째 주소 인덱스번호에 해당하는 컬렉션 원소값을 가져온다.
		}// for
	}

}
