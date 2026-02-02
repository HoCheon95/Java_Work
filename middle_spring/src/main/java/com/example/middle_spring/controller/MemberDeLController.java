package com.example.middle_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.service.MemberService;

import jakarta.servlet.http.HttpSession;


@Controller
public class MemberDeLController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/member_del.do")
    public String memdel(HttpSession session, RedirectAttributes rttr, Model model) {
        
        String id = (String)session.getAttribute("id");

        if(id == null){
            rttr.addFlashAttribute("다시 로그인 하세요!");
            return "redirect:/member_login.do";
        }else{
            // DB에서 회원 정보 가져오기
            MemberDTO m = memberService.getMember(id);

            // JSP에서 사용할 키값 "dm"으로 저장
            model.addAttribute("dm", m);

            return "member/member_Del"; // 뷰페이지 이동
        }
    }
}
