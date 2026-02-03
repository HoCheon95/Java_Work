package com.example.middle_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;


/* 관리자 로그아웃 컨트롤러 */
@Controller
public class AdminLogOutController {

    @RequestMapping("/admin_logout.do")
    public String admin_logout(HttpSession session, RedirectAttributes rttr) {

        // 1. 세션 무효화(모든 로그인 정보 삭제)
        session.invalidate();

        //2. 알림 메시지
        rttr.addFlashAttribute("mgs", "관리자 로그아웃 되었습니다!");
        
        return "redirect:/admin_login.do";
    }
    

}
