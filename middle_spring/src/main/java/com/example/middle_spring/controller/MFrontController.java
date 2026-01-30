package com.example.middle_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MFrontController {

    @RequestMapping("/member_login.do")
    public String member_login() {
        // 경로: prefix(/WEB-INF/views/) + 리턴값 + suffix(.jsp)
        // 실제 파일이 views/member/member_Login.jsp 이므로 아래와 같이 리턴해야 합니다.
        return "member/member_Login";
    }

    @RequestMapping("/member_join.do")
    public String member_join(Model model) {
         String[] phone = {"010","019"};
        String[] email = {"naver.con", "daum.net", "gmail.com", "직접입력"};
        model.addAttribute("phone", phone);
        model.addAttribute("email", email);
        
        // 실제 파일이 WEB-INF/views/member/mamber_Join.jsp 이므로 경로와 대소문자 정확히 입력
        return "member/mamber_Join";
    }
}
