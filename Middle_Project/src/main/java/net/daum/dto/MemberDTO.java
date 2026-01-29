package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberDTO {
    /*
    사용자 회원관리 중간 데이터 저장빈 클래스
    member테이블의 컬럼명과 빈클래스 변수명, member_Join.jsp 회원가입폼 네임 피라미터 이름을 되도록
    이면 같게한다. 이유는 코드라인을 줄일 수 있기 때문이다.
     */

    private String mem_id;//회원아이디
    private String mem_pwd;//암호화된 비번
    private String mem_name; //회원이름
    private String mem_zip; //첫번째 우편번호
    private String mem_zip2; //두번쨰 우편번호
    private String mem_addr; //주소
    private String mem_addr2; //나머지 주소
    private String mem_phone01; //첫번째 폰번호
    private String mem_phone02; //두번째 폰번호
    private String mem_phone03; //세번째 폰번호
    private String mail_id;//메일 아이디
    private String mail_domain;//메일 도메인
    private String mem_date; //가입날짜
    private int mem_state; //가입 회원이면1, 탈퇴 회원이면2
    private String mem_delcont; //탈퇴사유
    private String mem_deldate; //탈퇴날짜

    //페이징(쪽나누기) 관련변수 -> 관리자 회원목록에서 필요함
    private int startrow; //시작행 번호
    private int endrow; //끝행 번호

    //검색기능 -> 관리자 회원목록에서 필요
    private String find_name;//검색어
    private String find_field;//검색필드
}
