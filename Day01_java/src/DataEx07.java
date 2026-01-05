/*
 * 변수 선언과 변수값 바꾸기 실습 소스
 */
public class DataEx07 {

	public static void main(String[] args) {
		
		int year = 2020;	// 년도값 저장
		int age = 19;		// 나이 저장
		
		System.out.printf("년도 : %d \n", year);	// %d는 십진수 정수 출력형태
		System.out.println("나이 : " + age + "세");
		
		year = year + 4;	// +는 덧셈하는 수학산술 연산자 -> 2020 + 4 = 2024
		System.out.printf("증가한 년도 : %d년\n", year);
		
		System.out.println("\n==================================== \n");	// \n은 줄바꿈하라는 이스케이프 문자이다.
		
		// 변수값 변경 예제
		int a = 10;
		int b = 20;
		int tmp = 0;
		
		System.out.println("a = " + a + ", b = " + b);
		
		tmp = a;
		a = b;		// a변수값이 10에서 20으로 변경
		b = tmp;	// b변수값이 20에서 10으로 변경
		
		System.out.printf("변경된 a변수값 = %d, 변경된 b변수값 = %d\n", a, b);

	}

}
