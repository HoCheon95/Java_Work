/*
 * continue 문 특징)
 *  반복문내에서 continue 문을 만나면 그 아래 문장을 실행하지 않고, 다음 반복을 위해서 반복문 처음으로 돌아가 다음
 *  반복을 계속한다.
 */
public class ForEx05 {

	public static void main(String[] args) {

		// 1부터 10까지 반복하는데 4의 배수인 4, 8만 빼고 나머지 반복한다.
		for (int i = 1; i <= 10; i++) {
			if (i % 4 == 0)
				continue; // 아래 문장 수행 안함
			System.out.print(" " + i); // 4 8만 빼고 나머지는 반복 출력
		} // for
	}
}
