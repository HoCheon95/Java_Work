/*
 * 참조변수만 선언하고 null 이 대입된 상태에서 해당 클래스의 소속 멤버변수등에 접근하면 완전한 객체주소가 저장안된 
 * 상태이기 때문에 NullPointerException 예외 오류를 발생시킨다.
 */

class Board{
	String title = "게시판 글제목";
	String content = "게시판 글내용";
}// Board 게시판 클래스
public class TryEx04 {

	public static void main(String[] args) {
		
		Board b = null;
		
		try {
			System.out.println("제목 : " + b.title + ", 내용 : " + b.content);
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e);
			
			b = new Board();//객체주소가 저장된 참조변수
			System.out.println("제목 : " + b.title + ", 내용 : " + b.content);
		}
	}

}
