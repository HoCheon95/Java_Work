/* 자바에서 문자열은 다룰때는 String 내장 api 클래스형을 사용한다. 문자열을 표현할 때는 큰따옴표 "문자열"로 하고
 * 기본타입 8개 포함되지 않는 레퍼런스 참조형에 해당된다.
 */
public class DataEx06 {

	public static void main(String[] args) {
		
		String lunchFood = "국밥";
		System.out.println("오늘 먹을 점심메뉴는 ? " + lunchFood);
		
		String name = "홍길동";
		System.out.println("이름은 ? " + name);
		
		String addr = "대전시 중구 오류동 00아파트 00호";
		System.out.println("주소는 ? " + addr);
		
		String phone = "010-xxxx-xxxx";
		System.out.println("폰번호는 ? " + phone);
		
		String nickName = "호랑이 선생님";
		System.out.printf("닉네임은 ? %s \n", nickName);	// %s는 문자열 출력형태 지시자이다.
		
	}

}
