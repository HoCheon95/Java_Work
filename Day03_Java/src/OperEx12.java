/*
 * 1. switch ~ case 다중선택문을 활용한 봄, 여름, 가을, 겨울 계절 구하기
 * 2. if else if 다중 조건문을 활용한 봄, 여름, 가을, 겨울 계절 구하기 문제
 */
import java.util.Scanner;

public class OperEx12 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("1월부터 12월사이 월을 입력 : ");
		int month = Integer.parseInt(scan.nextLine());	//문자열로 입력받아서 정수 숫자로 변경

		if(!(month >= 1 && month <= 12)) {
			System.out.println("1월부터 12월 사이 월만 입력하세요!");
		}else {
			System.out.print("입력하신 " + month + "월은 ");
			switch(month) {
			case 12 : case 1 : case 2:
				System.out.println("겨울 입니다.");
				break;
			case 3: case 4: case 5:
				System.out.println("봄 입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("여름 입니다.");
				break;
			default:
				System.out.println("가을 입니다.");
			}//switch ~ case end
			System.out.println("\n ===========================\n ");

			/*
			 * 문제) if else if 다중 조건문과 논리합(||), ==같다 연산만 활용하여 입력하신 월로 봄, 여름, 가을, 겨울을
			 * 구하는 자바 프로그램 코드를 완성해 본다.
			 */

			String season = "";	//계절을 저장할 변수

			if(month == 12 || month == 1 || month == 2){
				season = "겨울";
			}else if(month == 3 || month == 4 || month == 5){
				season = "봄";
			}else if(month == 6 || month == 7 || month == 8){
				season = "여름";
			}else {
				season = "가을";
			}

			System.out.println("입력하신 " + month + "월은 " + season + " 입니다.");
			scan.close();
			
		}//if else end
	}//main
}
