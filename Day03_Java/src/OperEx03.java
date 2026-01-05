/*
 * if ~ else 조건문 형식)
 *  if(조건식){
 *  	조건식이 참이면 실행;
 *  }else{
 *  	조건식이 거짓이면 실행;
 *  }
 */
//스캐너로 부터 양의 정수숫자를 입력받아서 if~else 조건문을 활용해서 홀수인지 짝수인지 판별하는 자바 프로그램이다.

import java.util.Scanner;

public class OperEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수숫자 입력 : ");
		String inputA = scan.nextLine(); //문자열로 입력받는다.
		int inputNumber = Integer.parseInt(inputA);	//정수숫자로 변경
		
		if(inputNumber > 0) {
			if(inputNumber % 2 == 0) {
				System.out.println(inputNumber + "는(은) 짝수이다.");
			}else {
				System.out.println(inputNumber + "는(은) 홀수이다.");
			}
		}else {
			System.out.println("양의 정수 숫자만 입력하세요!");
		}//if else

	}

}
