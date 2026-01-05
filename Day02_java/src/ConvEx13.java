/*
 * char 단일문자 타입 값은 십진수 정수로 저장된다. 이를 활용한 예제 소스
 */
public class ConvEx13 {

	public static void main(String[] args) {
		
		char a = 'a';	//'a'는 십진수 정수 97로 저장
		char d = 'd';	//'d'는 십진수 정수 100
		char zero = '0';	//'0'은 십진수 정수 48
		char two = '2';	//'2'는 십진수 정수 50
	
		System.out.printf("'%c' - '%c' = %d\n", d, a, d-a);	//%c는 단일문자 출력형태 100-97=3
		System.out.printf("'%c' - '%c' = %d\n", two, zero, two-zero);	//50-48=2
		
		/*
		 * 문제) 영문소문자 단일문자 'a'를 영문 대문자 'A'로 변환하는 자바프로그램을 만들어 본다.
		 * 힌트) 단일문자에 해당하는 십진수 정수값을 활용하면 된다.
		 */
		
		//'a'는 십진수 정수 97 'A'는 십진수 정수 65 
		
		System.out.printf("'%c' -> '%c'\n", a, a-32);	// 97-32 = 65

	}

}
