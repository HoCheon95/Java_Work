/*
 * switch ~ case 다중조건문을 활용한 학점 구하기
 */

import java.util.Scanner;

public class OperEx08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("0부터 100사이 정수 숫자 자바 점수만 입력 : ");
		String jumsu = scan.nextLine();	//문자열로 입력받음
		int score = Integer.parseInt(jumsu);	//입력받은 문자열점수 숫자를 정수숫자로 변경
		
		if(!(score >= 0 && score <= 100)) {	// ! (조건문) | 조건문이 아닌경우 실행
			System.out.println("0~100 사이 정수숫자 자바점수만 입력하세요!");
		}else {
			System.out.print("입력한신 점수 " + score + "는(은)");
			
			score = score / 10; //정수숫자를 10으로 나눗셈하면 소수점 아래는 버려지고 결과 몫만 구한다.
			switch(score) {
				case 10 : 
				case 9 : System.out.println(" A학점 입니다."); break;
				case 8 : System.out.println(" B학점 입니다."); break;
				case 7 : System.out.println(" C학점 입니다."); break;
				case 6 : System.out.println(" D학점 입니다."); break;
				default : System.out.println(" F학점 입니다.");		
			}//switch ~ case end
		}//if else end
		scan.close();	//스캐너를 닫는다.
	} //main
}
