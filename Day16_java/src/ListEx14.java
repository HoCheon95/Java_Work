/*
 * 제네릭 타입간의 레퍼런스 형변환은 제네릭 와일드 카드 문법을 사용하면 제한적으로 허용된다.
 */

import java.util.ArrayList;

public class ListEx14 {

	public static void main(String[] args) {
		
		ArrayList<String> cityList = new ArrayList<String>();
		// ArrayList 클래스에 String 타입의 list 객체 생성
		cityList.add("seoul"); // String 타입 문자열 add
		cityList.add("busan");
		cityList.add("daejeon");
		
		ArrayList<? extends Object> objList;
		
		/* 첫번째 제네릭 와일드 카드 문법형식)
		 * 
		 * <? extends Object> 제네릭 타입간의 형변환 와일드 카드 문법 특징)
		 * - Object 을 상속한 자손은 제네릭 타입간의 형변환을 제한적으로 허용한다. (상한 제한 와일드 카드)
		 * - "제네릭 타입을 알 수 없는 상태"로 참조하는 것이 허용된다.
		 * 
		 * 실제 구체 타입은 String 이지만 컴파일러는 이를 확정할 수 없기 때문에 Object 타입으로만 안전하게 읽을 수 있다. 
		 */
		objList = cityList;
		
		for(Object obj:objList) {
			System.out.println(obj);
		}//자바 5버전에서 추가된 향상된 확장 for 반복문

	}

}
