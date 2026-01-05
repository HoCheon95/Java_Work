/* 자바의 실수 숫자 자료형(타입) 종류
 * 	float : 4바이트 크기이고, 저장되는 값 정밀도는 7자리이다. 값뒤에 접미라 f or F가 붙는다.
 * 	double : 8바이트 크기이고, 저장되는 값 정밀도는 15자리이다. 값뒤에 접미사 d or D가 붙는다. 이 점미사는 생략가능하다.
 */
public class DataEx04 {

	public static void main(String[] args) {
		
		float a = 100.10F;
		float b = 10.3f;
		System.out.println("float타입 값 출력 : " + a + ", " + b);
		
		double c = 10.5d;
		double d = 50.6D;
		double e = 100.20;
		System.out.println("double타입 값 출력 : " + c + ", " + d + ", " + e);
	}

}
