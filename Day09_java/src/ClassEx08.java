/* 생성자 또는 메서드 {} 블록내에서 클래스 소속의 멤버변수 중 인스턴스 변수와 생성자나 메서드 소속의 매개변수명이 동일 할 때
 * 인스턴스 변수명앞에 this.을 붙이면 구분이 되어져서 값이 저장된다.
 * 
 */

class Board08 {
	private String name; // 게시판 글쓴이
	private String title; // 게시판 글제목
	private String content; // 게시판 글내용

	public Board08() {
	} // 매개변수가 없는 기본생성자

	public Board08(String name, String title, String content) {
		this.name = name;
		this.title = title;
		this.content = content;
	}// 생성자 오버로딩
	
	public void print() {
		System.out.println("글쓴이 : " + name + ", 제목 : " + title + ", 내용 : " + content);
	}
}

public class ClassEx08 {

	public static void main(String[] args) {
		
		Board08 board = new Board08("홍길동", "게시판 제목입니다.", "게시판 내용입니다.");// 매개변수 3개짜리 오버로딩 된 생성자 호출
		board.print();

	}

}
