/*
 * 08장. 제어문을 보조하는 보조 제어문.pdf No.13쪽 1번 문제)
 * 
 * 1 부터 100사이의 자연수 중에서 제일 큰 7의 배수를 구하는 자바 프로그램을 작성하시오.(for, if, break)
 * 단, 1부터 100까지 1씩 증가하면서 반복해서 답을 구한다.
 */
public class EX08_01 {

	public static void main(String[] args) {

		// 1번 답안코드
		int i = 0;
		int max = 0;

		for (i = 1; i <= 100; i++) {
			if (i % 7 == 0) {// 7의 배수
				max = i; // max 값에 7의 배수를 계속 덮어씌움
			}

			if (i == 100) {
				System.out.println("7의 배수 중 최대값 : " + max);
				break;
			}
		}

		System.out.println("\n\n =================================== \n");

		int a; // 반복문 제어변수
		max = 0; // 7배수 최대값 저장할 변수
		for (a = 1; a <= 100; a++) {
			if (a % 7 == 0) { // 7의 배수일 때 실행 -> 7로 나눈 나머지 값이 0일 때 실행
				max = a;

			}
		}
		System.out.printf("7의 배수의 최대값= %d \n", max);
		
		System.out.println("\n\n =================================== \n");

		/*
		 * 2번문제) 100 부터 1까지 1씩 감소하면서 for 반복문 등을 활용해서 6의 배수 중 최대값을 구하는 자바 프로그램을 만들어 본다.
		 */
		// 2번 답안코드

		for (i = 100; i >= 1; i--) {
			if (i % 6 == 0) {// 6의 배수
				System.out.println("6의 배수 중 최대값 : " + i);
				break;
			}
		}

		System.out.println("\n\n =================================== \n");

		int sixmax = 0; // 6의 배수 최대값 변수
		for (i = 100; i >= 1; i--) {
			if (i % 6 == 0) {
				sixmax = i;
				break;
			}
		}
		System.out.println("6의 배수중 최대값= " + sixmax);

	}

}
