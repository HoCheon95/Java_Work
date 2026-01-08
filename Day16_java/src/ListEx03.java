/*
 * java.util 패키지의 Iterator 인터페이스 특징)
 *  1. 자바 2버전에서 추가됨
 *  2. 컬렉션에 저장된 복수개의 데이터를 쉽게 읽어오는 용도로 사용된다. 저장되는 용도로 사용하는 컬렉션 자료구조는 아니다.
 *  3. 한번 읽어온 자료는 다시 읽어오지 못한다. 다시 읽어오기 위해서는 재 생성해야 한다.
 *  4. 단방향으로만 데이터를 읽어온다.
 *  4. 주로 자바 2버전에서 추가된 컬렉션과 잘 맞는다.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx03 {

	public static void main(String[] args) {
		
		List cityList = new ArrayList();
		
		cityList.add("서울시");
		cityList.add("부산시");
		cityList.add("대전시");
		cityList.add("세종시");
		cityList.add("성남시");
		
		Iterator cityIt = cityList.iterator();
		while(cityIt.hasNext()){//hasNext() 내장메서드는 다음 원소값이 있다면 true
			System.out.println(cityIt.next());//next() 내장메서드로 다음원소값을 가져온다.
		}//while end

	}

}
