/*
 * 자바언어에서 + 연산기호 특징)
 *  1. 숫자 + 숫자는 덧셈을 한다.
 *  2. 숫자 + 문자에서는 문자를 우선해서 숫자가 문자로 변경된다. 그래서 문자 + 문자가 되어서 서로 연결한다. 여기서는 문자열 연결 연산기호로 사용된다.
 */
public class ConvEx03 {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 7;
		int result = a + b;	// 숫자 + 숫자 즉 덧셈을 한다.
		System.out.printf("%d + %d = %d\n", a, b, result);
		
		String result02 = a + "7";	// 숫자 + 문자에서 문자를 우선해서 숫자를 문자로 변경한다. 즉 문자 + 문자인 "7" + "7"이 되어서 문자를 서로 연결한다.
		System.out.printf("result02 = %s\n", result02);	// %s는 문자열 출력형태 지시자
		
	}

}
