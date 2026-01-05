import java.util.Scanner;	// import예약어로 java.util 패키지 폴더의 Scanner 클래스를 읽어들임.
/*
 * 자바의 삼항조건연산자 형식)
 *  조건식 ? 조건식이 참이면 실행 : 조건식이 거짓이면 실행;
 */

public class ConvEx05 {
	// 스캐너로 부터 첫번째 정수, 두번째 정수값을 각각 입력받아서 정수숫자로 변경한 다음 삼항조건연산자로 두 수 중 더 큰 수를 구하는 실습소스

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * 이클립스 개발툴에서 외부패키지인 java.util의 Scanner클래스를 임포트 하기 위해서는 ctrl + shift + o(영문자)를 사용하면 된다.
		 * Scanner내장 api클래스 특징)
		 *  1. 자바 5(jdk 1.5) 버전에서 추가된 것으로 텍스트 콘솔모드로 부터 입력받은 값을 읽어들일 때 사용한다.
		 *  2. System.in 은 키보드 입력장치와 연결된다. new키워드로 새로운 객체명 scan생성
		 */
		
		System.out.print("첫번째 정수수자 입력 >> ");
		String number01 = scan.nextLine();	// 문자열로 읽어들임
		int num01 = Integer.parseInt(number01);	// 읽어들인 문자열을 parseInt()메서드로 정수숫자로 변경한다.
		
		System.out.print("두번쨰 정수숫자 입력 >> ");
		int num02 = Integer.parseInt(scan.nextLine());	// 읽어들인 문자열 숫자를 정수숫자로 변경
		
		int max = (num01 > num02) ? num01 : num02;	// 삼항조건연산자 사용
		System.out.printf("%d 와 %d 중 더 큰 수는? %d\n", num01, num02, max);
	}
}
