package net.daum.dto;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class BoardDTO { //중간 데이터 저장빈 클래스 DTO -> tbl_board 테이블의 컬럼명(필드명)과 일치하는 DTO 빈클래스 멤버변수명 정의

    private int bno; //게시판 번호
    private String bname; //글쓴이
    private String btitle; //글제목
    private String bcont; //글내용
    private String bdate; //글등록날짜
}
