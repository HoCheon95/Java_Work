/*
 * switch ~ case 다중 선택문(조건문) 형식
 *  switch(정수식) {
 *  	case 값 : 실행문장; break;
 *  	.. 중략
 *  
 *  	default : 해당 사항 없을 때 실행;
 *  }
 *  
 *  정수식과 case값이 일치하면 해당 실행문장을 수행 후 break 문을 만나서 switch ~ case 다중 선택문을 종료한다.
 *  해당 사항이 없을 때는 default 문을 실행한다.
 */

import java.util.Scanner;
//switch ~ case 문에 break 문을 생략한 관리자 단 등급 처리에 관한 실습소스
public class OperEx07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("관리자 등급 6 ~ 9사이 입력 : ");
		int grade = Integer.parseInt(scan.nextLine());
		
		if(6 <= grade && grade <= 9) {
			
			System.out.print("입력하신 등급 " + grade + "는(은) ");
			
			switch(grade) {
				case 9 : System.out.println("최고 관리자 등급입니다."); //break문을 생략해서 switch ~ case 다중 선택문을 종료하지 못하고 아래문장 모두 실행한다.
				case 8 : System.out.println("관리자 등급입니다.");
				case 7 : System.out.println("중간 관리자 등급입니다.");
				case 6 : System.out.println("사용자 등급입니다.");
			}//switch ~ case end
			
		}else {
			System.out.println("6에서 부터 9사이 관리자 등급만 입력하세요!");
		}// if else end

	}// main

}
