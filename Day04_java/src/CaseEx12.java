
/*
 * do ~ while 반복문을 사용한 예)
 *  Math.rendon() 내장메서드는 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생시킨다. 이를 활용하여 1부터 100사이
 *  임의의 정수 숫자 난수를 발생시키고, 사용자로 부터 1부터 100사이의 임의의 정수 숫자를 입력받아서 이를 맞추는 실습 소스이다.
 */
import java.util.Scanner;

public class CaseEx12 {

	public static void main(String[] args) {

		int number = 0;
		int answer = (int) (Math.random() * 100) + 1;	//random() 메서드는 0.0 이상 1.0 미만 사이의 실수 숫자 난수를 발생시킨다.
														//-> 여기에 *100하면 0.0이상 100.0 미만 사이의 실수 숫자 난수 발생
														//->(int)로 캐스팅 형변환 하면 소수점 이하는 버리고 정수 숫자만 구함. 즉 0이상 100 미만 사이의 정수 숫자 난수 발생
														//->+1하면 1이상 101미만 사이 정수숫자 난수 구함. 결국 1부터 100사이의 임의의 정수수자 난수를 구함

		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1~100사이의 임의의 정수숫자 입력 : ");
			number = Integer.parseInt(scan.nextLine());
			
			if(number > answer) {
				System.out.println("더 작은 숫자를 입력하세요!");
			}else {
				System.out.println("더 큰 숫자를 입력하세요!");
			}
		}while(number != answer);
		
		System.out.println("정답 숫자는 " + number + " 입니다.");

	}

}
