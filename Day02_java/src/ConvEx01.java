/*
 * 캐스팅 형변환 연산자와 음의 십진 정수수자를 이진수로 변환하는 소스 예)
 */
public class ConvEx01 {

	public static void main(String[] args) {
		
		int i=10;
		byte b = (byte)i;	// (byte)캐스팅 형변환 연산자를 활용해서 4바이트를 1바이트 크기로 축소되는 명시적인 형변환
		System.out.printf("[int -> byte] i = %d, b = %d \n", i, b);
		
		i = 300;
		b = (byte)i;	// byte형 최대값 범위를 벗어나서 자료손실이 발생한다.
		System.out.printf("[int -> byte] i = %d, b = %d \n", i, b);
		
		// 음의 십진수 정수를 이진수로 변환 예 소스
		
		i = -2;
		System.out.println("10진 음의 정수값을 이진 문자열로 변환 : " + Integer.toBinaryString(i));
		
		/*
		 * 자바의 자동산술법이란?
		 * 자바는 작은 크기의 타입에서 큰 크기의 타입으로 변환할 때는 값 손실 위험이 없기 때문에 암묵적인 자동형 변환을 해준다.
		 * 
		 * byte(1바이트) -> short, char 각 2바이트 -> int(4바이트) -> long(8바이트) -> float(4바이트) -> double(8바이트)
		 * 
		 * 결국 왼쪽에서 오른쪽으로 크기가 더 큰 타입으로 자동산술법에 의해서 자동형변환을 하면서 연산수행을 한다.
		 * 예를 들면, 7 + 10.0은 int + double 이어서 자동산술법에 의해서 double + double이 된다.
		 * 7.0 + 10.0 = 17.0 8바이트 double타입이 된다.
		 */

	}

}
