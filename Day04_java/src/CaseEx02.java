/*
 * 명확한 반복횟수가 정해진 경우는 for 반복문을 많이 사용한다.
 * for 반복문 형식)
 * for(초기치; 조건식; 증감식){ //여기서 ;은 구분연산 기호이다.
 *	조건식이 참일동안만 반복실행;
 * }
 */
public class CaseEx02 {

	public static void main(String[] args) {
		
		int i; //반복문 제어변수
		for(i=1; i<=3; i++) {
			System.out.print(i+"\t");// \t 이스게이프 문자는 탭키만큼 수평으로 띄운다.
		}
		System.out.println("\n ================================= \n"); // \n 이스게이프 문자는 줄바꿈을 한다.
		
		//3부터 1까지 1씩 감소한다.
		for(i=3; i>=1; i--) {
			System.out.print(i + "\t");
		}
		System.out.println("\n ================================= \n"); // \n 이스게이프 문자는 줄바꿈을 한다.
		
		//1 3 5 7 9
		for(i=1; i<=9; i+=2) {//i+=2 복합대입연산자는 i=i+2와 같은 기능을 한다. 2씩 감소
			System.out.print(i + "\t");
		}
		System.out.println("\n ================================= \n"); // \n 이스게이프 문자는 줄바꿈을 한다.
		
		//10 8 6 4 2
		for(i=10; i>=2; i=i-2) {//i=i-2를 줄여서 i-=2로 표현가능하다. 즉 2씩 감소
			System.out.print(i + "\t");
		}
		System.out.println("\n ================================= \n"); // \n 이스게이프 문자는 줄바꿈을 한다.
	}//main

}
