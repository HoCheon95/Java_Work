/*
 * for 반복문을 사용한 8단 구구단 구하기와 1부터 10까지의 누적합에 관한 소스이다.
 */
public class CaseEx03 {
	public static void main(String[] args) {
		
		int i; //반복문 제어변수
		int sum = 0; //누적합을 저장할 변수
		int guguDanTitle = 8;
		
		System.out.println("<<============= " + guguDanTitle + "단 =============>>");
		for(i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n", guguDanTitle, i, guguDanTitle * i);
		}
		System.out.println("\n ======================================= \n");
		
		//1부터 10까지의 누적합
		for(i=1; i<=10; i++) {
			sum += i;//누적합을 저장
		}
		System.out.println("1부터 10까지의 누적합 = " + sum);

	}//main
}
