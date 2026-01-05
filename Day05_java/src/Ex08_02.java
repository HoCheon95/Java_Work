
/*
 * 08장. 제어문을 보조하는 보조 제어문.pdf No.13쪽 2번 문제)
 * 
 * 1 부터 50까지의 자연수 중에서 4의 배수만 뺀 누적합을 구하는 자바 프로그램을 만들어 보자. 단 while 반복문만 사용한다.
 * 주의할 것은 while{} 반복문 블록내에서 ++증가치 연산을 continue문 다음에 넣으면 안된다. if, %, == 등을 사용한다.
 */
import java.util.Random;

public class Ex08_02 {

	public static void main(String[] args) {

		// 첫번째 답안코드

		int i = 0;
		int sum = 0;

		while (i < 50) {
			i++;
			if (i % 4 == 0) {// 4의 배수
				continue;
			}
			sum += i;
		}
		System.out.println("4의 배수만 뺀 누적합 : " + sum);

		System.out.println("\n\n =================================== \n");

		i = 0;
		sum = 0;

		while (i < 50) {
			i++;

			if (i % 4 == 0) {
				continue;
			}
			sum += i;

		}
		System.out.println("4의 배수를 뺀 누적합: " + sum);

		System.out.println("\n\n =================================== \n");

		/*
		 * 문제) for 무한루프문과 java.util 패키지의 Random 유틸리티 내장클래스를 하위의 nextInt(6) 내장메서드를 활용해서
		 * 임의의 주사위 눈의 수를 구하는 자바 프로그램을 만들어 보고, 임의의 주사위 눈의 수가 4일 때 for 무한루프문을 종료시켜 본다. 임의의
		 * 주사위 눈의 정수는 난수가 된다.
		 */
		// 두번째 답안코드

		exit_Loop: // 다중 반복문을 중단하기 위한 임의의 레이블명 지정

		for (;;) {
			Random random = new Random();
			int num = random.nextInt(6) + 1;

			if (num == 4) {
				System.out.println("주사위 : 4 무한루프 종료!!");
				break exit_Loop;
			}
			System.out.println("주사위 : " + num);
		}

		System.out.println("\n\n =================================== \n");

		for (;;) { // for 무한루프 시작 for 문의 조건식을 비워두면 (;) 무한루프 됨
			Random random = new Random(); // new 키워드인 Random 객체 생성
			int diceNumber = random.nextInt(6) + 1; // (6) = 0이상 6미만 숫자 구함
			// 여기서 + 1을 하면 1이상 7미만
			System.out.println("주사위를 굴렸습니다. \n나온 눈금은: " + diceNumber);

			if (diceNumber == 4) {
				System.out.println("눈금 4 완료 루프 종료");
				break; // 주사위가 4일 때 for 무한루프 종료
			}
		}
	}
}
