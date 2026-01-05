import java.util.Scanner;
/*
 * while 반복문 조건식을 true로 설정하면 영원히 반복하는 무한루프문이 된다. 스캐너로 부터 정수 숫자를 입력받아서 누적합을 구하고 0을 입력한 경우 조건식을
 * 거짓으로 해서 무한루프 반복문을 중단한다.
 */
public class CaseEx11 {
	public static void main(String[] args) {
		
		int number = 0;
		int sum = 0;
		boolean flag = true;
		
		System.out.println("누적합을 구할 숫자를 입력하세요! 반복문을 끝내려면 0을 입력 : ");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner scan = new Scanner(System.in);
			number = Integer.parseInt(scan.nextLine());
			
			if(number != 0 ) {
				sum += number; //누적합
			}else {//입력값이 0일 때 실행
				flag = false;
			}
		}//while end
		
		System.out.println("누적합 = " + sum);

	}//main
}
