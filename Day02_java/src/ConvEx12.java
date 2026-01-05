/*
 * 명시적인 형변환(캐스팅) 연산자를 사용
 */
public class ConvEx12 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);	//자동산술법에 의해서 byte형이 int타입으로 형변환이된다. 결국 byte + byte -> int + int = int 가 된다.
								//덧셈 결과값은 4바이트 int이다. 이것을 1바이트 크기인 byte형 변수 c에 저장하려고 할 때 캐스팅 연산자인 (byte)로 명시적인 형변환을 해야 한다.
		
		System.out.println(a + " + " + b + " = " + c);	//30
		
		int d = a+b;
		System.out.printf("%d + %d = %d\n", a, b, d);
		
		b = 30;
		c = (byte)(a*b);	//곱셈 결과값은 byte 형 범위를 벗어나서 자료손실이 발생한다.
		System.out.println(a + " * " + b + " = " + c);
		
		d = a * b;
		System.out.printf("%d * %d = %d\n", a, b, d);

	}

}
