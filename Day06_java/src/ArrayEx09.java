/*
 * 배열원소 최대값과 최소값 구하기
 */
public class ArrayEx09 {

	public static void main(String[] args) {

		int[] javaScore = { 94, 99, 100, 90, 95 };

		int max = javaScore[0]; // 첫번째 배열원소값을 최대값으로 초기화
		int min = javaScore[0]; // 첫번째 배열원소값을 최소값으로 초기화

		/*
		 * 문제) 배열의 최대값과 최소값을 구하는 나머지 자바코드를 완성해 본다.
		 */
		for (int i = 1; i < javaScore.length; i++) {
			if (max < javaScore[i]) { // 최대값
				max = javaScore[i];
			}

			if (min > javaScore[i]) { // 최소값
				min = javaScore[i];
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("\n\n ========================================== \n");
		
		for (int i = 1; i < javaScore.length; i++) {
			if (javaScore[i] > max ) { // 최대값
				max = javaScore[i];
			}else if (javaScore[i] < min ) { // 최소값
				min = javaScore[i];
			}
		}
		
		System.out.printf("javaScore 배열원소값 중 최대값 = %d \n", max);
		System.out.println("javaScore 배열원소값 중 최대값 =  " + min);

	}

}
