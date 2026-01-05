/*
 * 이중 for 반복문 실습소스
 */
public class ForEx02 {

	public static void main(String[] args) {

		int a; // 바깥 for 반복문 제어변수
		int i; // 안쪽 for 반복문 제어변수

		System.out.println("시침 ----------------------> 분침");
		System.out.println("a(바깥쪽 반복문 제어변수) - i(안쪽 반복문 제어변수)");

		for (a = 1; a <= 5; a++) {
			for (i = 1; i <= 3; i++) {
				System.out.println(a + "--------------------> " + i);
			} // inner for
			System.out.println("\n =================== \n");
		} // outer for

	}

}
