/*
 * 07장.제어문의 다양한 활용.pdf No.9쪽 4번문제)
 * 각 단이 아래로 출력되지 않고 오른쪽으로 출력되도록 구구단 프로그램을작성하시오.(Ex07_04.java->이중for문)
 */
public class Ex07_04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%2d\t", j, i, j * i);
			}
			System.out.println();
		}

		System.out.println("\n ==================================== \n");

		// 문제 풀이
		int i, j;
		for (j = 1; j <= 9; j++) {
			for (i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			} // inner for
			System.out.println();
		} // outer for
	}
}