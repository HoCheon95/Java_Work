/*
 * 제네릭 타입간의 레퍼런스간의 형변환은 허용되지 않는다. 안되는 이유는 제네릭 타입들 간에는 상속 관계가 성립되지 않기 때문이다.
 * 만약 허용한다면 자료의 안정성이 깨질 수 있기 때문에 자바 컴파일러가 이를 막는다.
 * 따라서 자바 컴파일러는 이를 엄격히 제한하며 컴파일 단게에서 오류를 발생시킨다.
 */

import java.util.ArrayList;

public class ListEx13 {

	public static void main(String[] args) {
		
		ArrayList<String> fruitList = new ArrayList<>();
		
		fruitList.add("apple");//문자열값만 저장 가능하다.
		fruitList.add("banana");
		fruitList.add("orange");
		
		ArrayList<Object> objlist;
		objlist = fruitList;
		
		for(Object obj:objlist) {
			System.out.println(obj);
		}
	}

}
