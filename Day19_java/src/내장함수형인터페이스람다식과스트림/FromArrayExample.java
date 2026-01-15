package 내장함수형인터페이스람다식과스트림;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 배열로 부터 스트림 얻기 
 */

public class FromArrayExample {

	public static void main(String[] args) {

		String[] strArray = { "홍길동", "이순신", "신사임당" };
		Stream<String> strStream = Arrays.stream(strArray);// 배열로 부터 문자열 요소를 처리하는 스트림 생성
		strStream.forEach(name -> System.out.print(" " + name));
		System.out.println("\n ============================= \n");

		int[] intArray = { 100, 200, 300 };
		IntStream intStream = Arrays.stream(intArray);// 배열로 부터 기본 int 타입을 처리하는 스트림 생성
		intStream.forEach(number -> System.out.print(" " + number));
	}

}
