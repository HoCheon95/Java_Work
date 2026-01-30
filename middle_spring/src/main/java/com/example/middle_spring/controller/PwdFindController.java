package com.example.middle_spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/* 비밀번호 찾기 컨트롤러 */
@Controller
public class PwdFindController {

    @GetMapping("/pwd_find.do")
    public String get_pwdFind() {
        return "member/pwd_find";
    }
}
