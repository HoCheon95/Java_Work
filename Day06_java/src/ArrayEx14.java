/*
 * 2차원 배열 score 배열원소값을 초기화 한 다음 이를 일반 이중 for 반복문을 사용해서 출력해 보고 자바5버전에서 추가된
 * 향상된 확장 for 반복문을 사용해서 2차원배열 원소값을 1차원 배열로 변환하고 다시 일반변수로 가져와서 배열원소 누적합을 구해 본다.
 */

public class ArrayEx14 {

	public static void main(String[] args) {
		
		int[][] score = {
				{ 100, 100, 100 }, 
				{ 90, 90, 90 }, 
				{ 80, 80, 80 }, 
				{ 70, 70, 70 }
		};	// 4행 * 3열의 총 12개 배열원소값을 초기화 한 2차원배열 score생성
		
		int sum = 0; // 2차원 배열원소 누적합

		// 일반 이중 for 반복문으로 score 2차원 배열원소값 출력
		for (int i = 0; i < score.length; i++) { // score.length는 행의 길이 4를 반환
			for (int j = 0; j < score[i].length; j++) { // score[i].length는 각행의 열의 길이 3을 반환
				System.out.printf("score[%d][%d] : %d \n", i, j, score[i][j]);
			} // inner for
		} // outer for
		System.out.println("\n\n ===================== \n");

		// 향상된 확장 for사용
		for (int[] arr : score) { // 2차원 배열을 1차원 배열로 변환
			for (int k : arr) {// 1차원 배열을 일반 변수로
				sum += k;// 배열원소 누적합
			} // inner for
		} // outer for

		System.out.printf("score 배열원소 누적합 = %d \n", sum);

	}

}
