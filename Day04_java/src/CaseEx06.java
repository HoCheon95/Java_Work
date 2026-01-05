/*
 * for 반복문에서 초기치, 증감식이 각각 2개씩 나오고, 이 중 for 반복문을 다루는 실습소스)
 */
public class CaseEx06 {
	public static void main(String[] args) {
		
		for(int i = 1, j = 5; i <= 5; i++, j--) {
			System.out.printf("%d \t %d \n", i, j);
		}
		System.out.println(" \n ======================================= \n");
		
		//이중 for 반복문
		for(int i =1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++ ) {
				System.out.print(" #");
			}//inner for
			System.out.println();//줄바꿈 -> 개행
		}//outer for

	}//main
}
