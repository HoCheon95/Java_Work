package com.example.middle_spring.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.middle_spring.dto.BbsDTO;
import com.example.middle_spring.dto.FileDTO;

@Mapper
public interface bbsMapper {

    /* 다음시퀀스 번호 */
    //newbbs_no_seq 시퀀스로 부터 다음 시퀀스 번호값 가져오기
    @Select("select newbbs_no_seq.nextval from dual")
    int seqNumberNext();

    /* 게시글 DB 저장 */
    //주테이블인 tbl_newbbs 자료실 테이블에 레코드 저장
    @Insert("insert into tbl_newbbs (bbs_no, bbs_name, bbs_title, bbs_pwd, bbs_cont, bbs_ref, bbs_step,bbs_level, bbs_date)values(#{bbs_no}, #{bbs_name}, #{bbs_title}, #{bbs_pwd}, #{bbs_cont}, #{bbs_ref}, 0, 0, sysdate)")
    void bbsInsert(BbsDTO bbs);

    /* 첨부파일 존재시 상태값 변경 */
    //첨부파일이 있는 경우만 bbs_attached_file 컬럼 레코드값을 null에서 7로 수정한다. 즉 7이면 첨부파일이 있는 경우이고 null이면 첨부파일이 없다는 의미이다.
    @Update("update tbl_newbbs set bbs_attached_file=#{attachedNumber} where bbs_no=#{bbs_no}")
    void updateAttached_file(int attachedNumber, int bbs_no);

    /* 파일 정보 DB 저장 */
    @Insert("insert into tbl_newbbs_file (bbs_file_no, bbs_no, bbs_original_name, bbs_stored_name, bbs_file_path, bbs_file_size) values(file_no_seq.nextval, #{bbs_no}, #{bbs_original_name}, #{bbs_stored_name}, #{bbs_file_path}, #{bbs_file_size})")
    void insertFile(FileDTO fileDto);
}
