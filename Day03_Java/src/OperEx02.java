/*
 * if 조건문 형식)
 * 	if(조건식){
 *		조건식이 참이면 실행; 
 * 	}
 * 실행문장이 한줄 이상되면 반드시 {} 중괄호 블록으로 같이 묶어야 한다. 하지만 한줄인 경우는 {}블록을 해도 되고 안해도 된다.
 * 
 */
//스캐너로 부터 음의 정수를 입력받아서 if조건문을 활용해서 절대값을 구하는 소스이다.

import java.util.Scanner;

public class OperEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("음의 정수 숫자 입력 >> ");
		int number = Integer.parseInt(scan.nextLine());	//nextLine()메서드로 문자열로 입력받아서 parseInt() 정적메서드로 정수숫자로 변경한다.
		
		if(number < 0) {
			number = -number;	//절대값을 구한다.	
		}//if end
		
		System.out.printf("양의 절대값 = %d\n", number);
		
	}

}
