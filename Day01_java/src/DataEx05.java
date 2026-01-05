/* printf() 메서드는 다양한 출력형태를 표현하고자 jdk 1.5(자바 5) 버전에서 추가됨.
 * 출력형태 지시자 종류)
 * %c -> 단일문자 출력형태
 * %d -> 십진수 정수숫자 출력형태
 */
public class DataEx05 {

	public static void main(String[] args) {
		
		char x;	//단일문자 타입 x변수 선언
		x = 'A';	// 'A'는 십진수 정수 65로 저장됨
		System.out.printf("%c -> %d \n", x, (int)x);	// \n은 줄바꿈
		
		x = 'a';	// 'a'는 십진수 97정수 저장됨
		System.out.printf("%c -> %d \n", x, (int)x);
		
		x = '7';	// '7'은 십진수 정수 55로 저장됨
		System.out.printf("%c -> %d \n", x, (int)x);

	}

}
