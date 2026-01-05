
/*
 * 자바의 수학 산술연산자 종류)
 * +(덧셈), -(뺄셈), *(곱셈), /(나눗셈 : 주의할 것은 자바에서 정수숫자를 나눗셈하면 소수점 아래가 버려지고 몫만 구한다.
 * 두 실수숫자를 나눗셈하면 하나의 실수숫자값을 구한다.), %(나머지)
 */

public class ConvEx02 {

	public static void main(String[] args) {
		
		int a = 10, b = 4, result = 0;	// 3개의 int타입 변수를 한꺼번에 선언하고 초기화를 함
		
		result = a+b;
		System.out.println(a + " + " + b + " = " + result);
				
		result = a-b;
		System.out.println(a + " - " + b + " = " + result);
		
		result = a*b;
		System.out.println(a + " * " + b + " = " + result);
		
		System.out.println(a + " / " + b + " = " + (a/b));
		
		result = a%b;
		System.out.println(a + " % " + b + " = " + result);
		
		double c = (double)a/b;	// 자동산불법에 의해서 double/double 이 된다. 결국 실수 숫자값을 나눗셈 하면 하나의 실수숫자값 2.5를 구한다.
		System.out.println("10.0 / 4.0 = " + c);

	}

}
