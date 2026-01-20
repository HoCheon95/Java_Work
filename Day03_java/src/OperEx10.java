/*
 * if 조건문과 if ~ else 조건문 실습소스)
 */

import java.util.Scanner;

public class OperEx10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		/* 이클립스 계열의 개발툴에서 ctrl + a 단축키로 전체 선택하고
		 * ctrl + i 단축키를 누르면 자동정렬된다.*/
		
		System.out.print("정수 숫자 입력 : ");
		int number = Integer.parseInt(scan.nextLine());
		
		if(number == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(number != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
		System.out.println("\n ================================= \n");
		
		/*
		 * 문제) 위에서 스캐너로 입력받은 정수숫자를 가지고 if ~ else 조건문을 사용해서 숫자 0인 경우는 "입력한 숫자는 0"라고 출력되게 하고
		 * 아닐때는 "입력한 숫자는 0이 아니다"라고 출력되게 하는 자바 프로그램 코드를 만들어 본다.
		 * 결국 위 if조건문 2번 사용한 것을 if~else if 조건문으로 변경하라는 문제이다.
		 */
		
		if (number != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}else if (number == 0) {
			System.out.println("입력하신 숫자는 0입니다.");		}
		
		scan.close();
	}
}
