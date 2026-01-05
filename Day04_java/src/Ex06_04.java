/*
 * 06장.반복문.pdf No.21쪽 4번문제)
 * A부터 Z까지의 알파벳 출력하는 자바 프로그램을 작성해 본다. 
 * (단, 하나의 for 반복문과 int 타입을 사용해야 하고, 또 하나는 for 반복문과 char 타입을 사용해야 한다. 
 * 자바에서 증감 연산자(++,--)는 자료 손실이 없는 더 큰 타입으로 자동형 변환하는 자동 산술법이 적용 안된다.)
 */
public class Ex06_04 {

	public static void main(String[] args) {

		int i;
		for (i = 65; i <= 90; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();

		char ch;
		for (ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		
		
		System.out.print("\n ======================================== \n");
		
		//int 타입
		for(i = 65; i<=90; i++) {//'A'단일문자에 해당하는 십진수 정수값은 65, 'Z'에 대한 십진수 정수는 90
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		
		
	}

}
