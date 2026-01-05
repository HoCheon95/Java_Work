/*
 * if else if 다중 조건문 형식)
 *  if(조건식 1){
 *  
 *   조건식 1이 참이면 실행;
 *   
 *  }else if(조건식 2){
 *  
 *   조건식 2가 참이면 실행;
 *   
 *  }else{
 *  
 *   조건식 1,2 모두 거짓일 떄 실행;
 *   
 *  }
 */

import java.util.Scanner;

public class OperEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 숫자 입력 : ");
		int number = Integer.parseInt(scan.nextLine());	//정수로 입력 받을때 이방식 꼭 사용하기
		
		if(number > 0) {
			System.out.printf("%d는(은) 양수이다.\n", number);			
		}else if (number < 0) {
			System.out.println(number + "는(은) 음수이다.");
		}else {
			System.out.println("0 이다.");
		}// if else end

	}

}
