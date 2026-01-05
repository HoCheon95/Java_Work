/*
 * 배열 원소값을 서로 바꾸는 예제)
 */
public class ArrayEx10 {

	public static void main(String[] args) {

		int[] numArr = new int[10];

		// 배열원소값으로 0부터 9까지 초기화
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i; // 배열원소값으로 0~9 까지 초기화
			System.out.print(" " + numArr[i]); // 배열원소값 출력
		}

		System.out.println("\n\n ========================== \n");

		// 배열원소값을 서로 바꿈
		for (int i = 0; i < 100; i++) {
			int k = (int) (Math.random() * 10); // random()내장메서드는 0.0dltkd 1.0미만 사이의 실수숫자 난수를 구함
												// 여기에 * 10 하면 0.0이상 10.0미만 사이의 실수숫자 난수발생
												// -> (int)로 캐스팅 형변환하면 소수점이하는 버리고
												// 0이상 10미만 즉 0부터 9사이의 정수숫자 난수(정해지지 않은 임의의 수) 구함

			int tmp = numArr[0];
			numArr[0] = numArr[k]; // 임의의 배열원소값을 첫번째 배열원소값으로 저장
			numArr[k] = tmp;
		} // for

		// 일반 for 반복문으로 출력
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(" " + numArr[i]);
		} // for
		System.out.println("\n\n ========================== \n");

		// 자바5버전에서 추가된 향상된 확장 for로 출력
		for (int a : numArr) {
			System.out.print(" " + a);
		} // for
	}

}
