/*
 * 배열주소 인덱스 번호 범위를 벗어나서 예외 오료 ArryIndexOutofBoundsException 에 관한 소스 예)
 */
public class ArrayEx05 {

	public static void main(String[] args) {

		int[] score = new int[5]; // 배열크기가 5인 일차원 배열 score 생성
		int k = 1;

		score[0] = 100;
		score[1] = 90;
		score[k + 1] = 99;
		score[3] = 100;
		score[4] = 100;

		int tmp = score[k + 2] + score[4]; // 100 + 100 = 200
		System.out.printf("tmp = %d\n", tmp);

		// 일반 for 반복문으로 score 일차원 배열원소값 욀괄적으로 출력
		for (int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] = %d \n", i, score[i]);
		}//for
		
		//System.out.printf("score[%d] = %d\n", 5, score[5]); // 배열주소 인덱스 번호 범위를 벗어나서 예외
		//오류 발생
	}

}
