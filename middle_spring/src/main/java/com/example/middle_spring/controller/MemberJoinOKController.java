package com.example.middle_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.pwdconv.PwdChange;
import com.example.middle_spring.mappers.memberMapper;




/* 회원 저장 컨트롤러 */
@Controller
public class MemberJoinOKController {
    @Autowired
    private memberMapper member_mapper; // 매퍼 주입

    @PostMapping("/member_join_ok.do")
    public String joinOk(MemberDTO memberDTO, Model model) {

        MemberDTO dto = memberDTO;
        dto = memberDTO;
        dto.setMem_pwd(PwdChange.getPassWordToXEMD5String(dto.getMem_pwd()));
        member_mapper.insertMember(dto);

        System.out.println(memberDTO.getMem_pwd());
        return "member/member_Login";
    }
}
