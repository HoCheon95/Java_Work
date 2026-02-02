// src/main/java/com/example/middle_spring/mappers/memberMapper.java
package com.example.middle_spring.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.dto.ZipcodeDTO;

@Mapper // 스프링 부트가 이 인터페이스를 MyBatis 매퍼로 인식함
public interface memberMapper {

    // 1. 아이디 중복 체크 (idCheck)
    // XML 매퍼의 id="idCheck"와 일치해야 함
    @Select("SELECT * FROM member WHERE mem_id= #{id}")
    MemberDTO idCheck(String id);

    // 2. 우편번호 검색 (zipFind)
    // XML 매퍼의 id="zipFind"와 일치해야 함
    @Select("SELECT * FROM zipcode WHERE dong LIKE '%' || #{dong} || '%'")
    List < ZipcodeDTO > zipFind(String dong);

    // 3. 회원 가입 (insertMember)
    @Insert("INSERT INTO member(mem_id,mem_pwd,mem_name,mem_zip,mem_zip2,mem_addr,mem_addr2,mem_phone01,mem_phone02,mem_phone03,mail_id,mail_domain,mem_state,mem_date) VALUES(#{mem_id},#{mem_pwd},#{mem_name},#{mem_zip},#{mem_zip2},#{mem_addr},#{mem_addr2},#{mem_phone01},#{mem_phone02},#{mem_phone03},#{mail_id},#{mail_domain},1,sysdate)")
    void insertMember(MemberDTO dto);

    // 4. 비밀번호 찾기 (pwdFind)
    @Select("select * from member where mem_id=#{mem_id} and mem_name=#{mem_name}")
    MemberDTO findMemberByIdAndName(MemberDTO dto);
    
    // 5. 비밀번호 수정 (updateMemberPwd)
    @Update("update member set mem_pwd=#{mem_pwd} where mem_id=#{mem_id}")
    void updateMemberPwd(MemberDTO dto);

    // 6. 로그인 인증(loginCheck)
    @Select("select * from member where mem_id=#{mem_id} and mem_state=1")
    MemberDTO loginCheck(String id);

    // 7. 아이디에 해당하는 회원정보 가져오기 -> 사용자 회원관리 회원정보 수정
    @Select("select * from member where mem_id=#{mem_id}")
    MemberDTO getMember(String id);

    // 8. 사용자 회원관리 정보수정 완료
    @Update("update member set mem_pwd=#{mem_pwd}, mem_name=#{mem_name}, " +
            "mem_zip=#{mem_zip}, mem_zip2=#{mem_zip2}, mem_addr=#{mem_addr}, " +
            "mem_addr2=#{mem_addr2}, mem_phone01=#{mem_phone01}, " +
            "mem_phone02=#{mem_phone02}, mem_phone03=#{mem_phone03}, " +
            "mail_id=#{mail_id}, mail_domain=#{mail_domain} " +
            "where mem_id=#{mem_id}")
    void editMember(MemberDTO dto);

    // 9. 회원탈퇴
    @Update("update member set mem_delcont=#{mem_delcont}, mem_state=2, mem_deldate=sysdate where mem_id=#{mem_id}")
    void delMember(MemberDTO dm);
}
