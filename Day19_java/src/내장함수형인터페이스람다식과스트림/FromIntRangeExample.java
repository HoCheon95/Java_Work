package 내장함수형인터페이스람다식과스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 숫자 범위로 부터 스트림을 얻어서 1부터 100까지 누적합을 구해 본다.
 */
public class FromIntRangeExample {
	static int sum;// 누적합

	public static void main(String[] args) {
		
		IntStream stream = IntStream.rangeClosed(1, 100);// 1부터 100까지 순차적으로 제공하는 IntStream을 생성
		stream.forEach(number -> sum += number);//1부터 100까지 누적합
		System.out.println("1부터 100까지 누적합 = " + sum);
		
		System.out.println("\n ==================================== \n");
		sum = 0;
		List<Integer> numList = new ArrayList<>();
		/*
		 * 야간 진도보강 문제 1)
		 *  일반 for 반복문을 사용해서 1부터 10사이의 정수숫자 난수를 발생한 다음 이것을 numList 컬렉션에 저장하고
		 *  출력하는 자바 코드를 만들어 본다.
		 */
		//답안코드 시작
		for(int i =0; i<10; i++) {
			int num = (int)(Math.random()*10) + 1;
			numList.add(num);
			//System.out.print(" " + numList.get(i));
		}
		Stream<Integer> stream_list = numList.stream();//스트림 생성
		stream_list.forEach(number -> System.out.print(" " + number));
		
		System.out.println("\n ==================================== \n");
		
		sum = 0;
		/*
		 * 야간 진도보강 문제 2)
		 *  자바 5버전에서 추가된 향상된 확장 for 반복문을 사용해서 numList컬렉션 원소값의 누적합을 sum 변수에 저장한 다음
		 *  출력해 본다.
		 */
		for(int k : numList) {
			sum+=k;
		}
		System.out.println("numList컬렉션 원소의 누적합 : " + sum);
	}

}
