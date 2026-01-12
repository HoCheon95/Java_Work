
public class DataType07 {

	public static void main(String[] args) {
		
		/*
		 * for 반복문 형식)
		 *  for(초기치; 조건식; 증감식){
		 *  	조건식이 참일동안만 반복실행;
		 *  }
		 */
		
		int i;//반복문 제어변수
		for (i = 1; i <= 10; i++) {
			System.out.print(" " + i);// 1 2 3 4 5 6 7 8 9 10
		}
		System.out.println("\n ==================== \n");
		
		
		for (i = 1; i < 10; i += 2) {
			System.out.print(" " + i);// 1 3 5 7 9
		}
		System.out.println("\n ==================== \n");
		
		for (i = 10; i >= 2; i = i - 2) {
			System.out.print(" " + i);// 10 8 6 4 2
		}
		System.out.println("\n ==================== \n");
		
		/*
		 * while 반복문 형식)
		 *  while(조건식){
		 *  	조건식이 참일동안만 반복실행;
		 *  	증감식;
		 *  }
		 */
		
		
		i = 1;
		int sum = 0;//누적합을 저장할 변수
		
		while (i <= 10) {
			sum += i;
			i++;
		}		
		System.out.printf("1 부터 10까지 누적합 = %d \n", sum);
		//55 %d 는 10진수 정수 출력형태 지시자 \n 줄바꿈해주는 이스게이프 문자이다.
		
		
	}

}
