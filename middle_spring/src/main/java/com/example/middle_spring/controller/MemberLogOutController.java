package com.example.middle_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import jakarta.servlet.http.HttpSession;

/* 사용자 회원관리 로그아웃 컨트롤러 */
@Controller
public class MemberLogOutController {

    @RequestMapping("/member_logout.do")
    public String logout(HttpSession session, RedirectAttributes rttr) {
        // 1. 세션 무효화 (모든 로그인 정보 삭제)
        session.invalidate();

        //2. 알림 메시지
        rttr.addFlashAttribute("msg", "로그아웃 되었습니다!");  

        return "redirect:/member_login.do";
    }

}
