/*
 * for 반복문안에서 continue 문을 사용해서 1부터 10까지 자연수 중에서 4의 배수만 빼고 누적합을 구한다.
 */
public class ForEx08 {

	public static void main(String[] args) {

		int sum = 0; // 누적합

		for (int i = 1; i <= 10; i++) {
			if (i % 4 == 0) {// 4의 배수일 때 실행
				continue; // 아래 문장 수행 안하고 반복을 위해서 처음으로 돌아가서 계속 반복
			}
			sum += i; // 4의 배수인 4, 8만 제외하고 누적합을 구함
		} // for
		System.out.printf("4의 배수만 제외한 누적합 = %d \n", sum);
	}
}
