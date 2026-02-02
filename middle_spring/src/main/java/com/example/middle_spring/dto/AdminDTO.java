package com.example.middle_spring.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdminDTO {//admin 관리자 테이블 컬럼명과 일치하는 변수명을 가진 데이터 저장빈 클래스 정의

    private int admin_no;
    private String admin_id;  //관리자 아이디
    private String admin_pwd; //관리자 비번
    private String admin_name; //관리자 이름
    private String admin_date; //등록날짜

}
