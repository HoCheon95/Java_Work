package com.example.middle_spring.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
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

    /* 검색 전 총 레코드 개수 */
    @Select("SELECT COUNT(bbs_no) FROM tbl_newbbs " +
        "WHERE ( " +
        "  (CASE " +
        "     WHEN #{find_field} = 'bbs_title' THEN bbs_title " +
        "     WHEN #{find_field} = 'bbs_cont' THEN bbs_cont " +
        "   END LIKE #{find_name}) " +
        "   OR #{find_field} = '' OR #{find_field} IS NULL " +
        ")")
    int getRowCount(BbsDTO findB);

    /* 게시판 페이징 목록 조회 (검색 포함) */
    @Select("SELECT * FROM ( " +
        "  SELECT rowNum rNum, bbs_no, bbs_name, bbs_title, bbs_hit, " +
        "         bbs_Ref, bbs_step, bbs_level, bbs_date, bbs_attached_file " +
        "  FROM ( " +
        "    SELECT * FROM tbl_newbbs " +
        "    WHERE ( " +
        "      (CASE " +
        "        WHEN #{find_field} = 'bbs_title' THEN bbs_title " +
        "        WHEN #{find_field} = 'bbs_cont' THEN bbs_cont " +
        "      END LIKE #{find_name}) " +
        "      OR #{find_field} = '' OR #{find_field} IS NULL " +
        "    ) " +
        "    ORDER BY bbs_ref DESC, bbs_level ASC " +
        "  ) " +
        ") WHERE rNum >= #{startrow} AND rNum <= #{endrow}")
    List < BbsDTO > getBbsList(BbsDTO findB);

    /* 1. 조회수 증가 */
    @Update("UPDATE tbl_newbbs SET bbs_hit=bbs_hit+1 WHERE bbs_no=#{bbs_no}")
    void updateHit(int bbs_no);

    /* 2. 내용보기 (조회수 증가와 별개로 데이터만 가져옴) */
    @Select("SELECT * FROM tbl_newbbs WHERE bbs_no=#{bbs_no}")
    BbsDTO getBbsCont(int bbs_no);

    /* 3. 조회수 증가 없는 내용보기 (수정/삭제 폼 등) */
    @Select("SELECT * FROM tbl_newbbs WHERE bbs_no=#{bbs_no}")
    BbsDTO setBbsCont2(int bbs_no);

    /* 4. 파일 정보 조회 (컨트롤러에서 사용 중) */
    @Select("SELECT * FROM tbl_newbbs_file WHERE bbs_no=#{bbs_no}")
    List < FileDTO > getFileInfo(int bbs_no);

    /* 5. 답변글 출력 순서 재설정 */
    /*
    답변을 달면 원래 그 자리에 있던 다른 답변글들은 아래로 한 칸씩 내려가야 한다.
    그래서 같은 그룹(ref) 안에서, 현재 답변보다 밑에 있어야 할 글들의 순서 번호(level)를 모두 
    +1씩 더해서 뒤로 밀어내는 과정
     */
    @Update("UPDATE tbl_newbbs SET bbs_level=bbs_level+1 WHERE bbs_ref=#{bbs_ref} and bbs_level > #{bbs_level}")
    void updateReplyStep(BbsDTO bbsdata);

    /* 6. 답변글 레코드 삽입 */
    /*
    위의 작업으로 자리가 비워졌으니, 답변을 저장
    작성된 답변 데이터를 테이브렝 저장
    bbs_ref: 원본글과 같은 번호를 써서 한 가족임을 표시
    bbs_step: 원본글보다 한 칸 더 오른쪽으로 들여쓰기 위해 +1 사용
    bbs_level: 원본글 바로 다음 줄에 나오게 하기 위해 +1 사용
     */
    @Insert("INSERT INTO tbl_newbbs (bbs_no, bbs_name, bbs_title, bbs_pwd, bbs_cont, bbs_ref, bbs_step, bbs_level, bbs_date) VALUES(newbbs_no_seq.nextval, #{bbs_name}, #{bbs_title}, #{bbs_pwd}, #{bbs_cont}, #{bbs_ref}, #{bbs_step}+1, #{bbs_level}+1, sysdate)")
    void insertReply(BbsDTO bbsdata);

    /* 7. 자료실 번호를 기준으로 글쓴이, 글제목, 글내용만 수정*/
    @Update("update tbl_newbbs set bbs_name=#{bbs_name}, bbs_title=#{bbs_title}, bbs_cont=#{bbs_cont} where bbs_no=#{bbs_no}")
    void editBbs(BbsDTO bbsdata);

    /* 8. 번호를 기준으로 tbl_newbbs_file테이블로 부터 기존 첨부파일목록 정보를 삭제한다. */
    @Delete("delete from tbl_newbbs_file where bbs_no=#{bbs_no}")
    void delFileList(int bbs_no);

    // 9. 게시물 번호로 게시물 정보(비밀번호 포함) 가져오기
    @Select("select * from tbl_newbbs where bbs_no = #{bbs_no}")
    BbsDTO getBbsCont2(int bbs_no);

    // 10. 게시물 본문 삭제
    @Delete("delete from tbl_newbbs where bbs_no=#{bbs_no}")
    void bbsDelete(int bbs_no);


}
