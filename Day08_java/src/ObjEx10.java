/**
 * 참조변수만 선언하고 객체주소를 대입 안하면 초기화가 되지 않아서 해당 클래스의 멤버변수(속성)에 접근 못한다.
 */

class Member10 {
	String mem_id = "abc"; 		// 아이디
	String mem_name = "홍길동"; 	// 회원이름
}

public class ObjEx10 {

	public static void main(String[] args) {
		
		Member10 member; // 참조변수 member 선언 | 메인 메서드 안에서 선언한 참조변수는 '지역변수'이다.
		/*
		 * 참조변수 member만 선언하고 객체주소를 대입하지 않으면 해당 변수는 지역변수라서 클래스 소속의 멤버변수처럼
		 * 기본값 null로 초기화가 안된다. 이런 경우 해당 참조변수 member로 Member10 클래스 소속의 멤버변수인 속성에
		 * 접근하면 초기화가 되지 않아서 컴파일 에러가 발생한다.
		 * 만약 클래스 소속의 멤버변수라면 기본값 null로 초기화가 되고 해당 멤버변수로 접근하면 컴파일은 되지만
		 * 예외 오류가 발생한다.
		 * 지역변수는 기본 초기값이 없다. 그러므로 선언과 동시에 명시적인 코드로 초기화를 해야 한다.
		 */
		
		System.out.println("아이디 : " + member.mem_id + ", 회원이름 : " + member.mem_name);
		

	}

}
