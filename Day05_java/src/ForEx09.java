/*
 * while 무한루프문을 사용한 점심 메뉴 선택 예제)
 */

import java.util.Scanner;

public class ForEx09 {

	public static void main(String[] args) {

		int menu = 0; // 선택한 메뉴번호

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1- 순대국밥");
			System.out.println("2- 김치찌개");
			System.out.println("3- 백반");
			System.out.print("원하는 점심메뉴(1~3)을 선택하세요.(종료:0)>>");

			menu = Integer.parseInt(scan.nextLine());// 문자열로 입력받아서 성수숫자로 변경

			if (menu == 0) {
				System.out.println("점심 메뉴 선택 프로그램을 종료합니다.");
				break;
			} else if (!(menu >= 1 && menu <= 3)) {
				System.out.println("점심 메뉴번호를 잘못 선택했습니다!(종료:0)>>");
				continue; // 아래 문장을 수행 안하고 다음 반복을 위해서 반복문 처음으로 돌아가 다음 반복을 계속한다.
			} // if else if 다중 조건문
			System.out.println("선택하신 메뉴번호는 " + menu + "번 입니다.");
		} // while end

	}

}
