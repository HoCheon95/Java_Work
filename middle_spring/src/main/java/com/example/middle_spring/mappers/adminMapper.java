package com.example.middle_spring.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.middle_spring.dto.AdminDTO;
import com.example.middle_spring.dto.MemberDTO;

@Mapper
public interface adminMapper {

    /* 관리자 정보 저장 */
    @Insert("insert into admin values(#{admin_no}, #{admin_id}, #{admin_pwd}, #{admin_name}, sysdate)")
    int insertAdmin(AdminDTO ab);

    /* 관리자 로그인 인증 */
    @Select("select * from admin where admin_id=#{admin_id}")
    AdminDTO adminLogin(String admin_id);

    /* 관리자 회원관리 검색전 총회원수 또는 검색후 회원수 */
    @Select("SELECT COUNT(*) FROM member " +
        "WHERE ((CASE WHEN #{find_field} = 'mem_id' THEN mem_id " +
        "             WHEN #{find_field} = 'mem_name' THEN mem_name " +
        "             ELSE '1' END) LIKE #{find_name} " +
        "       OR #{find_name} IS NULL OR #{find_name} = '' OR #{find_name} = '%%')")
    int getMemberCount(MemberDTO findB);

    /* 관리자 회원관리 검색전 총회원목록 또는 검색후 회원목록 */
    @Select("SELECT * FROM " +
        "  (SELECT rowNum rNum, mem_id, mem_name, mem_phone01, mem_phone02, mem_phone03, mem_state, mem_date " +
        "   FROM (SELECT * FROM member " +
        "         WHERE ((CASE WHEN #{find_field} = 'mem_id' THEN mem_id " +
        "                      WHEN #{find_field} = 'mem_name' THEN mem_name " +
        "                      ELSE '1' END) LIKE #{find_name} " +
        "                OR #{find_name} IS NULL OR #{find_name} = '%%' OR #{find_name} = '') " + // 검색어 없을 때 전체조회 조건 추가
        "         ORDER BY mem_id ASC)) " +
        "WHERE rNum >= #{startrow} AND rNum <= #{endrow}")
    List < MemberDTO > getMemberList(MemberDTO findB);
}
