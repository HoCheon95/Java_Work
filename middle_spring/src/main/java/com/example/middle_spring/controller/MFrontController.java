/* package com.example.middle_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MFrontController {

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
 */