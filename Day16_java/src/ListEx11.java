/*
 * java.util 패키지의 컬렉션 Map인터페이스를 구현 상속한 자손 컬렉션 클래스 HasMap 특징)
 *  1. Map과 HashMap은 자바 2버전에서 추가됨
 *  2. 키, 값 쌍으로 저장되는 사전적인 컬렉션 자료구조이다. 저장되는 순서 보장되지 않는다.
 *  3. 키를 통해서 값을 검색하기 때문에 검색속도가 빠르다.
 */

import java.util.HashMap;
import java.util.Map;

public class ListEx11 {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();
		/*
		 * 앞 부분 <String, Integer> 제네릭 타입만 봐도 뒤부분 제네릭 타입이 무엇인지 추론이 가능하다. 그래서 자바 7버전부터는 뒷
		 * 부분 제네릭 타입 지정은 다음과 같이 생략되었다. <>
		 */

		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "p" };
		// 문자열 배열크기가 9인 sample배열 생성과 초기화
		
		// 문자열 키에 포함된 단어 빈도수 계산
		for(String k : sample) {
			Integer freq = hm.get(k);//키에 대한 값을 구함
			hm.put(k, (freq == null)? 1:freq+1);// 키, 값 쌍으로 저장 -> 키값인 영어단어에 대한 빈도수가
			                                    // 계산되어 값으로 저장(삼항조건 연산자 사용)
		}//for
		
		System.out.println(hm.size() + "단어가 있다.");//7
		System.out.println(hm.containsKey("to"));//to 키가 맵에 포함되어 있다면 참(true)
		System.out.println(hm);//맵자료 출력

	}

}
