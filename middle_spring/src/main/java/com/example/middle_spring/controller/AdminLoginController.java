package com.example.middle_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/* 관리자 로그인 폼 이동 컨트롤러 */
@Controller
public class AdminLoginController {

    @RequestMapping("/admin_login.do")
    public String admin_login() {
        return "admin/admin_Login";
    }
    
}
