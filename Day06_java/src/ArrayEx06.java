
/*
 * 자바에서 다양한 배열 생성법과 복수개의 배열원소값을 쉽게 읽어오는 용도로만 사용하는 자바 5버전에서 추가된 향상된 확장 for 반복문을 사용한 예)
 */
import java.util.Arrays;

public class ArrayEx06 {

	public static void main(String[] args) {

		// 다양한 배열 생성
		int[] iArr01 = new int[10]; // 배열크기가 10인 iArr01 배열 생성
		int[] iArr02 = new int[] { 100, 99, 100, 90, 100 }; // new int[]는 생략가능
		int[] iArr03 = { 100, 100, 85, 95, 90 };
		char[] chArr = { 'a', 'b', 'c', 'd', 'e' };

		// iArr01 배열원소값을 일반 for 반복문을 사용해서 1부터 10까지 초기화하고 출력
		for (int i = 0; i < iArr01.length; i++) {
			iArr01[i] = i + 1; // 배열원소값으로 1부터 10까지 초기화
			System.out.print(" " + iArr01[i]);
		} // for
		System.out.println("\n\n ======================================== \n");

		// 자바 5버전(jek1.5)에서 추가된 향상된 확장 for 반복문을 사용해서 배열원소값 출력

		for (int k : iArr02) {
			System.out.print(" " + k);
		}
		System.out.println("\n\n ======================================== \n");

		System.out.println(Arrays.toString(iArr03)); // 내장 api인 Arrays.toString()을 활용해서 배열원소 값을 문자열로 반환
		
		System.out.println(chArr);
	}

}
