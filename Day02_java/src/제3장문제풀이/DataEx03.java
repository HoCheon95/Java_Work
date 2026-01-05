package 제3장문제풀이;

/** 03장.자료형.pdf No.33쪽 3번문제 */

public class DataEx03 {

	public static void main(String[] args) {
		
		byte var01 = 127;
		short var02	= 128;
		int var03 = 128;
		long var04 = 128L;
		
		var04 = var01;	// 1바이트 크기가 8바이트 lnong타입으로 암시적인 자동형 변환
		System.out.println("var01 = " + var01 + ", var04 = " + var04);
		
		var01 = (byte)var03;	// 4바이트가 1바이트로 크기가 줄어들 때는 자료손실 위험때문에 자바는 자동형변환을 해주지 않는다.
								// (byte) 캐스팅 형변환 연산자를 사용해서 명시적인 형변환을 해야한다. 저장되는 값이 byte 형 최대 값 범위를 벗어나서 최소값이 저장됨.
		System.out.println("var01 = " + var01 + ", var03 = " + var03);
		
		float var05 = 123456.789123f;
		double var06 = 123456.789123;
		System.out.println("var05 = " + var05);	// 출력되는 float타입 변수값은 정밀도가 7자리어서 소수점이하 부분이 잘려서 출력된다.
		
		var05 = (float)var06;
		System.out.println("var05 = " + var05 + ", var6 = " + var06);
		
		// No.34쪽 5번문제
		
		//int false;		// false는 키워드 즉 예약어이다. 자바에서 예약어는 변수명으로 사용못한다.
		//double default;	// defalut도 키워드 이다. 변수명으로 사용못함.
		String _object;
		//String a-class;		// 자바 변수명에 -(하이픈)를 포함할 수 없다. | _(언더바) 사용가능
		
	}

}
