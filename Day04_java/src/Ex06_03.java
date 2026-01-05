/*
 * 06.반복문.pdf No.20쪽 3번문제)
 * 10부터 1사이의 짝수를 10,8,6,4,2 로 출력하는 자바 프로그램을 만들어 본다.
 * (주의할 것은 2를 출력하고 ,가 출력안되게 해야 한다.
 */
public class Ex06_03 {

	public static void main(String[] args) {

		// 답안 코드 (while 반복문만 사용해야 한다.)
		int i = 10;

		
		while (i >= 1) {
			if (i % 2 == 0) {// 짝수
				if (i == 2) {// i가 2가 될 경우 , 제거
					System.out.print(i);
				} else {
					System.out.print(i + ", ");
				}
			}
			i--; // i-- 1씩 감소
		} // while
		
		
		System.out.println("\n\n ========================= \n");
		
		i=10;
		
		while(i > 2) {	
			System.out.print(i + ", ");
			i-=2; //2씩 감소
		}
		System.out.print(i);
		
		System.out.println("\n\n ========================= \n");
		
		i = 10;
		
		while(i>=2) {
			System.out.print(i);
			if(i>2) {//10 8 6 4만 ,가 출력되게 하고 2다음에는 ,를 출력안되게 하는 조건
				System.out.print(", ");
			}//if
			i-=2;
		}
	}// main
}
