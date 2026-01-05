/*
 * 클래스 초기화 블록 static{}
 */

import java.util.Random;

public class ConsEx01 {
	static int[] arr = new int[10];// 배열크기가 10인 정적배열
	static int[] arr02 = new int[10];

	static {
		/*
		 * 문제01) 1부터 10까지 정수 난수로 일반 for반복문을 사용해서 정적배열 arr 배열원소값을 초기화 해보자.
		 * 단, Math.random() 정적 내장메서드를 활용해야 한다.
		 */
		
		// arr 배열원소 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		
		/*
		 * 문제02) java.util 패키지인 Random 내장클래스를 활용해서 1부터 10사이의 정수난수로 
		 * arr02 정적배열원소값을 초기화를 해보자. 물론 for반복문을 사용한다.
		 */
		// arr02 배열원소 초기화
		Random random = new Random();
		for (int i = 0; i < arr02.length; i++) {
			arr02[i] = random.nextInt(10) + 1;
		}
	}

	public static void main(String[] args) {

		// 첫번째 정적배열 arr원소값을 향상된 for반복문으로 출력
		for (int a : arr) {
			System.out.print(" " + a);
		} // for
		System.out.println("\n\n ============================== \n");

		// 두번째 정적배열 arr02 원소값을 일반 for반복문으로 출력
		for (int i = 0; i < arr02.length; i++) {
			System.out.print(" " + arr02[i]);
		} // for
	}

}
