package com.example.middle_spring.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.middle_spring.dto.AdminDTO;

@Mapper
public interface admin {

    /* 관리자 정보 저장 */
    @Insert("insert into admin values(#{admin_no}, #{admin_id}, #{admin_pwd}, #{admin_name}, sysdate)")
    int insertAdmin(AdminDTO ab);

    /* 관리자 로그인 인증 */
    @Select("select * from admin where admin_id=#{admin_id}")
    AdminDTO adminLogin(String admin_id);
}