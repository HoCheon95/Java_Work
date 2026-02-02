package com.example.middle_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import jakarta.servlet.http.HttpSession;


@Controller
public class IndexController {
    
    @RequestMapping("/index.do")
    public String index(HttpSession session, RedirectAttributes rttr) {

        //1. 세션에서 아이디 구함
        String id = (String)session.getAttribute("id");

        // if(id == null){
        //     //로그인 안 된 경우 알림 메시지와 로그인창으로 이동
        //     rttr.addFlashAttribute("msg", "다시 로그인 하세요!");
        //     return "redirect:/member_login.do";
        // }

        //2. 로그인 된 경우 메인 페이지(JSP) 호출
        return "member/member_Login";
    }
    
}
