/*
 * 자바 산술 / 수학 연산자
 */
public class ConvEx11 {

	public static void main(String[] args) {
		
		int a = 10;
		int b= 4;
		
		System.out.printf("%d + %d = %d\n", a ,b, a+b);
		
		int result = a*b;	//*는 곱셈 연산자
		System.out.println(a + " * " + b + " = " + result);
		
		result = a/b;	// /는 나눗셈 연산 -> 정수 숫자를 나눗셈 하면 소수점 아래는 버려지고 몫만 구한다.
		System.out.println(a + " / " + b + " = " + result);
		
		result = a%b;
		System.out.println(a + " % " + b + " = " + result);	//나머지 값은 2
		
		System.out.println(a/(double)b);	//int/double은 자동산술법에 의해서 더 큰 타입인 double 실수형으로 자동형 변환이 된다.
											//결국 double/double이 되어서 실수 숫자를 나눗셈 하면 그 결과는 하나의 소수점을 포함한 실수숫자값을 구한다. 2.5
		
		
	}

}
