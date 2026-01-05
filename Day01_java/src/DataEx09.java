/* printf() 메서드와 함꼐 사용하는 다양한 출력형태 지시자 종류)
 * %b(true or false 인 boolean 타입), %d(십진수 정수), %o(8진수 정수 출력형태), %x or %X(16진수 정수 출력형태),
 * %f(10진수 실수), %e or %E(지수형태), %c(단일문자), %s(문자열)
 * 
 */
public class DataEx09 {

	public static void main(String[] args) {
		
		char c = 'A';	// 단일문자'A'는 십진수 정수 65
		System.out.printf("c = %c, %d \n", c, (int)c);
		
		int octNum = 010;	// 정수 숫자값 10앞에 접두어 숫자 0을 붙이면 8진수 정수상수 [상수 : 변하지 않는 값]
		System.out.printf("octNum = %o, %d %n", octNum, octNum);	// 10,8
																	// %n은 줄바꿈
		int hexNum = 0x10;	// 접두어 0x를 붙이면 16진수 정수 상수
		System.out.printf("hexNum = %x, %d \n", hexNum, hexNum);	//10, 16
		
		int binNum = 0b10;	// 접두어 0b를 붙이면 2진수 정수상수(자바 7버전에서 추가)
		System.out.printf("binNum = %s, %d \n", Integer.toBinaryString(binNum), binNum);	// "10", 2
		/* 
		 * 자바에서는 이진수 정수 출력형태 지시자는 없다. 그래서 내장 api클래스인 Integer하위의 정적메서드인
		 * toBinaryString(int i);를 활용해서 주어진 정수 인자값을 이진 문자열로 변경해 준다.
		 */
		
		System.out.println("\n=====================================\n");
		
		int finger = 10;
		
		System.out.printf("finger = [%5d] %n", finger);		// %5d는 총 5자리 표현 십진수 정수철력형태이고 오른쪽 기본정렬을 한다. 나머지 빈자리는 공백으로 채운다.
		System.out.printf("finger = [%-5d] \n", finger);	// %-5d는 총 5자리 표현 십진수 정수출력형태이고 왼쪽 기본정렬을 한다. 나머지 빈자리는 공백으로 채운다.
		System.out.printf("finger = [%05d] \n", finger);	// %05d는 총 5자리 표현 십진수 정수출력형태이고 오른쪽 기본정렬을 한다. 나머지 빈자리는 0으로 채운다.
	}

}
