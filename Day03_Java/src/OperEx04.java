/*
 * 문제) 스캐너를 활용해서 첫번째 정수값, 두번째 정수값을 입력받아서 if~else 조건문을 사용해서 최대값과 최소값을 구하는 자바 프로그램을 만들어 보자.
 */

import java.util.Scanner;

public class OperEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수를 입력하세요 : ");
		int num1 = Integer.parseInt(scan.nextLine());
		//int num1 = scan.nextInt();	// 정수로 입력 받는다.
		
		System.out.print("두번쨰 정수를 입력하세요 : ");
		int num2 = Integer.parseInt(scan.nextLine());
		//int num2 = scan.nextInt();	// 정수로 입력 받는다.
		
		int max = 0, min = 0;
		
		// num1 과 num2의 크기를 비교
		if(num1 > num2) {	// num1이 크면 실행
							
			max = num1;
			min = num2;
			
		}else {	// if의 조건이 false일 경우 실행
			
			max = num2;
			min = num1;
			
		}// if else end
		System.out.printf("최대값 : %d, 최소값 : %d\n", max, min);	
	}

}
