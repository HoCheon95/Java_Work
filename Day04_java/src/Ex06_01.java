
/*
 * 06장.반복문.pdf No.18쪽 1번문제)
 * 문자와 숫자를 입력받아 해당 문자를 입력받은 숫자만큼 반복 출력하는 자바 프로그램을 만들어 본다.
 * (for 반복문 사용)
 */
import java.util.Scanner;

public class Ex06_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("문자와 숫자를 입력하시오 : ");

		String ch = scan.next();					//문자를 입력 받음
		int Num = Integer.parseInt(scan.next());	//next() + nextLine() 입력 꼬임 문제 발생 | next() + next() 이렇게 사용해야됨

		for (int i = 1; i <= Num; i++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		scan.close();
	}// main
}
