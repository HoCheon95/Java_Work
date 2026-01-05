/*
 * 자바의 비교(관계) 연산자 종류)
 *  1. 비교연산자 결과값은 true or false 인 boolean 타입이다.
 *  2. 비교연산자 종류)
 *  	> (~보다 크다), >= (~보다 크거나 같다), < (~보다 작다), <= (~보다 작거나 같다), == (같다), != (같지 않다)
 */
public class ConvEx04 {

	public static void main(String[] args) {
		
		boolean flag = false;
		int a = 10, b = 9;
		
		flag = (a > b);
		System.out.printf("%d > %d : %b\n", a, b, flag);	// true, %b는 boolean 타입 출력형태 지시자이다.
		
		flag = (a == b);
		System.out.println(a + " == " + b + " : " + flag);	// false
		
		flag = (a != b);
		System.out.printf("%d != %d : %b\n", a, b, flag);	// true
		
		flag = (a + b) > (a - b);
		System.out.println(flag);							// true
		
	}

}
