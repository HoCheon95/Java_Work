/*
 * 컬렉션에서 제네릭이 나온 배경에 대해서 알아 볼수 있는 예제)
 *  1. <제네릭 타입>은 기본타입으로 지정할 수 없고 참조 레퍼런스 타입으로 지정해야 한다. <제네릭타입>은
 *     자바 5버전(jdk 1.5)에서 추가되었다.
 *  2. 제네릭 타입을 지정하면 지정한 자료형으로만 저장 가능하다.
 *  3. 제네릭 타입을 지정하지 않으면 불필요한 레퍼런스 간의 형변환인 업캐스팅과 다운캐스팅을 해야 한다. 그만큼
 *  프로그램 실행속도가 떨어지고 코드가 복잡해 져서 가독성이 안 좋아진다. 그리고 원하는 자료 추출도 어려워서
 *  자료의 안정성도 떨어진다.
 */

import java.util.ArrayList;
import java.util.List;

public class ListEx08 {

	public static void main(String[] args) {
		
		List nameList = new ArrayList();//제네릭 타입을 지정하지 않은 상태에서 컬렉션 객체 nameList를 업캐스팅 하면서 생성
		
		nameList.add("hong gil dong");//Object타입으로 업캐스팅 하면서 저장
		nameList.add("lee sun shin");
		nameList.add("kang kam chan");
		
		String name = null;
		
		for(int i = 0; i < nameList.size(); i++) {//size()메서드는 컬렉션 원소개수 반환 -> 1부터 카운터
			// List 계열 컬렉션 주소 인덱스 번호는 배열처럼 0부터 시작
			if(nameList.get(i) instanceof String) {//다운 캐스팅이 가능한가? 참
				name = (String)nameList.get(i);//명시적인 다운캐스팅
			}//if
			
			System.out.println("영문이름을 영문대문자로 변경 : " + name.toUpperCase());
			
		}//for 
		

	}

}
