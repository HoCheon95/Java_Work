/*
 * 07장.제어문의 다양한 활용.pdf No.10쪽 5번문제)
 * 
 * 스타(*)로 역삼각형을 출력하는 프로그램을 작성하시오.
 */
public class Ex07_05 {

	public static void main(String[] args) {

		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = i; j >= 1; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("\n ====================================== \n");

		// 문제 풀이
		// 1)
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" *");
			} // inner for
			System.out.println();
		}

		System.out.println("\n ====================================== \n");

		// 2
		int rows = 5;

		for (i = rows; i >= 1; i--) {// 줄 수 감소
			for (j = 1; j <= i; j++) {// 별 출력
				System.out.print(" *");
			}
			System.out.println();// 줄바꿈

		} // outer for
	}
}