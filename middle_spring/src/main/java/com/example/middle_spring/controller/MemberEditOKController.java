package com.example.middle_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.mappers.memberMapper;
import com.example.middle_spring.pwdconv.PwdChange;

import jakarta.servlet.http.HttpSession;


/* 사용자 회원관리 회원정보 수정 완료 컨트롤러 */
@Controller
public class MemberEditOKController {

    @Autowired
    private memberMapper memberMapper; // 서비스 주입

    @RequestMapping("/member_edit_ok.do")
    public String mem_edit(MemberDTO m, HttpSession session, RedirectAttributes rttr) {

        // 1. 세션에서 로그인된 아이디 가져오기
        String id = (String)session.getAttribute("id");

        if(id==null){
            rttr.addFlashAttribute("msg", "다시 로그인하세요!");
            return "redirect:/member_login.do";
        }else{

            // 2. 폼에서 넘어온 비밀번호 암호화 및 세션 아이디 설정
            // m 객체에는 이미 폼에서 입력한 나머지 정보들이 자동으로 담겨 있습니다.
            m.setMem_id(id); 
            m.setMem_pwd(PwdChange.getPassWordToXEMD5String(m.getMem_pwd()));

            // 3. 서비스 호출하여 DB 정보 수정
            memberMapper.editMember(m);

            // 4. 결과 알림 메시지 설정
            rttr.addFlashAttribute("msg", "정보 수정했습니다!");

            // 5. 완료 후 수정 폼 페이지 주소로 리다이렉트 (주소 이동)
            return "redirect:/member_edit.do";
        }
    }
    

}
