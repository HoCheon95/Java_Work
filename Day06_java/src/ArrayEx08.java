/*
 * 배열 총합과 평균을 구하는 소스 예)
 */
public class ArrayEx08 {
	public static void main(String[] args) {

		int sum = 0; // 배열원소 누적합
		double average = 0.0; // 평균

		int[] score = { 100, 90, 100, 88, 100 };

		// 향상된 확장 for 반복문을 사용해서 배열원소 누적합을 구하고 출력
		for (int k : score) {
			sum += k; // 총합
			System.out.print(" " + k);
		} // for

		System.out.println("\n\n ====================================> \n");

		average = (double) sum / score.length; // 평균
		
		System.out.println("총합 = " + sum + ", 평균 = " + average);

	}// main
}
