public class DataType09 {

	public static void main(String[] args) {
		
		/*
		 * 배열이란?
		 *  동일한 타입의 하나이상의 복수개의 원소값을 고정된 크기로 한꺼번에 저장하는 자료구조이다.
		 */
		//new 키워드로 배열생성
		int[] score = new int[5];//배열 크기가 5일 score 배열 생성
		score[0] = 100;//배열 주소 인덱스 번호는 0부터 시작
		score[1] = 99;
		score[2] = 88;
		score[3] = 90;
		score[4] = 100;
		
		System.out.println("score 배열크기(원소개수) = " + score.length);
		//일반 for 반복문으로 배열원소값을 출력
		for (int i = 0; i < score.length; i++) {
			System.out.print(" " + score[i]);
		}
		System.out.println("\n =========================== \n");
		
		int[] score2 = {100, 90, 100};// 배열원소값을 직접 초기화하면서 score2 배열 생성 -> 배열 생성 두번쨰 방법
		
		// 자바 5버전에서 추가된 향상된 확장 for 반복문으로 배열원소 누적합을 구해본다. 향상된 확장 for 반복문은
		// 배열이나 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어오는 용도로만 사용한다.
		
		int sum = 0;//배열원소 누적합
		
		for (int k : score2) {
			sum+=k;
		}
		System.out.print("score2 배열원소 누적합 = " + sum );
	}

}
