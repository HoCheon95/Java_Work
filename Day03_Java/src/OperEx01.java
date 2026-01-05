/*
 * 1. 자바의 논리 부정 연산자 !
 * 2. 삼항조건 연산자 에 대한 실습 소스
 */
public class OperEx01 {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		System.out.printf("flag = %b\n", flag);	//%b는 true or false boolean 타입 출력형태이다.
		System.out.printf("!true : %b\n", !flag);	//!true -> false
		System.out.printf("!!true : %b\n", !!flag);	//!!true -> !false -> true
		
		//삼항조건 연산자 실습
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = (x >= 0)? x : -x;	//10이 대입 저장
		absY = (y >= 0)? y : -y;	//5가 대입 저장
		absZ = (z >= 0)? z : -z;	//0이 대입 저장
		
		signX = (x > 0) ? '+' : ((x == 0) ? ' ' : '-');	//+
		signY = (y > 0) ? '+' : ((y == 0) ? ' ' : '-');	//-
		signZ = (z > 0) ? '+' : ((z == 0) ? ' ' : '-');	//' '
		
		System.out.printf("x = %c%d\n", signX, absX);	// +10
		System.out.printf("y = %c%d\n", signY, absY);	// -5	%c는 단일문자 출력, %d는 십진수 정수 출력
		System.out.printf("z = %c%d\n", signZ, absZ);	// 0
		

	}

}
