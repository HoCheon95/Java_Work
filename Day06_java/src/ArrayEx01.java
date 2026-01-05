// 배열이란? 동일한 타입(자료형)의 하나 이상의 복수개 원소값을 고정된 크기로 
//         한꺼번에 저장하기 위해서 사용하는 자료형을 말한다.
// 첫번째 배열 생성법))
//       new 키워드를 사용한다.
//      타입[] 배열명 = new 타입[배열크기];

public class ArrayEx01 {

	public static void main(String[] args) {

		int[] score = new int[5]; // 배열 크기가 3인 int 타입 배열 score 생성
		score[0] = 100; // 첫번째 배열 원소값 저장, 배열주소 인덱스 번호는 0 부터 시작
		score[1] = 99;
		score[2] = 100;
		score[3] = 90;
		score[4] = 88;

		System.out.printf("배열 원소 개수(배열크기) = %d\n", score.length); // score.length는 배열크기 3 반환 | 배열크기인 원소 개수는 1부터 카운트
		System.out.println("\n >>> score 배열원소값 출력 <<<");
		for (int i = 0; i < score.length; i++) {
			
			/* 반복문 제어변수값을 0 부터 시작한 이유는 해당 배열주소 인덱스 번호가 0부터 시작하기 때문이다
			   조건식에 i < score.length에서 <(작다) 연산을 사용한 이유는 주소덱스 번호는
			   0부터 시작하고 score.length에 의해서 반환되는 배열크기(원소개수)는 1부터 카운트해서 3으로 끝나는데
			   마지막 주소 인덱스번호는 2로 끝나기 때문이다.
			 */
			System.out.println("score[" + i + "] : " + score[i]);
		}
	}
}
