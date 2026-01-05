import java.util.Scanner;
/*
 * 자바의 논리연산자 종류)
 * 1. 논리연산자 결과값은 boolean 타입인 true or false 이다.
 * 2. 논리연산자 종류)
 *  가. &&(논리곱 : and) 	: 입력값 모두 true이면 결과값도 true이다. 나머지는 모두 false이다.
 *  나. ||(논리합 : or) 	: 2개의 조건중 하나라도 참이면 결과값도 참 즉 true이다. 둘다 false 일 때만 결과값은 false이다.
 *  다. !=(논리부정 : not) 	: 입력값이 true이면 결과값은 false이고, 반대로 입력값이 false이면 결과값은 true이다.
 */
public class ConvEx06 {

	public static void main(String[] args) {
		
		boolean result = false;
		result = (true && true);
		System.out.printf("%b && %b : %b\n", true, true, result);	// 결과값은 true
		
		result = (false || false);
		System.out.println("false || false : " + result);	// 결과값은 false
		
		result = !false;	// flase 반대는 true
		System.out.println("!false : " + result);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력 >> ");
		int age = Integer.parseInt(scan.nextLine());	// 문자열 숫자로 입력받아서 정수숫자로 변경
		String resultAnser = (age >= 20 && age <= 29)?"20대이다. " : "20대가 아니다.";	//삼항 조건연산자
		
		System.out.println(age + "세는 " + resultAnser);

	}

}
