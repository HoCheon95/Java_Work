import java.util.Scanner;

/*
 * 06장.반복문.pdf No.19쪽 2번문제)
 *  1부터 입력받은 숫자값까지의 홀수를 출력하는 자바 프로그램을 작성해 본다. 
 *  (단, 하나는 for 반복문에서 1씩 증가하면서 if 조건문과 %나머지 연산, == 비교연산을 사용해야 하고,
 *  나머지 하나 for 반복문은 2씩 증가하면 된다.)
 */
public class Ex06_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int Num = Integer.parseInt(scan.nextLine()); // 정수를 입력받음

		//1씩 증가
		for (int i = 1; i <= Num; i++) {
			if (i % 2 == 1) {// i를 % 2를 해서 나머지가 == 1 과 같다는 조건식
				System.out.print(i + " ");// 홀수
			}// if ~ else end
		}// for end

		System.out.print("\n ================================ \n");
		
		//2씩 증가
		for (int i = 1; i <= Num; i += 2) {// i를 1로 시작 해서 +2 를 해주면 i가 홀수만 나옴
			System.out.print(i + " ");
		}
		scan.close();
	}// main

}
