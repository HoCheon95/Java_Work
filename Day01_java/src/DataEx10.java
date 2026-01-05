/* 자바언어에서 텍스트 콘솔 모드에서 입력한 데이터를 쉽게 읽어들이기 위해서는 자바5버전(jdk 1.5)에서 추가된
 * java.util패키지의 Scanner 내장 api클래스를 많이 사용한다. 외부 패키지 폴더의 api 를 읽어들일 때(임포트 : import)
 * 사용하는 이클립스(STS)개발 툴 기준 단축키는 ctrl + shift + 영문자 o를 동시에 누르면 된다.
 */

import java.util.Scanner;	// import 예약어에 의해서 java.util패키지의 Scanner클래스를 읽어들인다.

public class DataEx10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/* 
		 * 1. System.in은 키보드 입력장치와 연결된다. System.out 과는 반대개념이다. System.out은 모니터 출력장치와 연결
		 * 
		 * 2. new 키워드로 새로운 객체명 scan 생성
		 */
		
		System.out.print("오늘 수령한 교재명은 무엇인가요? >> ");
		String lunchFood = scan.nextLine();	// 문자열로 입력받는다.
		System.out.printf("오늘 수령한 교재명 : %s \n", lunchFood);
		
		System.out.println("첫번째 줄 \n 두번쨰 줄 %n 세번째 줄");	// println 에서는 %n 사용불가 printf에서 사용가능
		
	}

}
