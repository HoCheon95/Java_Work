/*
 * if else if 다중 조건문을 활용한 학점구하기
 * 
 */

import java.util.Scanner;

public class OperEx06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("0~100 사이의 정수숫자 정수만 입력 : ");
		int score = Integer.parseInt(scan.nextLine());
		char grade = ' ';
		
		if(!(score >= 0 && score <= 100)) {
			System.out.println("0부터 100사이 점수만 입력하세요!");
		}else {
			if(score >= 90 && score <= 100) {
				grade = 'A';
			}else if(score >= 80 && score <= 89) {
				grade = 'B';
			}else if(score >= 70 && score <= 79) {
				grade = 'C';
			}else if(score >= 60 && score <= 69) {
				grade = 'D';
			}else {//0 ~ 59 점까지는 F
				grade = 'F';
			}// if else if end
			
			System.out.printf("당신이 입력하신 점수 %d점은 %c학점 입니다.\n", score, grade);
		}//if else
	}// main()
}
