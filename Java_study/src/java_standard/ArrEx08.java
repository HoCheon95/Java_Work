package java_standard;

import java.util.Random;

public class ArrEx08 {

	public static void main(String[] args) {

		int[] ball = new int[45];

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 1~45 저장
		}

		int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수

		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.

		for (int i = 0; i < 6; i++) {
			Random random = new Random();
			j = random.nextInt(45);
			
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}

		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
		for (int i = 0; i < 6; i++) {
			System.out.println("ball["+ i + "] = " + ball[i]);
		}

	}

}
