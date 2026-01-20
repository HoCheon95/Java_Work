/*
 * 자바의 산술(수학) 연산자 종류)
 *  +(덧셈), 
 *  -(뺄셈), 
 *  *(곱셈), 
 *  /(나눗셈: 나숫셈 할 때 주의할 것은 정수 숫자를 나눗셈하면 소수점 아래가 버려지고 몫만 구한다. 
 *   		실수 숫자를 나눗셈 하면 하나의 실수 숫자값을 구한다.), 
 *   %(나머지)
 */
public class DataType02 {

	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		int re = 0;
		double result = 0.0;

		re = a + b;
		System.out.println(a + " + " + b + " = " + re);

		re = a * b;
		System.out.println(a + " * " + b + " = " + re);

		re = a / b;
		System.out.println(a + " / " + b + " = " + re);

		re = a % b;
		System.out.println(a + " % " + b + " = " + re);

		result = (double) a / b; // 자동산술법에 의해서 int가 더 큰타입 double으로 형변환이 이루어진다.
		// 결국 double/double이 된다. 실수 숫자를 나눗셈하면 자바는 소수점을 포함한 실수 숫자값 까지 구함.
		// (double)을 캐스팅 형변환 연산자이다.
		System.out.println("result = " + result);
	}

}
