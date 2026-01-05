/*
 * 1. for 반복문안에 if ~ else 조건문과 % 나머지 연산을 사용할 홀수/짝수들의 누적합 구하기
 * 2. for 반복문을 각각 따로 사용해서 홀수/짝수들의 누적합 구하기
 */
public class ForEx01 {

	public static void main(String[] args) {

		int i;// 반복문 제어변수
		int odd_tot, even_tot;// 홀수, 짝수 누적합을 저장할 변수

		// for, if ~ else, %
		for (i = 1, odd_tot = 0, even_tot = 0; i <= 10; i++) {
			if (i % 2 == 1) {// 2로 나눈 나머지값이 1이면 홀수일 때 실행
				odd_tot += i;// 홀수들의 누적합
			} else {
				even_tot = even_tot + i;// 짝수들의 누적합
			} // if~else
		} // for
		System.out.printf("홀수들의 누적합 = %d \n", odd_tot);
		System.out.printf("짝수들의 누적합 = %d \n", even_tot);

		// 홀수들의 누적합
		for (i = 1, odd_tot = 0; i <= 10; i += 2) {
			odd_tot = odd_tot + i;
		}
		System.out.println("홀수들의 누적합 = " + odd_tot);

		// 짝수들의 누적합
		for (i = 2, even_tot = 0; i <= 10; i = i + 2) {
			even_tot += i;
		}
		System.out.println("짝수들의 누적합 = " + even_tot);
	}
}
