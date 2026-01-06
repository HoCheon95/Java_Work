/*
 * switch ~ case 다중 선택문 형식)
 *  switch(정수식){
 *  	case 값: 정수식과 값이 일치하면 실행; break;
 *  	..중략
 *  	default: 해당 사항 없을떄 실행;
 *  }
 *  break 문을 만나면 switch~case 문 종료한다.
 */

import java.util.Scanner;

public class DataType06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수숫자 나이만 입력(0~100): ");
		int age = Integer.parseInt(scan.nextLine());
		
		if(!(age >= 0 && age <= 100)) {
			System.out.println("나이는 0부터 100세 사이만 입력하세요!");
		}else {
			System.out.print("입력하신 " + age + "세는");
			age = age / 10;
			switch(age) {
				case 10: System.out.println(" 100대 입니다."); break;
				case 9: System.out.println(" 90대 입니다."); break;
				case 8: System.out.println(" 80대 입니다."); break;
				case 7: System.out.println(" 70대 입니다."); break;
				case 6: System.out.println(" 60대 입니다."); break;
				case 5: System.out.println(" 50대 입니다."); break;
				case 4: System.out.println(" 40대 입니다."); break;
				default: System.out.println(" 0세 ~ 9세, 10대, 20대, 30대 입니다."); break;
			}
		}

	}

}
