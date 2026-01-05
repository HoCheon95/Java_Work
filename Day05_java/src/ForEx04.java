/*
 * 자바의 이중 for 반복문에서 맨 안쪽 반복문안에 break 문을 사용하면 가장 근접한 안쪽 반복문만 중단하고 바깥 반복문은 중단 못한다.
 * 이런 경우 바깥 반복문까지 모두 중단하고 싶을 때는 맨 바깥 반복문위에 임의의 레이블명을 지정하면 된다.
 * 
 */
public class ForEx04 {

	public static void main(String[] args) {

		int a, i;// 반복문 제어변수

		// 이중 반복문에서 맨 안쪽 반복문만 중단
		for (a = 1; a <= 5; a++) {
			for (i = 1; i <= 5; i++) {
				if (i % 3 == 0) {// 3으로 나눈 나머지값이 0일때 실행
					break;
				}
				System.out.print(" i -> " + i); // 1 2
			} // inner for
			System.out.println("\n a -> " + a);// 바깥 반복문은 중단 못함
		} // outer for

		System.out.println("\n =============================== \n");

		// 이중 반복문 중단
		exit_for: // 임의의 레이블명 지정
		for (a = 1; a <= 5; a++) {
			for (i = 1; i <= 5; i++) {
				if (i % 3 == 0) {
					break exit_for;// 이중 for 반복문 모두 중단
				}
				System.out.print(" i -> " + i);
			} // inner for
			System.out.println("\n a -> " + a);
		} // outer for

		System.out.println("\n\n =============================== \n");

		for (a = 1; a <= 3; a++) {
			System.out.println(">> a -> " + a);

			exit_for: // 중간 for 반복문위에 임의의 레이블명 지정
			for (int b = 1; b <= 5; b++) {
				for (int c = 1; c <= 9; c++) {
					if (c % 3 == 0) {
						break exit_for; // 중간 + 안쪽 반복문 만 중단
					}
					System.out.print(" c -> " + c);
				} // 안쪽 for 반복문
				System.out.println("\n b -> " + b); // 이 부분은 실행 안함.
			} // 중간 for 만복문
			System.out.println("\n<< a 반복 계속 >>\n"); // a반복은 계속됨
		} // 가장 바깥쪽 for 반복문

	}// main

}
