package 내장함수형인터페이스람다식과스트림;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * 컬렉션에 저장된 복수개의 원소값을 자바2 버전에서 추가된 Iterator 인터페이스를 사용해서 다음 원소값을 쉽게 읽어오는 
 * 기존방법과 자바 8버전에서 추가된 람다식과 스트림을 사용해서 보다 더 간결한 코드로 컬렉션 원소값을
 * 읽어오는 비교예제
 */
public class IteratorAsStreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("서울시", "부산시", "대전시");// 배열을 컬렉션 List로 변환
		
		/*
		 * Iterator 를 사용해서 컬렉션의 다음 원소값을 읽어옴 -> 컬렉션 원소값을 저장하는 용도로 사용하는
		 * 컬렉션 자료구조는 아니다.
		 */
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {//다음 원소값이 있다면 참
			String cityName = iterator.next();//다음 원소값을 가져옴
			System.out.print(" " + cityName);
		}//while
		
		System.out.println("\n ====================================== \n");
		
		//스트림 사용
		Stream<String> stream = list.stream();//스트림 객체 생성
		stream.forEach(name -> System.out.print(" " + name));
		/*
		 * 람다식 (-> 화살표 연산)을 사용해서 컬렉션 원소값을 보다 더 간결하게 읽어옴.
		 */
		

	}

}
