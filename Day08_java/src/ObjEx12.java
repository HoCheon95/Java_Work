/**
 * 레퍼런스 변수만 선언하고 null만 대입된 상태에서 클래스 소속의 멤버변수에 접근하면 NullPointerException
 * 예외 오류가 발생한다. 이런 경우 정상적인 컴파일은 되고 바이트코드 클래스파일도 만들어 진다. 하지만 이 클래스가
 * 실행시 예외오류가 난다.
 */

class MyDate12{
	int year = 2026;
	int month = 1;
	int date = 1;
}// MyDate12 class

public class ObjEx12 {

	public static void main(String[] args) {
		
		MyDate12 d = null;
		System.out.println(d.year + "년 " +  d.month + "월 " +  d.date + "일");

	}

}
