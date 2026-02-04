package com.example.middle_spring.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FileDTO {
    /* 첨부된 파일정보를 저장하는 데이터 저장빈 클래스, tbl_newbbs_file 테이블의 컬럼명과 일치하는 변수명을 가진 데이터 저장 빈클래스 */

    private int bbs_file_no; //첨부된 파일의 수정, 삭제등을 위한 번호
    private int bbs_no; //외래키로 설정된 자료실 번호
    private String bbs_original_name; //첨부된 원본파일명
    private String bbs_stored_name; //중복방지를 위해서 변경된 파일명
    private String bbs_file_path; //첨부파일 경로
    private long bbs_file_size; //첨부된 파일 크기
    private String upload_date; //파일 첨부된 날짜
}
