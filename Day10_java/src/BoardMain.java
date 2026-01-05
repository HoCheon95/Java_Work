/*
 * 람복 api를 사용한 데이터 저장빈 클래스 GuustBookDTO.java를 활용한 예제
 */

import net.daum.dto.GuestBookDTO;

public class BoardMain {

	public static void main(String[] args) {
		
		GuestBookDTO g = new GuestBookDTO("홍길동", "방명록 제목입니다.", "방명록 내용입니다.");
		//매개변수 3개짜리 오버로딩 된 생성자 호출
		
		System.out.println("글쓴이 : " + g.getWtiter());
		System.out.println("글제목 : " + g.getTitle());
		System.out.println("글내용 : " + g.getContent());

	}

}
