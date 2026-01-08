/*
 * 컬렉션에 제네릭을 지정함으로써 불필요한 레퍼런스간의 형변환인 업캐스팅과 다운캐스팅을 하지 않은 예제소스)
 */

import java.util.ArrayList;
import java.util.List;

public class ListEx09 {

	public static void main(String[] args) {
		
		List<String> cityList = new ArrayList<String>();
		// <String> 문자열 제네릭 타입을 지정해서 문자열값만 저장가능하다.
		
		cityList.add("seoul");
		cityList.add("busan");
		cityList.add("daejeon");//문자열 값만 저장 가능하다.
		
		String cityName = null;
		
		for(int i = 0; i < cityList.size(); i++) {
			cityName = cityList.get(i);// 영문 도시이름을 가져온다. 불필요한 다운캐스팅을 안해도 된다.
			System.out.print(cityName.toUpperCase() + "\t");// \t는 탭키만큼 수평으로 띄운다.
		}
		System.out.println("\n ============================ \n");
	
		//자바 5버전에서 추가된 향상된 확장 for 반목문을 사용해서 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어옴
		
		for(String name: cityList) {
			System.out.print(name.toUpperCase() + "\t");
		}

	}

}
