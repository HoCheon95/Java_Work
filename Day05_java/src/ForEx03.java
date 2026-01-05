/*
 * break 문 특징)
 *  반복문내에서 break 문을 만나면 해당 반복문을 중단한다.
 */
public class ForEx03 {

	public static void main(String[] args) {

		int i; // 반복문 제어변수

		// 1부터 10까지 반복
		for (i = 1; i <= 10; i++) {
			System.out.print(" " + i);
		}

		System.out.println("\n\n =============================== \n");

		// 4의 배수인 4일때 중단
		for (i = 1; i < 10; i++) {
			if (i % 4 == 0) {// 로 나눈 나머지값이 0과 같을 떄 즉 4의 배수일 때 실행
				break; // for 반복문 중단
			}
			System.out.print(" " + i);// 1 2 3만 출력
		} // for

	}

}
