// src/main/java/com/example/middle_spring/mappers/memberMapper.java
package com.example.middle_spring.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
    @Select("SELECT * FROM zipcode WHERE dong LIKE '%' OR #{dong} OR '%'")
    List < ZipcodeDTO > zipFind(String dong);
}
 