import java.util.Scanner;

/*
 * 스캐너를 활용한 이중 for 반복문 실습소스)
 */

public class CaseEx07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("$특수문자를 출력할 라인행 줄수를 입력 : ");
		int lineNumber = Integer.parseInt(scan.nextLine());
		
		/*
		 * 문제) 이중 for 반복문을 사용해서 $를 다음과 같이 출력되게 하는 자바코드를 만들어 보자.
		 * 
		 * $
		 * $ $
		 * $ $ $
		 */
		//답안코드
		
		int i;
		int j;
		
		for(i = 1; i <= lineNumber; i++) {	// lineNuber 을 입력받고 조건식을 건다.
			for(j = 1; j <= i; j++) {		// i = 1일떄 "$" 출력 1번, i = 2일때 "$" 출력 2번, i = 3 "$" 3번 출력
				System.out.print(" $ ");
			}//inner for
			System.out.println();	//줄바꿈
		}//outer for
		
		System.out.println("\n ============================================ \n");
		/*
		 * 		$ $ $
				$ $
				$
				
			i=3 j=3
			i=2 j=2
			i=2 j=1
			
		 */
		int num = lineNumber;
		
		for(i = num; i >= 1; i--) {		
			for(j = 1; j <= i; j++) {
				System.out.print(" $ ");	
			}
			System.out.println();
		}

		
		scan.close();

	}//main



}
