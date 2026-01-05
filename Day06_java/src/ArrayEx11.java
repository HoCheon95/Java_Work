/*
 * 정수숫자 난수를 배열주소 인덱스 번호로 활용
 */
import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {

		int[] score = { -4, -1, 3, 6, 11 };
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * score.length); // random()메서드는 0.0이상 1.0미만 사이의 실수숫자 난수를 구함.
															// score.length는 배열크기 5를 반환. * 5 하면 0.0이상 5.0미만 사이의
															// 실수숫자 난수 발생 -> (int)로 캐스팅하면 0이상 5미만
															// 결국 0부터 4사이의 임의의 정수숫자 난수 구함

			arr[i] = score[tmp]; // 임의의 score배열원소값이 arr배열원소값으로 대입저장
		} // for

		// 내장 API로 배열원소값 출력
		System.out.println(Arrays.toString(arr)); // arr배열원소값을 문자열로 반환

		System.out.println("\n\n ============================= \n");

		// 향상된 확장 for로 arr 배열원소값 출력
		for (int k : arr) {
			System.out.print(" " + k);
		} // for
	}
}
