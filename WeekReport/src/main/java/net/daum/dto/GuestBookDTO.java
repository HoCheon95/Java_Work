package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

/*
    net.daum.dto -> 값 저장 메서드인 setter(), 값 반환 메서드인 getter() 가 포함된 중간 데이터 저장빈 클래스 DTO가 있는 패키지
    람복 라이브러리로 setter(), getter()메서드는 생략한다.
*/

@Setter //람복 라이브러리에 의해서 setter() 메서드 자동생성
@Getter //getter() 메서드 자동생성

public class GuestBookDTO {
    /*
        중간 데이터 저장빈 DTO -> guestbook 테이블의 컬럼명과 빈클래스 멤버변수명(인스턴스 변수명 -> 속성명)은 같게 한다.
        이유는 mybatis SQL 프레임웍을 다룰때 코드 라인을 줄이는 방법이다.
    */
   private int gno;         // 방명록 번호
   private String gname;    // 작성자 이름
   private String gtitle;   // 글제목
   private String gcont;    // 글내용
   private String gdate;    // 등록날짜
}
