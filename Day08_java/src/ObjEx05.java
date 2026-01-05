/*
 * 참조(레퍼런스)변수만 선언하고 객체주소가 저장 안된 상태에서 해당 참조변수는 클래스 내의 멤버변수(속성)에 접근 못 한다.
 */

class Board05{
	String writer = "홍길동"; 	// 글쓴이
	String title = "게시판 글제목"; 	// 글제목
	String content = "게시판 글내용"; //글내용
}//Board05 class

public class ObjEx05 {

	public static void main(String[] args) {
		
		Board05 board;	// 객체주소가 저장 안된 참조변수
		System.out.println("글쓴이 : " + board.writer + ", 글제목 : " + board.title + "글내용 : " + board.content);
		
		board = new Board05(); 	// 객체주소가 저장된 참조변수 board -> 객체명이라고도 한다.
		System.out.println(board.writer + ", " + board.title + ", " + board.content);
	}

}
