package 제3장문제풀이;

/** 03장.자료형.pdf No.32쪽 2번문제 */

public class DataEx02 {

	public static void main(String[] args) {
		
		byte var1 = 128;			// A	byte 타입의 최대값(1바이트) 범위는 -128 ~ 127이다.
		short var2 = 128;			// B
		int var3 = 28L;				// C 	int 타입으로 선언된 변수에 저장되는 값에는 접미사 L or l을 붙이지 않는다. | long -> int 자동형변환 불가 
		long var4 = 128L;			// D
		float var5 = 123456.789123;	// E	float 타입 실수숫자값 뒤에는 접미사 F or f 붙여서 사용 한다. | 정밀도 유효숫자 7자리 ex) 123456.79
		double var6 = 123456.789123;// F	double타입 실수숫자값 뒤에는 접미사 d or D가 생략됨.
									//		생략된 이유는 double이 자바의 실수삿자 기본타입이다.
		
		// 틀린 정답은 A, C, E

	}

}
